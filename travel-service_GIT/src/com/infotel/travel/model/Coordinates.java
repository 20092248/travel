package com.infotel.travel.model;

public class Coordinates {
	double latitude, longitude, distance;

	public Coordinates() {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Coordinates(double latitude, double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Coordinates(double latitude, double longitude, double distance) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.distance = distance;
	}


	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	@Override
	public String toString() {
		return "Coordinates [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
	
}
