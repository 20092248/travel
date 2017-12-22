package com.infotel.travel.model;

import java.time.LocalTime;
import java.util.ArrayList;

public class Flight {
	private int id;
	private String flightNumber;
	private LocalTime departure;
	private LocalTime arrival;
	private String equipment;
	private Airport destAirport; 
	private Airport sourceAirport;
	private Airline airline_id;
	
	
	public Flight(int id, String flightNumber, LocalTime departure, LocalTime arrival, String equipment,
			Airport destAirport, Airport sourceAirport, Airline airline_id) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.departure = departure;
		this.arrival = arrival;
		this.equipment = equipment;
		this.destAirport = destAirport;
		this.sourceAirport = sourceAirport;
		this.airline_id = airline_id;
	}


	public Flight() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}


	public LocalTime getDeparture() {
		return departure;
	}


	public void setDeparture(LocalTime departure) {
		this.departure = departure;
	}


	public LocalTime getArrival() {
		return arrival;
	}


	public void setArrival(LocalTime arrival) {
		this.arrival = arrival;
	}


	public String getEquipment() {
		return equipment;
	}


	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}


	public Airport getDestAirport() {
		return destAirport;
	}


	public void setDestAirport(Airport destAirport) {
		this.destAirport = destAirport;
	}


	public Airport getSourceAirport() {
		return sourceAirport;
	}


	public void setSourceAirport(Airport sourceAirport) {
		this.sourceAirport = sourceAirport;
	}


	public Airline getAirline_id() {
		return airline_id;
	}


	public void setAirline_id(Airline airline_id) {
		this.airline_id = airline_id;
	}


	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightNumber=" + flightNumber + ", departure=" + departure + ", arrival="
				+ arrival + ", equipment=" + equipment + ", destAirport=" + destAirport + ", sourceAirport="
				+ sourceAirport + ", airline_id=" + airline_id + "]";
	}
	
	
	
	
	
	

	


	
}