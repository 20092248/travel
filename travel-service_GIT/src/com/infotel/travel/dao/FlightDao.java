package com.infotel.travel.dao;

import java.time.LocalTime;
import java.util.List;

import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Airline;
import com.infotel.travel.model.Flight;

public interface FlightDao {
	
	public Flight findById(int query) throws TravelException;

	public List<Flight> findFlight(String dep, String des, String heure_dep) throws TravelException;
	
	public Flight findByFlight_No(String flight_no) throws TravelException;
	
	public List<Flight> findTop_Max(int max) throws TravelException;
}
