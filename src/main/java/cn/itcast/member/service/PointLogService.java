package cn.itcast.member.service;

import cn.itcast.member.entity.PointLog;

/**
 * 积分日志业务逻辑接口
 * @author Administrator
 *
 */
public interface PointLogService {

	/**
	 * 增加积分
	 * @param point
	 */
	public void add(PointLog pointLog);
	
}
