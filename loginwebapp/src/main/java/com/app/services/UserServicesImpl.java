package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.UserDao;
import com.app.entites.UserRegistration;

public class UserServicesImpl implements UserServices{
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<UserRegistration> authenticateUser(String userId, String password) {
		List<UserRegistration> userList = userDao.authenticateUser(userId, password);
		return userList;
	}

	@Override
	public String saveUser(UserRegistration userRegistration) {
		String status = userDao.saveUser(userRegistration);
		return status;
	}

}
