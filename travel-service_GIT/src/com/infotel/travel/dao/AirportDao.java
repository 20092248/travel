package com.infotel.travel.dao;

import java.util.List;

import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Airport;

public interface AirportDao{
	public List<Airport> findByNameCityCountryIata(String query) throws TravelException;
	public Airport findByID(int query) throws TravelException;
	
	public List<Airport> AllCityAirline() throws TravelException;
}
