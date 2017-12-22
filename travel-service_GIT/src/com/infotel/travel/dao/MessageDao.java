package com.infotel.travel.dao;

import java.util.List;

import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Message;
import com.infotel.travel.model.User;

public interface MessageDao {
	
	public void createMessage(Message message) throws TravelException;
	
	public Message findById(int query) throws TravelException;
	
	public List<Message> findMessage(String query) throws TravelException;
}
