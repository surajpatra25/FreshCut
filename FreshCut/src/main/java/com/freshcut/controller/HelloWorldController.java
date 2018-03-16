package com.freshcut.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.freshcut.model.Coupons;
import com.freshcut.service.WelComeService;
 
@Controller
public class HelloWorldController {
	@Autowired
	WelComeService welcomeService;
	
	String msg = "Welcome to Spring MVC!";
	@RequestMapping("welcome")
	public ModelAndView homePage() {
		System.out.println("in controller");
        List<Coupons> coupons = new ArrayList<Coupons>();
        coupons = welcomeService.getCoupons();
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("coupons", coupons);
		return mv;
	}
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
