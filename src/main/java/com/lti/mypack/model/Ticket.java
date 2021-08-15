package com.lti.mypack.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {
	@Id
	@SequenceGenerator(name = "mySeqGen", sequenceName = "myseq",
    initialValue = 500, allocationSize = 1)
@GeneratedValue(generator = "mySeqGen")
	private int ticket_id;
	private String seat_no;
	private int passenger_id;
	private String ticket_status;
	private String ticket_cancellation_date;
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="passenger_id")
//	private Passenger passenger;
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(int ticket_id, String seat_no, int passenger_id, String ticket_status,
			String ticket_cancellation_date, Passenger passenger) {
		super();
		this.ticket_id = ticket_id;
		this.seat_no = seat_no;
		this.passenger_id = passenger_id;
		this.ticket_status = ticket_status;
		this.ticket_cancellation_date = ticket_cancellation_date;
		
	}
	public int getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}
	public String getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(String seat_no) {
		this.seat_no = seat_no;
	}
	public int getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}
	public String getTicket_status() {
		return ticket_status;
	}
	public void setTicket_status(String ticket_status) {
		this.ticket_status = ticket_status;
	}
	public String getTicket_cancellation_date() {
		return ticket_cancellation_date;
	}
	public void setTicket_cancellation_date(String ticket_cancellation_date) {
		this.ticket_cancellation_date = ticket_cancellation_date;
	}
	
	
}