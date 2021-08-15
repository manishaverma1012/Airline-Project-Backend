package com.lti.mypack.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="passengers_list")
public class Passenger {
	@Id
//	 @SequenceGenerator(name="seq_pid", sequenceName="seq_pid", allocationSize=1)
 //   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_pid")
	@SequenceGenerator(name = "mySeqGen", sequenceName = "pidseq",
    initialValue = 1500, allocationSize = 1)
@GeneratedValue(generator = "mySeqGen")
	private int passenger_id;
	private int booking_id;
	private String passenger_first_name;
	private String passenger_last_name;
	private int passenger_age;
	private String passenger_gender;
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(int passenger_id, int booking_id, String passenger_first_name, String passenger_last_name,
			int passenger_age, String passenger_gender) {
		super();
		this.passenger_id = passenger_id;
		this.booking_id = booking_id;
		this.passenger_first_name = passenger_first_name;
		this.passenger_last_name = passenger_last_name;
		this.passenger_age = passenger_age;
		this.passenger_gender = passenger_gender;
	}
	public int getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public String getPassenger_first_name() {
		return passenger_first_name;
	}
	public void setPassenger_first_name(String passenger_first_name) {
		this.passenger_first_name = passenger_first_name;
	}
	public String getPassenger_last_name() {
		return passenger_last_name;
	}
	public void setPassenger_last_name(String passenger_last_name) {
		this.passenger_last_name = passenger_last_name;
	}
	public int getPassenger_age() {
		return passenger_age;
	}
	public void setPassenger_age(int passenger_age) {
		this.passenger_age = passenger_age;
	}
	public String getPassenger_gender() {
		return passenger_gender;
	}
	public void setPassenger_gender(String passenger_gender) {
		this.passenger_gender = passenger_gender;
	}
	
	
	
}	
	