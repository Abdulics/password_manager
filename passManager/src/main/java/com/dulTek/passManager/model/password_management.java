package com.dulTek.passManager.model;

public class password_management {
	private String web_url;
	private String web_username;
	private String web_password;
	
	public String getWeb_url() {
		return web_url;
	}
	public void setWeb_url(String web_url) {
		this.web_url = web_url;
	}
	public String getWeb_username() {
		return web_username;
	}
	public void setWeb_username(String web_username) {
		this.web_username = web_username;
	}
	public String getWeb_password() {
		return web_password;
	}
	public void setWeb_password(String web_password) {
		this.web_password = web_password;
	}
	
	@Override
	public String toString() {
		return "password_management [web_url=" + web_url + ", web_username=" + web_username + ", web_password="
				+ web_password + "]";
	}
}
