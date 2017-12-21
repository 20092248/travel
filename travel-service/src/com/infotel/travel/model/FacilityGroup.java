package com.infotel.travel.model;

import java.util.ArrayList;

public class FacilityGroup {
	private int id;
	private String code;
	private String description;	
	private ArrayList<FacilityService> group;
	
	
	public FacilityGroup(int id, String code, String description, ArrayList<FacilityService> group) {
		super();
		this.id = id;
		this.code = code;
		this.description = description;
		this.group = group;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public ArrayList<FacilityService> getGroup() {
		return group;
	}


	public void setGroup(ArrayList<FacilityService> group) {
		this.group = group;
	}
	
	
	
	
	
	
	
	
}
