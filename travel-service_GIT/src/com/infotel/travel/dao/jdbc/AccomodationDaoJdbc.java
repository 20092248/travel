package com.infotel.travel.dao.jdbc;

import java.sql.ResultSet;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.infotel.travel.dao.AccomodationDao;
import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Accomodation;
import com.infotel.travel.model.AccomodationInfo;
import com.infotel.travel.model.Airport;
import com.infotel.travel.model.Coordinates;
import com.infotel.travel.model.FacilityService;
import com.infotel.travel.model.Flight;

public class AccomodationDaoJdbc extends AbstractDaoJdbc implements AccomodationDao {

	@Override
	public Accomodation findByLocation(int aero_id, int dist) throws TravelException {
		Accomodation acc;
		try {
			String sql = 
					"(select air.latitude, air.longitude"
					+"from airport air"
					+ "where air.id ="+aero_id					
					+ ") where "+dist+" > (111.111 * degress(acos(cos(radians(a.latitude))"
					+"*cos(radians(@l)) * cos(radians(a.longitude-@lon))"
					+"sin(radians(a.latitude))*sin(radians(@lat)))";
		}
		catch(Exception e){
			
		}
		 
//		SELECT * from accomodation as acc
//		where 50<(111.111 *
//		    DEGREES(ACOS(COS(RADIANS(acc.Latitude))
//		         * COS(RADIANS(select latitude from airport where airport.id = 1))
//		         * COS(RADIANS(acc.Longitude - select longitude from airport where airport.id = 1))
//		         + SIN(RADIANS(acc.Latitude))
//		         * SIN(RADIANS(b.select latitude from airport where airport.id = 1)))))

		
		
		
		
		return null;
	}

	@Override
	public List<Accomodation> findByName(String query) throws TravelException {
		Accomodation a = new Accomodation();
		List<Accomodation> accomodations = new ArrayList<Accomodation>();
		
		
		try {
			String sql = "SELECT * from accomodation where name like '%"+query+"%'"; 
			System.out.println(sql);
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
			//DateTimeFormatter form = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			
			
			while(rs.next()) {
				
				a = new Accomodation();
				a.setId(rs.getInt("id"));
				a.setPrice(rs.getInt("price"));
				a.setInfo(new AccomodationInfo(
						rs.getString("name"), 
						rs.getString("type"), 
						rs.getString("address"), 
						rs.getString("distance"), 
						rs.getString("cancellation_free"), 
						rs.getInt("stars"), 
						new Coordinates(rs.getDouble("latitude"), rs.getDouble("longitude"))));
//				a.setInformationName(rs.getString("name"));
//				a.setInformationType(rs.getString("type"));
//				a.setInformationAdress(rs.getString("address"));
//				a.setInformationDistance(rs.getString("distance"));
//				a.setInformationType(rs.getInt("stars"));
//				a.setInformationCF(rs.getString("cancellation_free"));
//				a.setInformationLa(rs.getDouble("latitude"));
//				a.setInformationLo(rs.getDouble("longitude"));
				a.setImage_id(rs.getInt("image_id"));
				accomodations.add(a);

			}
			
		}catch (Exception e) {
			throw new TravelException(e.getMessage());
		}
	return  accomodations;
}

	@Override
	public List<Accomodation> findByLocation(double lat, double lon, double dist) throws TravelException {
		Accomodation a = new Accomodation();
		List<Accomodation> accomodations = new ArrayList<Accomodation>();
		
		
		try {
			String sql = "SELECT * from accomodation where"; 
			System.out.println(sql);
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
			//DateTimeFormatter form = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			
			
			while(rs.next()) {
				
				a = new Accomodation();
				a.setId(rs.getInt("id"));
				a.setPrice(rs.getInt("price"));
				a.setInfo(new AccomodationInfo(
						rs.getString("name"), 
						rs.getString("type"), 
						rs.getString("address"), 
						rs.getString("distance"), 
						rs.getString("cancellation_free"), 
						rs.getInt("stars"), 
						new Coordinates(rs.getDouble("latitude"), rs.getDouble("longitude"))));
				a.setImage_id(rs.getInt("image_id"));
				accomodations.add(a);

			}
			
		}catch (Exception e) {
			throw new TravelException(e.getMessage());
		}
	return  accomodations;
	}

	public static void main(String[] args) throws TravelException{
		
		AccomodationDaoJdbc a = new AccomodationDaoJdbc();
		
		for(Accomodation i : a.findByName("Hotel de Paris!")) {
			System.out.println(i);
			}
	}
}


