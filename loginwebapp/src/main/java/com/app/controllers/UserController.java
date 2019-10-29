package com.app.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.common.UserValidation;
import com.app.entites.UserRegistration;
import com.app.services.UserServices;

@Controller
public class UserController {
	
	private UserServices userServices;
	
	@RequestMapping(value="/home.htm", method=RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		return mav;
	}
	@RequestMapping(value="/registration.htm", method=RequestMethod.GET)
	public ModelAndView saveUser() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("userRegistration", new UserRegistration());
		mav.setViewName("login");
		return mav;
	}
	@RequestMapping(value="/registration.htm", method=RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("userRegistration")UserRegistration userRegistration, Model model, Errors errors) {
		UserValidation userValidation = new UserValidation();
		userValidation.validate(userRegistration, errors);
		String status = userServices.saveUser(userRegistration);
		ModelAndView mav = new ModelAndView();
		if(errors.hasErrors()&&status.equals("failed")) {
			model.addAttribute("failed", "Sorry, your registration has failed");
			mav.setViewName("registration");
			return mav;
		}else {
			model.addAttribute("sucess", "User Registration got successfull ");
			mav.setViewName("login");
			return mav;
		}
	}
	@RequestMapping(value="/login.htm", method=RequestMethod.GET)
	public ModelAndView userAuthentication() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("userRegistration", new UserRegistration());
		mav.setViewName("login");
		return mav;
	}
	@RequestMapping(value="/login.htm", method=RequestMethod.POST)
	public ModelAndView userAuthentication(@ModelAttribute("userLogin")UserRegistration userRegistration, Model model, Errors errors) {
		UserValidation userValidation = new UserValidation();
		userValidation.validate(userRegistration, errors);
		ModelAndView mav = new ModelAndView();
		 if(errors.hasErrors()) {
			 mav.setViewName("login");
			 return mav;
		 }
		 List<UserRegistration> userList = userServices.authenticateUser(userRegistration.getUser_id(), userRegistration.getPassword());
		 model.addAllAttributes(userList);
		 mav.addObject("userRegistration", new UserRegistration());
		 mav.setViewName("login");
		 return mav;
	}
	
}
