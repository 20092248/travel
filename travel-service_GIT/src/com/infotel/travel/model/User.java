package com.infotel.travel.model;

public class User {
	private String username, password;

	public User() {
		super();
		this.username = "";
		this.password = "";
	}
	
	public User(String usename, String password) {
		super();
		this.username = usename;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String usename) {
		this.username = usename;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [usename=" + username + ", password=" + password + "]";
	}
	
	
	
}

