package com.dulTek.passManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dulTek.passManager.model.Password_generator;
import com.dulTek.passManager.model.Password_management;
import com.dulTek.passManager.service.PasswordService;
import com.dulTek.passManager.service.UserService;

@Controller
public class PasswordManagementController {
	
	@Autowired
	Password_management mgn;
	@Autowired
	private PasswordService service;
	@RequestMapping("management")
	public ModelAndView passGen(@ModelAttribute("managedPass")Password_management pm) {
		ModelAndView mv = new ModelAndView();
		service.save(pm);
		//mv.addObject("pm", pm);
		mv.setViewName("userpage");
		return mv;
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
	public ModelAndView loggedPassGen(@ModelAttribute("generatedpasswords")Password_generator pwg,@ModelAttribute("managedPass")Password_management mgn) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("generatedpasswords", pwg);
		mv.addObject("managedPass", mgn);
		mv.setViewName("userpage");
		pwg.setRandomPasswords(pwg.getLength());
		pwg.setNumpasswords(pwg.getNumpasswords());
		pwg.randomPassword();
		String[] p = pwg.getRandomPasswords();
		System.out.println("Length is: "+pwg.getLength());
		System.out.println("Generated password is: "+p[0]);
		return mv;
	}
}
