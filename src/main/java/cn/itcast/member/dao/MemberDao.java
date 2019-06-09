package cn.itcast.member.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.itcast.member.entity.Member;
/**
 * 会员数据访问层
 * @author Administrator
 *
 */
public interface MemberDao extends JpaRepository<Member, String> {

	/**
	 * 根据会员卡号查询会员列表
	 * @param sn
	 * @return
	 */
	public List<Member> findBySn(String sn);
	
}
