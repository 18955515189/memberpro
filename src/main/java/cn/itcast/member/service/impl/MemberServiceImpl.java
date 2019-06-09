package cn.itcast.member.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.member.dao.MemberDao;
import cn.itcast.member.entity.Member;
import cn.itcast.member.service.MemberService;
/**
 * 会员业务逻辑类
 * @author Administrator
 *
 */
@Service
public class MemberServiceImpl implements MemberService {

	@Resource
	private MemberDao memberDao;
	
	@Override
	public List<Member> findBySn(String sn) {
		
		return memberDao.findBySn(sn);
	}

	@Override
	public void save(Member member) {
		member.setPoint(0);
		memberDao.save(member);		
	}

}
