package com.app.common;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.beans.UserRegistration;

public class UserValidation implements Validator{

	@Override
	public boolean supports(Class<?> cls) {
		
		return UserRegistration.class.equals(cls);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		
	}

}
