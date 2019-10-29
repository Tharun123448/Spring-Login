//package com.app.controllers;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.BeanUtils;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.servlet.ModelAndView;
//
//
//import com.app.beans.UserReg;
//import com.app.model.UserRegEntity;
//
//
//@Controller
//public class RegistrationController{
//
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		ModelAndView mav = new ModelAndView();
//		if(request.getParameter("password").equals(request.getParameter("confirmpassword"))) {
//			HttpSession session = request.getSession();
//			session.setAttribute("userId", request.getParameter("userid"));
//			session.setAttribute("username", request.getParameter("username"));
//			session.setAttribute("emailid", request.getParameter("emailid"));
//			session.setAttribute("password", request.getAttribute("password"));
//			mav.setViewName("login");
//			return mav;
//		}else {
//			mav.addObject("message", "Password not matched");
//			mav.setViewName("register");
//		return mav;
//		}
//	}
//
//	/*@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		UserRegEntity userRegEntity = new UserRegEntity();
//		UserReg userReg = new UserReg();
//		userReg.setUserId(request.getParameter("userid"));
//		userReg.setName(request.getParameter("username"));
//		userReg.setEmailId(request.getParameter("emailid"));
//		if(request.getParameter("password").equals(request.getParameter("confirmpassword"))) {
//			userReg.setPassword(request.getParameter("passowrd"));
//			BeanUtils.copyProperties(userReg, userRegEntity);
//			
//		}
//		return null;
//	}*/
//
//}
