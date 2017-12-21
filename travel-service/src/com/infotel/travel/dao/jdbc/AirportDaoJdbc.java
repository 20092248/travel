package com.infotel.travel.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.infotel.travel.dao.AirportDao;
import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.AccomodationImage;
import com.infotel.travel.model.Airport;
import com.infotel.travel.model.Coordinates;
import com.infotel.travel.model.Flight;

public class AirportDaoJdbc extends AbstractDaoJdbc implements AirportDao {

	@Override
	public List<Airport> AllCityAirline() throws TravelException {
		Airport a = new Airport();
		List<Airport> airports = new ArrayList<Airport>();
		try {
			String sql = "SELECT DISTINCT(city),iata,name FROM airport ORDER BY city ASC"; 
			//System.out.println(sql);
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
			while(rs.next()) {
				a = new Airport();
				a.setCity(rs.getString("city"));
				a.setIata(rs.getString("iata"));
				a.setName(rs.getString("name"));
				airports.add(a);
			}rs.close();
		}catch (Exception e) {
				throw new TravelException(e.getMessage());
			}
		return airports;
	}
	
	@Override
	public List<Airport> findByNameCityCountryIata(String query) throws TravelException {
		Airport a = new Airport();
		List<Airport> airports = new ArrayList<Airport>();
		try {
			String sql = "SELECT * from airport where name like '%"+query+"%' or city like '%"+query+
					"%' or country like '%"+query+"%' or iata like '%"+query+"%'"; 
			//System.out.println(sql);
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
			while(rs.next()) {
			
				a = new Airport();
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				a.setCity(rs.getString("city"));
				a.setCountry(rs.getString("country"));
				a.setIata(rs.getString("iata"));
				a.setIcao(rs.getString("icao"));
				a.setCoordinates(new Coordinates(rs.getDouble("latitude"),rs.getDouble("longitude")));
				a.setTimezone(rs.getString("timezone"));
				airports.add(a);
				
				
			}
		}catch (Exception e) {
				throw new TravelException(e.getMessage());
			}
		return airports;
	}
	


	@Override
	public Airport findByID(int query) throws TravelException {
		Airport a = new Airport();
		try {
			String sql = "SELECT * from airport where id ="+query; 
			//System.out.println(sql);
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
			if(rs.next()) {
				
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				a.setCity(rs.getString("city"));
				a.setCountry(rs.getString("country"));
				a.setIata(rs.getString("iata"));
				a.setIcao(rs.getString("icao"));
				a.setCoordinates(new Coordinates(rs.getDouble("latitude"),rs.getDouble("longitude")));
				a.setTimezone(rs.getString("timezone"));
			}
		}catch (Exception e) {
				throw new TravelException(e.getMessage());
			}
		return  a;
	}
	
	
	

	
	public static void main(String[] args) throws TravelException {
		AirportDao airjdbc = new AirportDaoJdbc();

			for(Airport i : airjdbc.AllCityAirline()) {
			System.out.println(i.getCity()+"-"+i.getIata()+" "+i.getName());
}
	
}
	
}
