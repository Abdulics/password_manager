package com.dulTek.passManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class appController {
	
	@GetMapping
	public String home() {
		return "home";
	}
}
