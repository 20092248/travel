package com.infotel.travel.model;

public class Airline {
	
	private int id;
	private String name;
	private String iata;
	private String country;
	private String icao;
	


	public Airline(int id, String name, String iata, String country, String icao) {
		super();
		this.id = id;
		this.name = name;
		this.iata = iata;
		this.country = country;
		this.icao = icao;
	}
	
	

	public Airline() {
		super();
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

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}



	public String getIcao() {
		return icao;
	}



	public void setIcao(String icao) {
		this.icao = icao;
	}



	@Override
	public String toString() {
		return "Airline [id=" + id + ", name=" + name + ", iata=" + iata + ", country=" + country + ", icao=" + icao
				+ "]";
	}
	
	
	
	
	
	

}
