package cn.itcast.member.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 积分日志实体类
 * @author Administrator
 *
 */
@Entity
public class PointLog {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;//流水号
	private Date exetime;//执行时间
	private String sn;//会员卡号
	private Integer point;//  积分
	private String remark;//备注
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getExetime() {
		return exetime;
	}
	public void setExetime(Date exetime) {
		this.exetime = exetime;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}
