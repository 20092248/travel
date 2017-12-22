package com.infotel.travel.service;

import java.time.LocalTime;
import java.util.List;

import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Airline;
import com.infotel.travel.model.Airport;
import com.infotel.travel.model.Flight;
import com.infotel.travel.model.Message;
import com.infotel.travel.model.Ticket;

public interface TravelService {

	public List<Airport> findAirportByIataOrName(String query) throws TravelException;
	public Flight findFlightById(int id) throws TravelException;
	//public Flight findFlightByFlightNo(String flight_no) throws TravelException;
	//public SearchTrip findTripsByCriteria(LocalTime l1, LocalTime l2, int s1, int s2);
	//void book(Ticket ticket);
	public List<Flight> TopAirline(int max) throws TravelException;
	public void create(Message message) throws TravelException;
	public Ticket findticketbyid(int id) throws TravelException;
	public List<Flight> findFlight(String dep, String des, String heure_dep) throws TravelException;
	
	public List<Airport> AllCity() throws TravelException;
}
