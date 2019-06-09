package cn.itcast.member.entity;
/**
 * 消息返回结构体
 * @author Administrator
 *
 */
public class Result {

	private boolean success;//是否成功
	private String message;//消息
	
	public Result(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
