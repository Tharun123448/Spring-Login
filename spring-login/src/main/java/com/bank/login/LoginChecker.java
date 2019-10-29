package com.bank.login;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginChecker extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		if(req.getParameter("username").equals("tharun")&&req.getParameter("password").equals("tharun")){
			res.sendRedirect("logged.jsp");
		}else{
			String message = "user name/password do not match";
			
		}
	}

}
