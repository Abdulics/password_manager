package com.dulTek.passManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dulTek.passManager.model.Password_generator;
import com.dulTek.passManager.model.Password_management;
import com.dulTek.passManager.model.UserDetails;
import com.dulTek.passManager.service.PasswordService;
import com.dulTek.passManager.service.UserService;

@Controller
public class PasswordManagementController {
	
	@Autowired
	Password_management mgn;
	@Autowired
	UserDetails uD;
	@Autowired
	private PasswordService service;
	@RequestMapping("management")
	public String passGen(@ModelAttribute("managedPass")Password_management pm, @ModelAttribute("userD") UserDetails ud,Model model) {
		//Model mv = new Model();
		service.save(pm);
		List<Password_management> passwords = service.getPasswords(ud.getUsername());
	    model.addAttribute("passwords", passwords);
		model.addAttribute("userD", ud);
		model.addAttribute("uname", pm.getUsername());
		return "passwords";
	}
	
	@RequestMapping("/passwordmanagement")
	public String getPass(@ModelAttribute("userD") UserDetails ud, Model model) {
		List<Password_management> passwords = service.getPasswords(ud.getUsername());
		
	    model.addAttribute("passwords", passwords);
		System.out.println("password mamager username is now: "+ud.getUsername());
		model.addAttribute("userD", ud);
		//System.out.println("passwordfrom data base are: "+passwords.get(0).getWebUrl());
		return "passwords";
	}
	
	
	@RequestMapping("passGen")
	public ModelAndView passGen(@ModelAttribute("generatedpasswords")Password_generator pwg) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("generatedpasswords", pwg);
		mv.setViewName("home");
		System.out.println("Length is: "+pwg.getLength());
		pwg.setRandomPasswords(pwg.getLength());
		pwg.setNumpasswords(pwg.getNumpasswords());
		pwg.randomPassword();
		String[] p = pwg.getRandomPasswords();
		System.out.println("Generated password is: "+p[0]);
		return mv;
	}
	
	@RequestMapping("loggedPassgen")
	public String loggedPassGen(@ModelAttribute("generatedpasswords")Password_generator pwg,
			@ModelAttribute("managedPass")Password_management mgn,
			@ModelAttribute("userDetails") UserDetails ud, Model model) {
		pwg.setRandomPasswords(pwg.getLength());
		pwg.setNumpasswords(pwg.getNumpasswords());
		pwg.randomPassword();
		model.addAttribute("generatedpasswords", pwg);
		model.addAttribute("managedPass", mgn);
		model.addAttribute("userD", ud);
		String[] p = pwg.getRandomPasswords();
		System.out.println("Length is: "+pwg.getLength());
		System.out.println("Generated password is: "+p[0]);
		System.out.println("Username from log is "+ ud.getUsername());
		return "userpage";
	}
	//passwordmanagement
}
