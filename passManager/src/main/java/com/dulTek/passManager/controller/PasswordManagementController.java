package com.dulTek.passManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dulTek.passManager.model.Password_generator;
import com.dulTek.passManager.model.Password_management;

@Controller
public class PasswordManagementController {
	
	@RequestMapping("management")
	public ModelAndView passGen(Password_management pm) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("pm", pm);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("passGen")
	public ModelAndView passGen(Password_generator pwg) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", pwg);
		mv.setViewName("home");
		System.out.println("Length is: "+pwg.getLength());
		System.out.println("Generated password is: "+pwg.getRandomPasswords());
		return mv;
	}
	
	@RequestMapping("loggedPassgen")
	public ModelAndView loggedPassGen(Password_generator pwg) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", pwg);
		mv.setViewName("userpage");
		System.out.println("Length is: "+pwg.getLength());
		System.out.println("Generated password is: "+pwg.getRandomPasswords());
		return mv;
	}
}
