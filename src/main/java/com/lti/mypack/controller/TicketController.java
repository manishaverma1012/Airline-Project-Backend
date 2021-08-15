package com.lti.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.model.Ticket;
import com.lti.mypack.service.TicketService;

@RestController
@RequestMapping("/rest/api")
public class TicketController {
	
	@Autowired
	TicketService tService;
	@GetMapping("/ticket")
	public List<Ticket> showAll(){
		return tService.getAllTickets();
	}
	
	@GetMapping("/ticketsbyid/{ticket_id}")
	public Ticket getTicketById(@PathVariable(value="ticket_id")int ticket_id) {
		return tService.findTicket(ticket_id);
	}
	@PostMapping("/ticket")
	public boolean addTicket(@RequestBody Ticket ticket) {
		return tService.addTicket(ticket);
	}
	@PutMapping("/ticket")
	public boolean updateTicket(@RequestBody Ticket ticket) {
		return tService.updateTicket(ticket);
	}
	@DeleteMapping("/ticket")
	public boolean deleteTicket(@RequestBody Ticket ticket) {
		return tService.deleteTicket(ticket);
	}
	@DeleteMapping("/ticket/{ticket_id}")
	public boolean deleteTicket(@PathVariable(value="ticket_id")int ticket_id) {
		return tService.deleteTicketById(ticket_id);
	}

}
