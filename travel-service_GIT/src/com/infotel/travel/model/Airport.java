package com.infotel.travel.model;

public class Airport {
	private int id;
	private String name, city, country, iata, icao, timezone;
	private Coordinates coordinates;
	

	public Airport(int id, String name, String city, String country, String iata, String icao, String timezone,
			Coordinates coordinates) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.country = country;
		this.iata = iata;
		this.icao = icao;
		this.timezone = timezone;
		this.coordinates = coordinates;
	}

	public Airport() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}

	public String getIcao() {
		return icao;
	}

	public void setIcao(String icao) {
		this.icao = icao;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	@Override
	public String toString() {
		return "\nAirport [id=" + id + ", name=" + name + ", city=" + city + ", country=" + country + ", iata=" + iata
				+ ", icao=" + icao + ", timezone=" + timezone + ", coordinates=" + coordinates + "]";
	}
	
	

}
