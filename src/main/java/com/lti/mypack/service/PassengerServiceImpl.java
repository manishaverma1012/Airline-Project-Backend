package com.lti.mypack.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mypack.model.Passenger;
import com.lti.mypack.repository.PassengersRepository;

@Service
@Transactional
public class PassengerServiceImpl implements PassengersService {
	
	private int noOfPaaengers=3;
	private int i=0;
	@Autowired
	PassengersRepository paRepo;

	@Override
	public List<Passenger> getAllPassengers() {
		
		return paRepo.findAll();
	}

	@Override
	public boolean addAllPassenger(Passenger passenger)
	{
		
		paRepo.save(passenger);
		
		return true;
	}

	@Override
	public Passenger getPassenger() {
		
		return paRepo.getPassenger();
	}
	

	
/*	@Override
	public List<Passenger> addAllPassenger(Passenger passenger ) {
		
		return (List<Passenger>) paRepo.save(passenger);
	}*/

}
