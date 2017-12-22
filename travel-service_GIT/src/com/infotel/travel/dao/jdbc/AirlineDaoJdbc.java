package com.infotel.travel.dao.jdbc;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.infotel.travel.dao.AirlineDao;
import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Airline;
import com.infotel.travel.model.Airline;
import com.infotel.travel.model.Coordinates;
import com.infotel.travel.model.Flight;

public class AirlineDaoJdbc extends AbstractDaoJdbc implements AirlineDao {

	@Override
	public Airline findbyId(int query) throws TravelException {
		Airline a = new Airline() ;
		try {
			String sql = "SELECT * from airline where id ="+query; 
			//System.out.println(sql);
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
			if(rs.next()) {
				
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				a.setIata(rs.getString("iata"));
				a.setIcao(rs.getString("icao"));
				a.setIata(rs.getString("iata"));
				a.setCountry(rs.getString("country"));

			}
		}catch (Exception e) {
				throw new TravelException(e.getMessage());
			}
		return  a;
	}

	@Override
	public List<Airline> findAirline(String query) throws TravelException {
			Airline a = new Airline();
			List<Airline> airlines = new ArrayList<Airline>();
			try {
				String sql = "SELECT * from airport where name like '%"+query+"%' or icao like '%"+query+
						"%' or country like '%"+query+"%' or iata like '%"+query+"%'"; 
				System.out.println(sql);
				ResultSet rs = getConnection().createStatement().executeQuery(sql);
				while(rs.next()) {
				
					a = new Airline();
					a.setId(rs.getInt("id"));
					a.setName(rs.getString("name"));
					a.setIata(rs.getString("iata"));
					a.setIcao(rs.getString("icao"));
					a.setCountry(rs.getString("country"));
					airlines.add(a);
				}
			}catch (Exception e) {
					throw new TravelException(e.getMessage());
				}
			return airlines;
		}	
	}
	


