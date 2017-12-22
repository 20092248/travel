package com.infotel.travel.dao;

import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Ticket;

public interface TicketDao {

	public void create(Ticket ticket) throws TravelException;
	public Ticket findById(int query) throws TravelException;
}
