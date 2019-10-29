package com.app.dao;

import com.app.model.UserRegEntity;

public interface UserDao {
	public String saveUser(UserRegEntity userRegEntity);
	public boolean authenticateUser(String userId, String password);
}
