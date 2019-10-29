package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.beans.UserLogin;
import com.app.beans.UserRegistration;
import com.app.common.UserValidation;
import com.app.services.UserServices;

@Controller
public class UserController {

	@Autowired
	private UserServices userServices;

	@RequestMapping(value = "/home.htm", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		return mav;
	}

	@RequestMapping(value = "/registration.htm", method = RequestMethod.GET)
	public ModelAndView saveUser() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("userRegistration", new UserRegistration());
		mav.setViewName("registration");
		return mav;
	}

	@RequestMapping(value = "/registration.htm", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("userRegistration") UserRegistration userRegistration, ModelMap model,
			Errors errors) {
		UserValidation userValidation = new UserValidation();
		userValidation.validate(userValidation, errors);
		if (errors.hasErrors()) {
			return "registration";
		} else {
			userServices.saveUser(userRegistration);
			model.addAttribute("userLogin", new UserLogin());
			return "login";
		}
	}

	@RequestMapping(value = "/login.htm", method = RequestMethod.GET)
	public ModelAndView authenticateUser() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("userLogin", new UserLogin());
		mav.setViewName("logged");
		return mav;
	}

	@RequestMapping(value = "/login.htm", method = RequestMethod.POST)
	public String authenticateLogin(@ModelAttribute("userLogin") UserRegistration userRegistration, Errors errors,
			ModelMap model) {
		if (userRegistration.getUser_id() != null && userRegistration.getPassword() != null) {
			userServices.authenticateUser(userRegistration);
			/*if (userRegistration != null) {
				model.addAttribute(userRegistration);
			}*/
			List<UserRegistration> list = userServices.getUserDetails();
			model.addAttribute("userDetails", list );
			return "userDetails";
		} else {
			return "login";
		}
	}

}
