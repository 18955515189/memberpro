package cn.itcast.member.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.member.entity.Member;
import cn.itcast.member.entity.Result;
import cn.itcast.member.service.MemberService;

@Controller
@ResponseBody
@RequestMapping("/member")
public class MemberController {
	
	@Resource
	private MemberService memberService;
	
	
	@RequestMapping("/sn/{sn}")
	public List<Member> findBySn(@PathVariable String sn){
		return memberService.findBySn(sn);
	}
	
	@RequestMapping("/save")
	public Result save(Member member){
		try {
			memberService.save(member);
			return new Result(true, "保存成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Result(false, "保存失败");
		}
	}

}
