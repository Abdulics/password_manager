package com.dulTek.passManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dulTek.passManager.model.Password_generator;
import com.dulTek.passManager.model.User;
import com.dulTek.passManager.service.UserService;

@Controller
public class LoginLogoutSignupController {
	
	@Autowired
	Password_generator gen;
	@Autowired
	private UserService service;
	@Autowired
	private User user;
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/securedpage")
	public String securedPage(Model model) {
		model.addAttribute("generatedpasswords", gen);
		return "userpage";
	}
	
	@RequestMapping("/htmlpage")
	public String html() {
		return "htmlpage";
	}
	
	@RequestMapping("/html")
	public String logout() {
		return "login";
	}
	
	@RequestMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("user",user);
		return "signup";
	}
	
	@RequestMapping("/signupConfirmation")
	public String signupConfirmation() {
		return "signupConfirmation";
	}
	
//	@PostMapping("/usersignup")
//	public String signup(@ModelAttribute("User") User user, Model model) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("uDetails", user);
//		mv.setViewName("signupComfirmation");
//		return "signupComfirmation";
//	}
	
	//@RequestMapping(value = "/usersignup", method = RequestMethod.POST)
	@PostMapping("/usersignup")
	public String saveProduct(@ModelAttribute("user") User user) {
		//"redirect:/"
		System.out.println("First name is: " + user.getFirstName());
		System.out.println(user.toString());
	    service.save(user); 
	    return "signupConfirmation";
	}
}
