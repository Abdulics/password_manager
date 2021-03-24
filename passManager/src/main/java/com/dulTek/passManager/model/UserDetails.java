package com.dulTek.passManager.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class UserDetails {
	private String username;
	private String passwords;
	
	public UserDetails(String username, String passwords) {
		this.username = username;
		this.passwords = passwords;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswords() {
		return passwords;
	}
	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}
	
	
}
