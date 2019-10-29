package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.beans.UserLogin;

@Controller
public class HomeController {

	@RequestMapping(value= "/home.htm",method=RequestMethod.GET)
	public ModelAndView welcomePage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		return mav;
		
	}
	@RequestMapping(value= "/login.htm",method=RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("userLogin",new UserLogin());
		mav.setViewName("login");
		return mav;
		
	}
	
	@RequestMapping(value= "/login.htm",method=RequestMethod.POST)
	public ModelAndView loginPage(@ModelAttribute("userLogin") UserLogin userLogin) {
		System.out.println("userLogin :"+userLogin.getUserId()+" "+userLogin.getPassword());
		ModelAndView mav = new ModelAndView();
		mav.addObject("userLogin",new UserLogin());
		mav.setViewName("login");
		return mav;
		
	}
	

}
