package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import com.app.beans.UserRegistration;
import com.app.dao.UserDao;

public class UserServiceImpl implements UserServices {
	
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public void saveUser(UserRegistration userRegistration) {
		
		userDao.saveUser(userRegistration);
	}

	@Override
	public UserRegistration authenticateUser(UserRegistration userRegistration) {
		
		return userDao.authenticateUser(userRegistration);
	}
	@Override
	public List<UserRegistration> getUserDetails() {
		return userDao.getUserDetails();
	}
	
	
}
