package com.infotel.travel.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.infotel.travel.dao.AccomodationDao;
import com.infotel.travel.dao.AirportDao;
import com.infotel.travel.dao.FlightDao;
import com.infotel.travel.dao.MessageDao;
import com.infotel.travel.dao.TicketDao;
import com.infotel.travel.dao.UserDao;
import com.infotel.travel.dao.jdbc.AccomodationDaoJdbc;
import com.infotel.travel.dao.jdbc.AirportDaoJdbc;
import com.infotel.travel.dao.jdbc.FlightDaoJdbc2;
import com.infotel.travel.dao.jdbc.MessageDaoJdbc;
import com.infotel.travel.dao.jdbc.TicketsDaoJdbc;
import com.infotel.travel.dao.jdbc.UserDaoJdbc;
import com.infotel.travel.exceptions.AuthentificationException;
import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Accomodation;
import com.infotel.travel.model.AccomodationImage;
import com.infotel.travel.model.Airline;
import com.infotel.travel.model.Airport;
import com.infotel.travel.model.Coordinates;
import com.infotel.travel.model.Flight;
import com.infotel.travel.model.Message;
import com.infotel.travel.model.Ticket;

public class TravelServiceImpl implements TravelService{

	@Override
	public List<Airport> findAirportByIataOrName(String query) throws TravelException {
		List<Airport> airports = new ArrayList<>();
		AirportDao d = new AirportDaoJdbc();	
			
		for(Airport i : d.findByNameCityCountryIata(query)){
				 airports.add(i);
			}

		return airports;
	}
	
	@Override
	public List<Flight> findFlight(String dep, String des, String heure_dep) throws TravelException {
		FlightDao flightDao = new FlightDaoJdbc2();	
		return flightDao.findFlight(dep, des, heure_dep);
	}
	
	@Override
	public List<Airport> AllCity() throws TravelException {
		AirportDao airportDao = new AirportDaoJdbc();
		return airportDao.AllCityAirline();
	}

	@Override
	public Flight findFlightById(int id) throws TravelException {
		// TODO Auto-generated method stub
		FlightDao  fdao = new FlightDaoJdbc2();
		return fdao.findById(id);
	}

	public void create(Message m) throws TravelException{
		MessageDao message_dao = new MessageDaoJdbc();
		Message message = new Message();
		message_dao.createMessage(message);
	}
	
	@Override
	public Ticket findticketbyid(int id) throws TravelException {
		TicketDao tdao = new TicketsDaoJdbc();
		return tdao.findById(id);
	}
	
	//service accomodation
	public List<Accomodation> findAccomodation_par_distance(double latitude, double longitude, double distance) throws TravelException{
		AccomodationDao adao = new AccomodationDaoJdbc();
		return adao.findByLocation(latitude, longitude, distance);
	}
	
	@Override
	public List<Flight> TopAirline(int max) throws TravelException {
		FlightDao flightDao = new FlightDaoJdbc2();
		return flightDao.findTop_Max(max);
	}
	
	public static void main(String[] args) throws TravelException{
		
		TravelServiceImpl t = new TravelServiceImpl();
				System.out.println(t.AllCity());
		//System.out.println(t.findFlightById(100));
		
	}


}
