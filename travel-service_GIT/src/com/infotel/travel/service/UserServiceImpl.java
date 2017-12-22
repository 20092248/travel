package com.infotel.travel.service;

import java.net.Authenticator;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.security.sasl.AuthenticationException;

import com.infotel.travel.dao.MessageDao;
import com.infotel.travel.dao.UserDao;
import com.infotel.travel.dao.jdbc.AbstractDaoJdbc;
import com.infotel.travel.dao.jdbc.MessageDaoJdbc;
import com.infotel.travel.dao.jdbc.UserDaoJdbc;
import com.infotel.travel.exceptions.AuthentificationException;
import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Customer;
import com.infotel.travel.model.Employee;
import com.infotel.travel.model.Message;
import com.infotel.travel.model.User;
import com.sun.javafx.scene.control.SelectedCellsMap;

public class UserServiceImpl implements UserService{

	UserDao  udao = new UserDaoJdbc();
	Calendar calendar = Calendar.getInstance();
	
	@Override
	public User authentification(String username, String password) throws AuthentificationException, TravelException {
			User u = udao.find(username, password);
			if(u!= null){
				return u;
			}
		
		throw new AuthentificationException();
	}

	@Override
	public List<Message> findEmployeeMessage(String query) throws TravelException {
		MessageDao mdao = new MessageDaoJdbc();
		return mdao.findMessage(query);
	}
	
	@Override
	public void register(Customer customer) throws AuthentificationException {
//		if(udao!=null)
//		udao.create(customer);	
	}
	
	@Override
	public void register(Employee empl) throws AuthentificationException {
//		if(udao!=null)
//		udao.create(empl);
	}

	public void createMsg(String content, int parent_id, int ticket_id, String employee) throws TravelException{
		MessageDao message_dao = new MessageDaoJdbc();
		Message msg = new Message(new Date(calendar.getTime().getTime()),content, parent_id, ticket_id, employee);
		message_dao.createMessage(msg);
	}
	
	
	public static void main(String[] args) throws AuthentificationException, TravelException{
		UserServiceImpl u = new UserServiceImpl();
		u.authentification("bradyabd", "123456789");
		
		for(int i=0;i<u.findEmployeeMessage("bradyabd").size();i++)
		System.out.println("\n\n"+u.findEmployeeMessage("bradyabd").get(i));
	}
	

}
