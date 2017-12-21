package com.infotel.travel.dao.jdbc;

import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.infotel.travel.dao.FlightDao;
import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Airline;
import com.infotel.travel.model.Airport;
import com.infotel.travel.model.Coordinates;
import com.infotel.travel.model.Flight;
import com.infotel.travel.service.TravelServiceImpl;

public class FlightDaoJdbc2 extends AbstractDaoJdbc implements FlightDao {

	@Override
	public Flight findById(int query) throws TravelException {
		Flight f = new Flight();
		try {
			String sql = "SELECT * from flight where id ="+query; 
			System.out.println(sql);
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
			DateTimeFormatter form = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			
			
			if(rs.next()) {
				
				f.setId(rs.getInt("id"));
				f.setFlightNumber(rs.getString("flight_no"));
				f.setDestAirport(new AirportDaoJdbc().findByID(rs.getInt("dest_airport_id")));
				f.setSourceAirport(new AirportDaoJdbc().findByID(rs.getInt("source_airport_id")));
				
				LocalTime ldate_dep = rs.getTime("departure").toLocalTime();
				f.setDeparture(ldate_dep);
				LocalTime ldate_des = rs.getTime("arrival").toLocalTime();
				f.setArrival(ldate_des);
				
				
				
				f.setAirline_id(new AirlineDaoJdbc().findbyId(rs.getInt("airline_id")));;
				f.setEquipment(rs.getString("equipment"));
				

			}
			
		}catch (Exception e) {
			throw new TravelException(e.getMessage());
		}
	return  f;
}
	
	@Override
	public List<Flight> findAll() throws TravelException {
		Flight f = new Flight();
		List<Flight> flights = new ArrayList<Flight>();

		try {
			String sql = "SELECT * from flight LIMIT 0,10"; 
			//System.out.println(sql);
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
			while(rs.next()) {
				
				f = new Flight();
				f.setId(rs.getInt("id"));
				f.setFlightNumber(rs.getString("flight_no"));
				f.setDestAirport(new AirportDaoJdbc().findByID(rs.getInt("dest_airport_id")));
				f.setSourceAirport(new AirportDaoJdbc().findByID(rs.getInt("source_airport_id")));

				LocalTime ldate_dep = rs.getTime("departure").toLocalTime();
				f.setDeparture(ldate_dep);
				LocalTime ldate_des = rs.getTime("arrival").toLocalTime();
				f.setArrival(ldate_des);
				
				f.setAirline_id(new AirlineDaoJdbc().findbyId(rs.getInt("airline_id")));;
				f.setEquipment(rs.getString("equipment"));
				
				flights.add(f);

			}
			
		}catch (Exception e) {
			throw new TravelException(e.getMessage());
		}
	return  flights;
}

	@Override
	public Flight findByFlight_No(String flight_no) throws TravelException {
		Flight f = new Flight();
		try {
			String sql = "SELECT * from flight where flight_no ='"+flight_no+"'"; 
			System.out.println(sql);
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
			if(rs.next()) {
					
					f.setId(rs.getInt("id"));
					f.setFlightNumber(rs.getString("flight_no"));
					f.setDestAirport(new AirportDaoJdbc().findByID(rs.getInt("dest_airport_id")));
					f.setSourceAirport(new AirportDaoJdbc().findByID(rs.getInt("source_airport_id")));				
					
					LocalTime ldate_dep = rs.getTime("departure").toLocalTime();
					f.setDeparture(ldate_dep);
					LocalTime ldate_des = rs.getTime("arrival").toLocalTime();
					f.setArrival(ldate_des);
					
					f.setAirline_id(new AirlineDaoJdbc().findbyId(rs.getInt("airline_id")));;
					f.setEquipment(rs.getString("equipment"));
			
		}
		}catch (Exception e) {
				throw new TravelException(e.getMessage());
			}
		return  f;
	}
	
	@Override
	public List<Flight> findTop_Max(int max) throws TravelException {
		Flight f = new Flight();
		List<Flight> flights = new ArrayList<Flight>();

		try {
			String sql = "SELECT airline_id, count(*) total_vols FROM flight "
					+ "left outer join airline on (flight.airline_id = airline.id)" 
					+ "group by airline_id order by total_vols DESC	limit "+max; 
			System.out.println(sql);
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
			while(rs.next()) {
				
				f = new Flight();
//				f.setId(rs.getInt("id"));
//				f.setFlightNumber(rs.getString("flight_no"));
//				f.setDestAirport(new AirportDaoJdbc().findByID(rs.getInt("dest_airport_id")));
//				f.setSourceAirport(new AirportDaoJdbc().findByID(rs.getInt("source_airport_id")));
//
//				LocalDateTime ldate_dep = rs.getTimestamp("departure").toLocalDateTime();
//				f.setDeparture(ldate_dep);
//				LocalDateTime ldate_des = rs.getTimestamp("arrival").toLocalDateTime();
//				f.setArrival(ldate_des);
				
				f.setAirline_id(new AirlineDaoJdbc().findbyId(rs.getInt("airline_id")));
//				f.setEquipment(rs.getString("equipment"));
				
				flights.add(f);

			}
			
		}catch (Exception e) {
			throw new TravelException(e.getMessage());
		}
	return  flights;
	}
	
	public static void main(String[] args) throws TravelException {
		FlightDaoJdbc2 flightjdbc = new FlightDaoJdbc2();
		//Flight f = flightjdbc.findById(1);
		//		System.out.println(f);
				
				for(Flight f1 : flightjdbc.findAll()) {
					System.out.println(f1.getDeparture());
				}
//		try {
//			for(Flight i : flightjdbc.findAll()) {
//			System.out.println("-->"+i);
//			}
//		} catch (TravelException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		
//	}
				
	}
	
}

