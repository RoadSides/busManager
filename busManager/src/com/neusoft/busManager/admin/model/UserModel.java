package com.neusoft.busManager.admin.model;

import org.apache.ibatis.type.Alias;

@Alias("User")
public class UserModel {
	private String userid;
	private String password;
	private String name;
	

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
