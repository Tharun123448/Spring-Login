package com.app.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.beans.UserLogin;
import com.app.beans.UserRegistration;
import com.app.services.UserServices;

@RestController
public class User {
	
	@Autowired
	private UserServices userService;

	@GetMapping("/userDetails.htm")
	public @ResponseBody Map<String,Integer> getUserDetails(){
		
		/*UserLogin user = new UserLogin();
		user.setUser_id("test");
		user.setPassword("password");*/
		Map<String, Integer> map = new HashMap<>();
		map.put("test", 1);
		map.put("test1", 2);
		return map;
		
	}
}
