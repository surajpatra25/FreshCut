package com.freshcut.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.freshcut.model.Coupons;
import com.freshcut.model.OnlineCheckIn;
import com.freshcut.model.User;
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
			@RequestParam(value = "Location", required = false, defaultValue = "World") String fName) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("message", msg);
		mv.addObject("name", fName);
		return mv;
	}
	@RequestMapping("/test")
	public ModelAndView showTest(
			@RequestParam(value = "name", required = false, defaultValue = "World") String fName) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("test");
		List<Coupons> coupons = new ArrayList<Coupons>();
        coupons = welcomeService.getCoupons();
	
		mv.addObject("coupons", coupons);
		mv.addObject("message", msg);
		mv.addObject("onlineCheckIn", new OnlineCheckIn());
		String waittime = welcomeService.getWaitTime("lansing");
		mv.addObject("waittime", waittime);
		return mv;
	}
	@RequestMapping("/survey")
	public ModelAndView showSurvey(
			@RequestParam(value = "name", required = false, defaultValue = "World") String fName) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("survey");
		List<Coupons> coupons = new ArrayList<Coupons>();
        coupons = welcomeService.getCoupons();
        
		mv.addObject("coupons", coupons);
		mv.addObject("message", msg);
		mv.addObject("name", fName);
		
		return mv;
	}
	@RequestMapping("/map")
	public ModelAndView showMap(
			@RequestParam(value = "name", required = false, defaultValue = "World") String fName) {
		System.out.println("in Map controller");
 
		ModelAndView mv = new ModelAndView("Map");
		
		return mv;
	}
	
	@RequestMapping("/checkin")
	public ModelAndView onlinecheckin(@ModelAttribute("onlineCheckIn") OnlineCheckIn checkIn) {
		System.out.println("in check in controller");
 
		ModelAndView mv = new ModelAndView("checkin");
		List<Coupons> coupons = new ArrayList<Coupons>();
        welcomeService.checkinService(checkIn);
	
		mv.addObject("coupons", coupons);
		mv.addObject("message", msg);
		return mv;
	}
	
	
	@RequestMapping("/waittime")
	public @ResponseBody String byParameter(@RequestParam("location") String location) {
		return welcomeService.getWaitTime(location);
	}
	@RequestMapping("/register")
	public ModelAndView register(@ModelAttribute("user") User user) {
		String result = welcomeService.registerUser(user);
		ModelAndView mv = new ModelAndView("homePage");
		return mv;
	}
	
}
