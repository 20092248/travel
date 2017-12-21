package com.infotel.travel.model;

public class Customer extends User {
	private String id,title,firstName,lastName,phone,adress,postcode,city;
	private int city_id;
	
	public Customer() {

	}
	
	public Customer(String id, String usename, String password, String title, String firstName, String lastName, String phone,
			String adress, String postcode, String city, int city_id) {
		super(usename, password);
		this.id = id;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.adress = adress;
		this.postcode = postcode;
		this.city = city;
		this.city_id = city_id;
	}

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", title=" + title + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phone=" + phone + ", adress=" + adress + ", postcode=" + postcode + ", city=" + city + ", city_id="
				+ city_id + "]";
	}
	
	

}
