package com.infotel.travel.dao;

import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Accomodation;
import com.infotel.travel.model.AccomodationImage;

public interface AccomodationImageDao {
	
	public AccomodationImage findById(int id) throws TravelException;// throws TravelException;
	
	public AccomodationImage findByAccomodationid(int id) throws TravelException;

}
