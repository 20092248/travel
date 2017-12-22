package com.infotel.travel.service;

import java.util.List;

import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Accomodation;
import com.infotel.travel.model.AccomodationImage;
import com.infotel.travel.model.AccomodationType;
import com.infotel.travel.model.Coordinates;
import com.infotel.travel.model.FacilityService;
import com.infotel.travel.model.Flight;

public interface BookingService {
	
	public AccomodationImage findImageId(int id) throws TravelException;
	
	public Accomodation findAccomodation(String query) throws TravelException;
	
	public List<Accomodation> accomodationInfo(String query) throws TravelException;
	
	public Flight findFlight(String flight_no) throws TravelException;
	
//	public FacilityService findFSId(int id);
//	
//	public FacilityService findDescriptionOrElse(String query);
}
