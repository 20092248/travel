package com.infotel.travel.dao.jdbc;

import java.sql.ResultSet;

import com.infotel.travel.dao.EmployeeDao;
import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Employee;
import com.infotel.travel.model.User;
import com.infotel.travel.model.Coordinates;
import com.infotel.travel.model.Customer;
import com.infotel.travel.model.Employee;

public class EmployeeDaoJdbc extends AbstractDaoJdbc implements EmployeeDao {

	@Override
	public Employee findByName(String query) throws TravelException {
		Employee e = new Employee();
		try {
			String sql = "SELECT * from employee where id like '%"+ query+"%' or name like '%"+query+"%'";
			System.out.println(sql);
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
			if(rs.next()) {
				
				e.setId(rs.getString("id"));
				e.setName(rs.getString("name"));
			}
		}catch (Exception ex) {
				throw new TravelException(ex.getMessage());
			}
		return  e;
	}
	

	public static void main(String[] args){
		
	}
}
