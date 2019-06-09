package cn.itcast.member.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.member.entity.PointLog;
import cn.itcast.member.entity.Result;
import cn.itcast.member.service.PointLogService;

@Controller
@ResponseBody
@RequestMapping("/pointlog")
public class PointLogController {

	@Resource
	private PointLogService pointService;
	
	
	@RequestMapping("/add")
	public Result add(PointLog pointLog){		
		try {
			pointService.add(pointLog);
			return new Result(true, "增加积分成功");			
		} catch (RuntimeException e) {		
			e.printStackTrace();
			return new Result(false, e.getMessage());
		}catch (Exception e) {
		
			e.printStackTrace();
			return new Result(false, "增加积分失败");
		}	
	}
	
	
}
