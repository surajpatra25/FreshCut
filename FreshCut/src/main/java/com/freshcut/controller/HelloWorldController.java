package com.freshcut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
	String msg = "Welcome to Spring MVC!";
 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String fName) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("message", msg);
		mv.addObject("name", fName);
		return mv;
	}
}
