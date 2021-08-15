package com.lti.mypack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mypack.model.Ticket;
import com.lti.mypack.repository.TicketRepository;
@Service
@Transactional
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	TicketRepository tRepo;

	@Override
	public List<Ticket> getAllTickets() {
		
		return tRepo.findAll();
	}

	@Override
	public boolean addTicket(Ticket ticket) {
		tRepo.save(ticket);
		return true;
	}

	@Override
	public boolean updateTicket(Ticket ticket) {
		Ticket t=tRepo.findById(ticket.getTicket_id()).get();
		t=ticket;
		tRepo.save(t);
		return true;
	}

	@Override
	public boolean deleteTicket(Ticket ticket) {
		tRepo.delete(ticket);
		return true;
	}

	@Override
	public Ticket findTicket(int ticket_id) {
		
		return tRepo.findById(ticket_id).get();
	}

	@Override
	public boolean deleteTicketById(int ticket_id) {
		tRepo.deleteById(ticket_id);
		return true;
	}

}
