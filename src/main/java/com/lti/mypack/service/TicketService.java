package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.Ticket;

public interface TicketService {

	public List<Ticket> getAllTickets();
	public boolean addTicket(Ticket ticket);
	public boolean updateTicket(Ticket ticket);
	public boolean deleteTicket(Ticket ticket);
	public Ticket findTicket(int ticket_id);
	public boolean deleteTicketById(int ticket_id);

}
