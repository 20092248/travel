package com.infotel.travel.dao.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;

import com.infotel.travel.dao.TicketDao;
import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Airline;
import com.infotel.travel.model.Ticket;
import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class TicketsDaoJdbc extends AbstractDaoJdbc implements TicketDao {

	@Override
	public void create(Ticket t) throws TravelException {

		 
		
		try {
			Statement psm = getConnection().createStatement();
			String sql = String.format("INSERT INTO Ticket"
					+ "(id,nb_passengers,outward_route_id,outward_date,return_date,accomodation_id,total_price,customer_id)"
					+ "values({0},{1},{2},{3},{4},{5},{6},{7},{8},{9})",
						t.getId(),t.getNb_passengers(),t.getOutward_route_id(),t.getOutward_date(),t.getReturn_date(),t.getAccomodation_id(),t.getTotal_price(),t.getCustomer_id());
			psm.executeQuery(sql);	
			psm.executeUpdate(sql);
			
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	
	
	}

	@Override
	public Ticket findById(int query) throws TravelException {
		Ticket t = new Ticket() ;
		try {
			String sql = "SELECT * from ticket where id ="+query; 
			System.out.println(sql);
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
			if(rs.next()) {
				
				
				t.setId(rs.getInt("id"));
				t.setNb_passengers(rs.getInt("nb_passengers"));
				t.setOutward_route_id(rs.getInt("outward_route_id"));
				t.setReturn_route_id(rs.getInt("return_route_id"));
				t.setOutward_date(rs.getDate("outward_date"));
				t.setReturn_date(rs.getDate("return_date"));
				t.setTotal_price(rs.getInt("total_price"));
				t.setAccomodation_id(rs.getInt("accomodation_id"));
				t.setCustomer_id(rs.getString("customer_id"));
				
				

			}
		}catch (Exception e) {
				throw new TravelException(e.getMessage());
			}
		return  t;
	}

}
