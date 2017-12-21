package com.infotel.travel.model;

import java.util.Arrays;

public class AccomodationImage {

	private int id;
	private byte[] content;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "AccomodationImage [id=" + id + ", content=" + Arrays.toString(content) + "]";
	}
	
	
	
}
