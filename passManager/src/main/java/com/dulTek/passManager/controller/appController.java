package com.dulTek.passManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dulTek.passManager.model.Password_generator;

@Controller
@RequestMapping("/")
public class appController {
	@Autowired
	Password_generator gen;
	@GetMapping
	public String home(Model model) {
		String[] randomPasswords = new String[5];
		randomPasswords[0] = "passwords will be populated here";
		gen.setRandomPasswords(randomPasswords);
		model.addAttribute("generatedpasswords", gen);
		return "home";
	}
	
	
}
