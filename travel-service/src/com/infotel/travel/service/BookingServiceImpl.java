package com.infotel.travel.service;

import java.util.ArrayList;
import java.util.List;

import com.infotel.travel.dao.AccomodationDao;
import com.infotel.travel.dao.AccomodationImageDao;
import com.infotel.travel.dao.AirportDao;
import com.infotel.travel.dao.FlightDao;
import com.infotel.travel.dao.jdbc.AccomodationDaoJdbc;
import com.infotel.travel.dao.jdbc.AccomodationImageDaoJdbc;
import com.infotel.travel.dao.jdbc.AirportDaoJdbc;
import com.infotel.travel.dao.jdbc.FlightDaoJdbc2;
import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Accomodation;
import com.infotel.travel.model.AccomodationImage;
import com.infotel.travel.model.AccomodationType;
import com.infotel.travel.model.Airport;
import com.infotel.travel.model.Coordinates;
import com.infotel.travel.model.FacilityService;
import com.infotel.travel.model.Flight;

public class BookingServiceImpl implements BookingService{

	AccomodationImageDao aodao = new AccomodationImageDaoJdbc();
	AccomodationDao adao = new AccomodationDaoJdbc(); 
	
	@Override
	public AccomodationImage findImageId(int id) throws TravelException {
		
		return aodao.findByAccomodationid(id);
	}

//	@Override
//	public FacilityService findFSId(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public FacilityService findDescriptionOrElse(String query) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<Accomodation> accomodationInfo(String query) throws TravelException {
		List<Accomodation> accomodations = new ArrayList<>();
		AccomodationDao a = new AccomodationDaoJdbc();	
			
		for(Accomodation i : a.findByName(query)){
				 accomodations.add(i);
			}

		return accomodations ;
	}

	@Override
	public Accomodation findAccomodation(String query) throws TravelException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight findFlight(String flight_no) throws TravelException {
		// TODO Auto-generated method stub
		FlightDao fdaojdbc = new FlightDaoJdbc2();
		return fdaojdbc.findByFlight_No(flight_no);
	}
	
	public static void main(String[] args) throws TravelException {
		BookingService bs = new BookingServiceImpl();
		System.out.println(bs.findFlight("AF 125"));
	}

}
