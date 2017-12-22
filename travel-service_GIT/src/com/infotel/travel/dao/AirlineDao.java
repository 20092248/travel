package com.infotel.travel.dao;

import java.util.List;

import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Airline;

public interface AirlineDao {
	
	public Airline findbyId(int query) throws TravelException;
	public List<Airline> findAirline(String query) throws TravelException;

}
