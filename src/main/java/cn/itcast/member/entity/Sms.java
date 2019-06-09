package cn.itcast.member.entity;

import java.io.Serializable;
/**
 * 短信实体类
 * @author Administrator
 *
 */
public class Sms implements Serializable{

	private String phone;//目标手机号
	private String templatCode;//模板编号
	private String paramString;//参数字符串（json）
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTemplatCode() {
		return templatCode;
	}
	public void setTemplatCode(String templatCode) {
		this.templatCode = templatCode;
	}
	public String getParamString() {
		return paramString;
	}
	public void setParamString(String paramString) {
		this.paramString = paramString;
	}
	
	
	
}
