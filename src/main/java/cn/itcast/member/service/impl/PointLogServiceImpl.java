package cn.itcast.member.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.jms.Queue;

import org.springframework.core.env.Environment;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.itcast.member.dao.MemberDao;
import cn.itcast.member.dao.PointLogDao;
import cn.itcast.member.entity.Member;
import cn.itcast.member.entity.PointLog;
import cn.itcast.member.entity.Sms;
import cn.itcast.member.service.PointLogService;
/**
 * 积分日志业务逻辑类
 * @author Administrator
 *
 */
@Service
public class PointLogServiceImpl implements PointLogService {

	@Resource
	private PointLogDao pointDao;
	
	@Resource
	private MemberDao memberDao;
	
	@Resource
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	@Resource
	private Queue sms_queue;
	
	@Resource
	private Environment env;
	
	@Override
	public void add(PointLog pointLog) {
		
		//修改member表中的积分数
		
		Member member = memberDao.findOne(pointLog.getSn());
		if(member==null){
			throw new RuntimeException("没有查询结果");
		}				
		member.setPoint(  member.getPoint()+ pointLog.getPoint()   );//加上变动的积分
		if(member.getPoint()<0){
			throw new RuntimeException("积分余额不足");
		}
				
		pointLog.setExetime(new Date());//设置执行时间为当前时间
		pointDao.save(pointLog);
		
		//将短信消息推送给 activeMQ
		
		try {
			Sms sms=new Sms();
			
			sms.setPhone(member.getPhone());//手机号
			sms.setTemplatCode(env.getProperty("sms.templatCode.point"));//短信模板ID
			
			Map<String,String> map=new HashMap<>();
			map.put("name", member.getName());
			map.put("sn", member.getSn());
			map.put("point", String.valueOf(pointLog.getPoint()));
			map.put("allpoint", String.valueOf(member.getPoint()));
			
			sms.setParamString(JSON.toJSONString(map));//参数字符串
			
			jmsMessagingTemplate.convertAndSend(sms_queue, sms);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
