package cn.itcast.member.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.itcast.member.entity.PointLog;
/**
 * 积分日志数据访问类
 * @author Administrator
 *
 */
public interface PointLogDao extends JpaRepository<PointLog, Long> {

}
