package com.infotel.travel.service;

import java.util.List;

import javax.security.sasl.AuthenticationException;

import com.infotel.travel.exceptions.AuthentificationException;
import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Customer;
import com.infotel.travel.model.Employee;
import com.infotel.travel.model.Message;
import com.infotel.travel.model.User;

public interface UserService {

	public User authentification(String username, String password) throws AuthentificationException, TravelException;
	
	public void register(Customer customer) throws AuthentificationException;
	
	public void register(Employee empl) throws AuthentificationException;
	
	public void createMsg(String content, int parent_id, int ticket_id, String employee) throws TravelException;
	//List<Customer> findNameOrAdress(String query) throws AuthentificationException;
	List<Message> findEmployeeMessage(String query) throws TravelException;
}
