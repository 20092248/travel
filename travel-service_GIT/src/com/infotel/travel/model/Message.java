package com.infotel.travel.model;

import java.util.ArrayList;
import java.util.Date;

public class Message {
	private Ticket ticket;
	private int id;
	private Date datetime; 
	private String content;
	private int parent_id;
	private int ticket_id;
	private String employee_id;
	private String customer_id;

	public Message() {
		
	}
	
	public Message(String customer_id, String content, Date datetime) {
		this.customer_id = ticket.getCustomer_id();
		this.content = content;
		this.datetime = datetime;
		
	}

	public Message(Date datetime, String content, int parent_id, int ticket_id, String employee_id) {
		super();
		this.datetime = datetime;
		this.content = content;
		this.parent_id = parent_id;
		this.ticket_id = ticket_id;
		this.employee_id = employee_id;
	}

	public Message(int id, Date datetime, String content, int parent_id, int ticket_id, String employee_id) {
		super();
		this.id = id;
		this.datetime = datetime;
		this.content = content;
		this.parent_id = parent_id;
		this.ticket_id = ticket_id;
		this.employee_id = employee_id;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Date getDatetime() {
		return datetime;
	}



	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public int getParent_id() {
		return parent_id;
	}



	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}



	public int getTicket_id() {
		return ticket_id;
	}



	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}



	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	
	
	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	
	@Override
	public String toString() {
		return "Message [datetime=" + datetime + ", content=" + content + ", employee_id=" + employee_id
				+ ", customer_id=" + customer_id + ", parent_id="+parent_id +"]";
	}

//	@Override
//	public String toString() {
//		return "Message [id=" + id + ", datetime=" + datetime + ", content=" + content + ", parent_id=" + parent_id
//				+ ", ticket_id=" + ticket_id + ", employee_id=" + employee_id + "]\n";
//	}
	
	
		
	

}