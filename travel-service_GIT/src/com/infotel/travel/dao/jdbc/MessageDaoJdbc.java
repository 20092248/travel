package com.infotel.travel.dao.jdbc;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

import com.infotel.travel.dao.AirportDao;
import com.infotel.travel.dao.MessageDao;
import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Airline;
import com.infotel.travel.model.Airport;
import com.infotel.travel.model.Coordinates;
import com.infotel.travel.model.Message;
import com.infotel.travel.model.Ticket;
import com.infotel.travel.model.User;

public class MessageDaoJdbc extends AbstractDaoJdbc implements MessageDao {

	@Override
	public void createMessage(Message m) throws TravelException {
		
		try {
//			String sql = String.format("INSERT INTO MESSAGE"
//					+ "(id,date_time,content,ticket_id,parent_id,employee_id)"
//					+ "Values({0},{1},{2},{3},{4},{5})",
//						m.getId(),m.getDatetime(),m.getContent(),m.getTicket_id(),m.getParent_id(),m.getEmployee_id());
//			getConnection().createStatement().executeQuery(sql);
			
			String sql = "insert into message(id,date_time,content,ticket_id,parent_id,employee_id) values(?,?,?,?,?,?)";
			System.out.println(sql);
			PreparedStatement psm = getConnection().prepareStatement(sql);
			
	   	 	psm.setInt(1, m.getId());
	   	 	psm.setDate(2, (Date) m.getDatetime()); //PROBLEME!!!!! PAS LES H M S
	   	 	psm.setString(3, m.getContent());
	   	 	psm.setInt(4, m.getTicket_id());
    	   	psm.setInt(5, m.getParent_id());
    	   	psm.setString(6, m.getEmployee_id());
    	   	
    	   	psm.executeUpdate();
			
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	
	
	}

	@Override
	public Message findById(int id) throws TravelException {
		
		Message m = new Message();
		
		try {
			String sql = "SELECT * from message where id ="+id; 
			System.out.println(sql);
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
			if(rs.next()) {
				
				m.setId(rs.getInt("id"));
				m.setDatetime(rs.getDate("date_time"));
				m.setContent(rs.getString("content"));
				m.setTicket_id(rs.getInt("ticket_id")); // Ticket ou int ?
				m.setParent_id(rs.getInt("parent_id"));

			}
		}catch (Exception e) {
				throw new TravelException(e.getMessage());
			}
		return  m;
	}

	@Override
	public List<Message> findMessage(String query) throws TravelException{
		Message m = new Message();
		List<Message> messages = new ArrayList<Message>();
		
		try {
			String sql = "SELECT customer_id, date_time, content, employee_id, parent_id FROM message, ticket WHERE message.ticket_id = ticket.id AND  message.employee_id = '"+query+"'"; 
			//String sql = "SELECT * FROM message, ticket";
			//System.out.println(sql);
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
			while(rs.next()) {
			
				m = new Message();
				//m.setId(rs.getInt("id"));
				m.setDatetime(rs.getDate("date_time"));
				m.setContent(rs.getString("content"));
				//m.setTicket_id(rs.getInt("ticket_id"));
				m.setParent_id(rs.getInt("parent_id"));
				m.setEmployee_id(rs.getString("employee_id"));
				//Vient de la table ticket
				m.setCustomer_id(rs.getString("customer_id"));
				
				
				messages.add(m);
				
			}
			rs.close();
			}catch (Exception e) {
				throw new TravelException(e.getMessage());
			}
		return messages;
	}
	

	
	public static void main(String[] args) throws TravelException {
		MessageDao message = new MessageDaoJdbc();
		
		
		for(Message msg : message.findMessage("bradyabd")) {
			System.out.println(msg);
		}		

	}
	
	
}
