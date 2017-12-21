package com.infotel.travel.dao;

import java.util.List;

import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Airline;
import com.infotel.travel.model.Employee;

public interface EmployeeDao {
	
	public Employee findByName(String query) throws TravelException;
	
}
