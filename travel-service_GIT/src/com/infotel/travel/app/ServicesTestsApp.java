package com.infotel.travel.app;


import java.util.List;

import com.infotel.travel.dao.TravelDao;
import com.infotel.travel.exceptions.AuthentificationException;
import com.infotel.travel.exceptions.BackupRestoreException;
import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Flight;
import com.infotel.travel.model.Ticket;
import com.infotel.travel.model.User;
import com.infotel.travel.service.TravelService;
import com.infotel.travel.service.TravelServiceImpl;
import com.infotel.travel.service.UserService;
import com.infotel.travel.service.UserServiceImpl;
import com.infotel.travel.util.MiscUtils;

public class ServicesTestsApp {

	public static void main(String[] args) throws AuthentificationException {

//		FlightDAO fdao = new FlightDAO();
//		fdao.load("flight.csv");
//		
//		List<Flight> boeings = fdao.findByKeyword("Boeing 737-300");
//		
//		for (Flight f : boeings) {
//			System.out.println(f);
//		}
//		
//		TicketDAO tdao = new TicketDAO();
//		tdao.load("ticket.csv");
		
		
//		TICKET TR = NEW TICKET(1);
//		TDAO.REMOVE(2);
		
		
	/*	
		try {
			//tdao.backup();
			tdao.remove(1);
			tdao.remove(2);
			tdao.restore();
		} catch (BackupRestoreException e) {
			e.printStackTrace();
		}
	
		tdao.displayAll();
		*/
//		TravelDao<Flight> tf = new FlightDAOJdbc();
//		for (Flight f : tf.findByKeyword("Boeing 737-900"))
//			System.out.println(f);
		
//		Ticket t1 = tdao.find(1);
//		System.out.println(t1);
		
		try {
			//TravelService ts = new TravelServiceImpl();
			//Flight f = ts.findFlightById(10);
			
			
			UserService us = new UserServiceImpl();
			System.out.println(us.authentification("bradyabd", "123456789"));
			
			System.out.println("FIN...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
