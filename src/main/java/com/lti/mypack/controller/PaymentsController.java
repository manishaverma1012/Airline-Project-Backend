package com.lti.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.model.Payments;
import com.lti.mypack.service.PaymentsService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/rest/api")
public class PaymentsController {
	
	@Autowired
	PaymentsService paService;
	@GetMapping("/payments")
	public List<Payments> showAll(){
		return paService.getAllPayments();
	}
	@PostMapping("/payments")
	public boolean addPayment(@RequestBody Payments payments) {
		return paService.addPayment(payments);
	}
	
	@PutMapping("/payments")
	public boolean updatePayment(@RequestBody Payments payments) {
		return paService.updatePayment(payments);
	}
	
	@DeleteMapping("/payments")
	public boolean deletePayment(@RequestBody Payments payments) {
		return paService.deletePayment(payments);
	}
	
	

}
