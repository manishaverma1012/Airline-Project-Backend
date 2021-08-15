package com.lti.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.model.AdminDetails;
import com.lti.mypack.service.AdminDetailsService;

@RestController
@RequestMapping("/rest/api")
public class AdminController {
	@Autowired
	AdminDetailsService adService;
	@GetMapping("/admindetails")
	public List<AdminDetails> showDetails(){
		return adService.getAllAdmins();

	}
	@PostMapping("/admindetails")
	public boolean addAdmin(@RequestBody AdminDetails admindetails) {
		return adService.addAdmin(admindetails);
	}
	
	@PutMapping("/admindetails")
	public boolean updateAdmin(@RequestBody AdminDetails admindetails) {
		return adService.updateAdmin(admindetails);
	}
	
	@DeleteMapping("/admindetails")
	public boolean deleteAdmin(@RequestBody AdminDetails admindetails) {
		return adService.deleteAdmin(admindetails);
	}

}
