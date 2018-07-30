package com.lingnan.usersystem.usermgr.domain;

public class UserVo {
	private int id;  // 编号
	private String username; // 用户名
	private String pass;  // 密码
	private String sex;  // 性别
	private String phone;  // 电话
	private String supervalue; // 权限，1为管理员，2为普通用户
	private String status; // 状态，1为没有删除，0为已经被删除
	
	
	public UserVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserVo(String username, String pass, String sex,
			String phone, String supervalue, String status) {
		super();
		this.id = id;
		this.username = username;
		this.pass = pass;
		this.sex = sex;
		this.phone = phone;
		this.supervalue = supervalue;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
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
	public String getSupervalue() {
		return supervalue;
	}
	public void setSupervalue(String supervalue) {
		this.supervalue = supervalue;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "UserVo [id=" + id + ", username=" + username + ", pass=" + pass
				+ ", sex=" + sex + ", phone=" + phone + ", supervalue="
				+ supervalue + ", status=" + status + "]";
	}
	
	
}
