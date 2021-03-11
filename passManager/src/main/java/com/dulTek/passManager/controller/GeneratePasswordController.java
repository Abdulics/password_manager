package com.dulTek.passManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dulTek.passManager.model.Password_generator;

@Controller
public class GeneratePasswordController {

	@RequestMapping("passGen")
	public ModelAndView passGen(Password_generator pwg) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", pwg);
		mv.setViewName("home");
		System.out.println("Length is: "+pwg.getLength());
		System.out.println("Generated password is: "+pwg.getRandomPasswords());
		return mv;
	}
}
