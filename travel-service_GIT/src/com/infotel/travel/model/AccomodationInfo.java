package com.infotel.travel.model;

public class AccomodationInfo {
	
	private String name, types;
	private AccomodationType type;
	private String adress, typess;
	private String distance;
	private String cancellationFree;
	private int stars;
	private Coordinates coordinates;
	private FacilityService facilities;
	
	
	public AccomodationInfo() {
	}
	
	public AccomodationInfo(String name, String typess, String adress, String distance,
			String cancellationFees, int stars, Coordinates coordinates) {
		super();
		this.name = name;
		this.typess = typess;
		this.adress = adress;
		this.distance = distance;
		this.cancellationFree = cancellationFees;
		this.stars = stars;
		this.coordinates = coordinates;
	}
	
	public AccomodationInfo(String name, AccomodationType type, String adress, String distance,
			String cancellationFees, int stars, Coordinates coordinates) {
		super();
		this.name = name;
		this.type = type;
		this.adress = adress;
		this.distance = distance;
		this.cancellationFree = cancellationFees;
		this.stars = stars;
		this.coordinates = coordinates;
	}
	
	public AccomodationInfo(String name, AccomodationType type, String adress, String distance,
			String cancellationFees, int stars, Coordinates coordinates, FacilityService facilities) {
		super();
		this.name = name;
		this.type = type;
		this.adress = adress;
		this.distance = distance;
		this.cancellationFree = cancellationFees;
		this.stars = stars;
		this.coordinates = coordinates;
		this.facilities = facilities;
	}

	AccomodationInfo(AccomodationType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccomodationType getType() {
		return type;
	}

	public void setType(AccomodationType type) {
		this.type = type;
	}
	public void setType(String types) {
		this.types = types;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getCancellationFree() {
		return cancellationFree;
	}

	public void setCancellationFree(String cancellationFees) {
		this.cancellationFree = cancellationFees;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public double getCoordinatesLa() {
		return coordinates.getLatitude();
	}
	
	public void setCoordinatesLa(double latitude) {
		coordinates = new Coordinates();
		coordinates.setLatitude(latitude);
	}
	public double getCoordinatesLo() {
		return coordinates.getLongitude();
	}
	
	public void setCoordinatesLo(double longitude) {
		coordinates = new Coordinates();
		coordinates.setLongitude(longitude);
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(double lat,double lng) {
		this.coordinates = new Coordinates(lat,lng);		
	}
	
	

	public FacilityService getFacilities() {
		return facilities;
	}

	public void setFacilities(FacilityService facilities) {
		this.facilities = facilities;
	}

	@Override
	public String toString() {
		return "("+name +"," +type+","+stars+","+distance+")";
	}
	
	
	
}
