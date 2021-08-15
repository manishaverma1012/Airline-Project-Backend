package com.lti.mypack.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.model.Passenger;
import com.lti.mypack.service.PassengersService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/rest/api")
public class PassengersController {
	@Autowired
	PassengersService paService;
	@GetMapping("/passengers")
	public List<Passenger> showDetails(){
		
		return paService.getAllPassengers();
		
	}
	@PostMapping("/passengers")
	public boolean addPassenger(@RequestBody Passenger passenger) {
		return paService.addAllPassenger(passenger);
	}
	@GetMapping("/maxpassengerid")
	public Passenger getPassenger() {
		return paService.getPassenger();
	}
	
	

}
