package com.infotel.travel.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

import com.infotel.travel.dao.UserDao;
import com.infotel.travel.exceptions.AuthentificationException;
import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Airport;
import com.infotel.travel.model.Customer;
import com.infotel.travel.model.Employee;
import com.infotel.travel.model.Flight;
import com.infotel.travel.model.Message;
import com.infotel.travel.model.User;

public class UserDaoJdbc extends AbstractDaoJdbc implements UserDao {

	public void create(User u) throws TravelException {

		try {
//			 String sql = String.format("INSERT INTO user_data"
//			 + "(username,password)"
//			 + "values({0},{1})",
//			 u.getUsename(),u.getPassword());
//			 getConnection().createStatement().executeQuery(sql);

			PreparedStatement psm = getConnection()
					.prepareStatement("insert into user_data(username,password) values(?,?)");
			psm.setString(1, u.getUsername());
			psm.setString(2, u.getPassword());

			psm.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public User find(String u, String p) throws AuthentificationException{

		try {
			String sql = "SELECT * from user_data where username ='" + u + "' AND password='" + p + "'";
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
			//System.out.println(sql);
			if (rs.next()) {

				sql = "SELECT * from CUSTOMER where ID='" + u + "'";
				//System.out.println(sql);
				rs = getConnection().createStatement().executeQuery(sql);
				if (rs.next()) {
					Customer c = new Customer();
						
					rs = getConnection().createStatement().executeQuery(sql);
					if(rs.next()) {
						
						c.setId(rs.getString("id"));
						c.setTitle(rs.getString("title"));
						c.setFirstName(rs.getString("first_name"));
						c.setLastName(rs.getString("last_name"));
						c.setPhone(rs.getString("phone"));
						c.setAdress(rs.getString("address"));
						c.setPostcode(rs.getString("postcode"));
						c.setCity(rs.getString("city"));
						c.setCity_id(rs.getInt("city_id"));
						
						return c;
					}
					
				}

				sql = "SELECT * from user_data, employee where username ='" + u + "' AND password='" + p + "' AND employee.id='"+u+"'";
				//System.out.println(sql);
				rs = getConnection().createStatement().executeQuery(sql);
				User e = new User();
				if (rs.next()) {				
					
					e.setUsername(rs.getString("username"));
					e.setPassword(rs.getString("password"));
					
					
					return e;
				}
				rs.close();
			}
			
			throw new TravelException();
		
		
			} 
			catch (Exception e) {
				throw new AuthentificationException(e.getMessage());
			}
	}
	
//	public static void main(String[] args) throws AuthentificationException, TravelException{
//		UserDaoJdbc udaojdbc = new UserDaoJdbc();
//		//System.out.println(udaojdbc.find("bradyabd", "123456789"));
//		udaojdbc.find("bradyabd", "123456789");
//		System.out.println(udaojdbc.find("bradyabd", "123456789"));
//		Calendar c = Calendar.getInstance();
//		Date d = new Date(c.getTime().getTime());
//		System.out.println(d);
//	}
}