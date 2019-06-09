package cn.itcast.member.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 会员实体类
 * @author Administrator
 *
 */
@Entity
public class Member {

	@Id
	private String sn;//会员卡号
	private String name;//会员姓名
	private String sex;//会员性别
	private String phone;//电话
	private Integer point;//积分余额
	
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	
	
	
	
}
