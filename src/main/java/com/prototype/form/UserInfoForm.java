package com.prototype.form;

import lombok.Data;

@Data
public class UserInfoForm {
    private String userid;
    private String username;
    private String userpswd;
    private String userclass;
    private String modurl;
    private String rmurl;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpswd() {
		return userpswd;
	}
	public void setUserpswd(String userpswd) {
		this.userpswd = userpswd;
	}
	public String getUserclass() {
		return userclass;
	}
	public void setUserclass(String userclass) {
		this.userclass = userclass;
	}
	public String getModurl() {
		return modurl;
	}
	public void setModurl(String modurl) {
		this.modurl = modurl;
	}
	public String getRmurl() {
		return rmurl;
	}
	public void setRmurl(String rmurl) {
		this.rmurl = rmurl;
	}

}
