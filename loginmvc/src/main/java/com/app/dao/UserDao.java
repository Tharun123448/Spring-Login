package com.app.dao;

import java.util.List;

import com.app.beans.UserRegistration;

public interface UserDao {
	public void saveUser(UserRegistration userRegistration);
	public UserRegistration authenticateUser(UserRegistration userRegistration);
	public List<UserRegistration> getUserDetails();
}
