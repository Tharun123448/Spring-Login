package com.app.services;

import java.util.List;

import com.app.beans.UserRegistration;

public interface UserServices {
	
	public void saveUser(UserRegistration userRegistration);
	public UserRegistration authenticateUser(UserRegistration userRegistration);
	public List<UserRegistration> getUserDetails();

}
