package com.freshcut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.freshcut.bean.LoginFormBean;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public ModelAndView login(@ModelAttribute LoginFormBean login) {
		
		ModelAndView mv = new ModelAndView("homePage");
		return mv;
	}
	@RequestMapping("/signup")
	public ModelAndView signup(@ModelAttribute LoginFormBean login) {
		
		ModelAndView mv = new ModelAndView("signup");
		return mv;
	}
}
