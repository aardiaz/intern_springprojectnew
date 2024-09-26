package com.appsoft.springproject.service;

import com.appsoft.springproject.model.User;

public interface UserService {
	
	void  signup(User user);
	User login(String un, String psw);

}
