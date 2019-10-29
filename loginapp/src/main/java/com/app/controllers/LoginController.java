package com.app.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		HttpSession session = request.getSession();
		if(request.getParameter("userid").equals(session.getAttribute("userid"))&&request.getParameter("password").equals(session.getAttribute("password"))) {
			mav.addObject("userName", session.getAttribute("username"));
			mav.setViewName("logged");
			return mav;
		}else {
			mav.addObject("message", "Invalid user/password");
			mav.setViewName("login");
		return null;
		}
	}

}
