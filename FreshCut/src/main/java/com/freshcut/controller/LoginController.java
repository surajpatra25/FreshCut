package com.freshcut.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.freshcut.bean.EmployeeBean;
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
	@RequestMapping("/employeeLogin")
	public ModelAndView Login(@ModelAttribute("command") EmployeeBean employee, HttpServletRequest request, HttpServletResponse response) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken)) {
		    /* The user is logged in :) */
		    //return validateLogin(fmsUserBean, request, response);
		}
		
		ModelAndView loginModel = new ModelAndView("employeeSignIn");
		loginModel.addObject("validatelogin", "");
		return loginModel;
	}
}
