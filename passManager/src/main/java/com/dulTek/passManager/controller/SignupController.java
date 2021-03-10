package com.dulTek.passManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/signup")
public class SignupController {
	
	@GetMapping
	public String signup() {
		return "signup";
	}
	
	@PostMapping
	public String postsignup(@RequestParam(name = "cancel") String name) {
		if(name.equalsIgnoreCase("cancel")) {
			System.out.println("Signup if executed...");
			return "home";
		}
		return "signup";
	}
}
