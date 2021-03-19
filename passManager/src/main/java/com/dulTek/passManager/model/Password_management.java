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
	//@Column(name = "id", updatable = false)
	//private Long id;
	private String username;
	private String webUrl;
	private String webUsername;
	private String webPassword;
	//private Password_generator password;
	
	public Password_management() {
	}
	public Password_management(String web_url, String web_username, String web_password, String username) {
		this.webUrl = web_url;
		this.webUsername = web_username;
		this.webPassword = web_password;
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getWebUrl() {
		return webUrl;
	}
	public void setWebUrl(String web_url) {
		this.webUrl = web_url;
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
	public String getWebUsername() {
		return webUsername;
	}
	public void setWebUsername(String web_username) {
		this.webUsername = web_username;
	}
	public String getWebPassword() {
		return webPassword;
	}
	public void setWebPassword(String web_password) {
		this.webPassword = web_password;
	}
	
	
	@Override
	public String toString() {
		return "password_management [web_url=" + webUrl + ", web_username=" + webUsername + ", web_password="
				+ webPassword + "]";
	}
}
