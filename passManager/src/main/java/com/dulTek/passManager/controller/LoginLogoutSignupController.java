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

import com.dulTek.passManager.model.User;
import com.dulTek.passManager.service.UserService;

@Controller
public class LoginLogoutSignupController {
	
	@Autowired
	private UserService service;
	@Autowired
	private User user;
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/securedpage")
	public String securedPage() {
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
	
//	@PostMapping("/usersignup")
//	public String signup(@ModelAttribute("User") User user, Model model) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("uDetails", user);
//		mv.setViewName("signupComfirmation");
//		return "signupComfirmation";
//	}
	
	@RequestMapping(value = "/usersignup", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("user") User user) {
		System.out.println("First name is: " + user.getFirstName());
		System.out.println(user.toString());
	    service.save(user); 
	    return "redirect:/";
	}
}
