package com.infotel.travel.controller;

import com.infotel.travel.model.Message;
import com.infotel.travel.model.User;
import com.infotel.travel.service.UserService;
import com.infotel.travel.service.UserServiceImpl;

public class UserController /*implements EventHandler<ActionEvent>*/{

	UserService us = new UserServiceImpl();
	Message msgModel;
	
	public User Authenticate(String u){
		
		try {
			System.out.println(us.authentification("bradyabd", "123456789"));
			//System.out.println(u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		User user = new User();
		user.setUsername(u);
//		user.setPassword(p);
		return user;
		
	}
	
}
