package com.infotel.travel.dao;

import java.util.List;

import com.infotel.travel.exceptions.AuthentificationException;
import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.User;

public interface UserDao {

	public void create(User user) throws TravelException;

	public User find(String u,String p) throws AuthentificationException, TravelException;

}
