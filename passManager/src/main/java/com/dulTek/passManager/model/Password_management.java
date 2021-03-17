package com.dulTek.passManager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Service;

@Service
@Entity
@Table(name = "userspasswords")
public class Password_management {
	@Id
	//@Column(name = "", updatable = false)
	private String username;
	private String web_url;
	private String web_username;
	private String web_password;
	//private Password_generator password;
	
	public Password_management() {
	}
	public Password_management(String web_url, String web_username, String web_password, String username) {
		this.web_url = web_url;
		this.web_username = web_username;
		this.web_password = web_password;
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getWeb_url() {
		return web_url;
	}
	public void setWeb_url(String web_url) {
		this.web_url = web_url;
	}
//	public Password_generator getPassword() {
//		password.setNum_of_password(1);
//		password.randomPassword();
//		String[] str = password.getRandomPasswords();
//		System.out.println("pass man pass is: "+str[0]);
//		return password;
//	}
//	public void setPassword(Password_generator password) {
//		this.password = password;
//	}
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
