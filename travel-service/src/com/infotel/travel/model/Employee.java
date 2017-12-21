package com.infotel.travel.model;

public class Employee extends User {
	
	private String id;
	
	public Employee(){
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String name;

	public Employee(String usename, String password, String name) {
		super(usename, password);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
	

}
