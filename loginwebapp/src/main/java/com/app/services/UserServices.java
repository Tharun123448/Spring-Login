package com.app.services;

import java.util.List;

import com.app.entites.UserRegistration;

public interface UserServices {
	public List<UserRegistration> authenticateUser(String userId, String password);
	public String saveUser(UserRegistration userRegistration);
}
