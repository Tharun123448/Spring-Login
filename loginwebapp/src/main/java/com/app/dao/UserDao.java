package com.app.dao;

import java.util.List;

import com.app.entites.UserRegistration;

public interface UserDao {
	public List<UserRegistration> authenticateUser(String userId, String password);
	public String saveUser(UserRegistration userRegistration);
}
