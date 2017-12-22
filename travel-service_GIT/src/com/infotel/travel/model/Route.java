package com.infotel.travel.model;

import java.util.ArrayList;

public class Route {
	private int id;
	private ArrayList<Airport> destAirport, sourceAirport;
	private ArrayList<Airport> destALLAirport, sourceAllAirport;
	private Flight flight;

	public Route(int id, ArrayList<Airport> destAirport, ArrayList<Airport> sourceAirport,
			ArrayList<Airport> destALLAirport, ArrayList<Airport> sourceAllAirport, Flight flight) {
		super();
		this.id = id;
		this.destAirport = destAirport;
		this.sourceAirport = sourceAirport;
		this.destALLAirport = destALLAirport;
		this.sourceAllAirport = sourceAllAirport;
		this.flight = flight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Airport> getDestAirport() {
		return destAirport;
	}

	public void setDestAirport(ArrayList<Airport> destAirport) {
		this.destAirport = destAirport;
	}

	public ArrayList<Airport> getSourceAirport() {
		return sourceAirport;
	}

	public void setSourceAirport(ArrayList<Airport> sourceAirport) {
		this.sourceAirport = sourceAirport;
	}

	public ArrayList<Airport> getDestALLAirport() {
		return destALLAirport;
	}

	public void setDestALLAirport(ArrayList<Airport> destALLAirport) {
		this.destALLAirport = destALLAirport;
	}

	public ArrayList<Airport> getSourceAllAirport() {
		return sourceAllAirport;
	}

	public void setSourceAllAirport(ArrayList<Airport> sourceAllAirport) {
		this.sourceAllAirport = sourceAllAirport;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

}
