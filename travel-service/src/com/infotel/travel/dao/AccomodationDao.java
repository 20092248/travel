package com.infotel.travel.dao;

import java.util.List;

import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Accomodation;
import com.infotel.travel.model.Coordinates;

public interface AccomodationDao{
	
	public List<Accomodation> findByName(String query) throws TravelException;
	
	public List<Accomodation> findByLocation(double lat,double lon, double dist) throws TravelException;

	Accomodation findByLocation(int aero_id, int dist) throws TravelException;
	
	//Accomodation findByFlight_No(String flight_no) throws TravelException;
	

}
