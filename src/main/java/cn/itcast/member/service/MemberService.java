package cn.itcast.member.service;

import java.util.List;

import cn.itcast.member.entity.Member;

/**
 * 会员业务逻辑层接口
 * @author Administrator
 *
 */
public interface MemberService {

	/**
	 * 根据会员卡号查询会员列表
	 * @param sn
	 * @return
	 */
	public List<Member> findBySn(String sn);
	
	/**
	 * 新增会员
	 * @param member
	 */
	public void save(Member member);
	
}
