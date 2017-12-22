package com.infotel.travel.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import com.infotel.travel.util.MiscUtils;

public class Ticket implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private int nb_passengers;
	private Date outWardDate;
	private int outward_route_id;
	private int return_route_id;
	private Date outward_date;
	private Date return_date;
	private int accomodation_id;
	private int total_price;
	private String customer_id;
	
	
	
	
	public Ticket(int id, int nb_passengers, Date outWardDate, int outward_route_id, int return_route_id,
			Date outward_date, Date return_date, int accomodation_id, int total_price, String customer_id) {
		super();
		this.id = id;
		this.nb_passengers = nb_passengers;
		this.outWardDate = outWardDate;
		this.outward_route_id = outward_route_id;
		this.return_route_id = return_route_id;
		this.outward_date = outward_date;
		this.return_date = return_date;
		this.accomodation_id = accomodation_id;
		this.total_price = total_price;
		this.customer_id = customer_id;
	}

	public Ticket() {
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNb_passengers() {
		return nb_passengers;
	}

	public void setNb_passengers(int nb_passengers) {
		this.nb_passengers = nb_passengers;
	}

	public Date getOutWardDate() {
		return outWardDate;
	}

	public void setOutWardDate(Date outWardDate) {
		this.outWardDate = outWardDate;
	}

	public int getReturn_route_id() {
		return return_route_id;
	}

	public void setReturn_route_id(int return_route_id) {
		this.return_route_id = return_route_id;
	}

	public Date getOutward_date() {
		return outward_date;
	}

	public void setOutward_date(Date outward_date) {
		this.outward_date = outward_date;
	}

	public Date getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}

	public int getAccomodation_id() {
		return accomodation_id;
	}

	public void setAccomodation_id(int accomodation_id) {
		this.accomodation_id = accomodation_id;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public int getOutward_route_id() {
		return outward_route_id;
	}

	public void setOutward_route_id(int outward_route_id) {
		this.outward_route_id = outward_route_id;
	}
	
	
	
	
	
	
	

	



}
