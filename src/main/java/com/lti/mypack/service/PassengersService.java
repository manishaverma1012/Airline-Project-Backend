package com.lti.mypack.service;

import java.util.ArrayList;
import java.util.List;

import com.lti.mypack.model.Passenger;

public interface PassengersService {
	
	public List<Passenger> getAllPassengers();
//	public boolean addPassenger(List<Passenger> passenger);
//	public List<Passenger> addAllPassenger();
//	public List<Passenger> addAllPassenger(Passenger passenger);
	public boolean addAllPassenger(Passenger passenger);
	public Passenger getPassenger();

}
