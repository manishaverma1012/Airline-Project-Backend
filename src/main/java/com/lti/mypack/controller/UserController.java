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
import org.springframework.web.bind.annotation.CrossOrigin;

import com.lti.mypack.model.UserDetails;
import com.lti.mypack.service.UserDetailsService;

@RestController
@RequestMapping("/rest/api")
@CrossOrigin(origins="https://localhost:4200")
public class UserController {
	
	@Autowired
	UserDetailsService udService;
	@GetMapping("/userdetails")
	public List<UserDetails> showDetails(){
		return udService.getAllUsers();
	}
	@PostMapping("/userdetails")
	public boolean addUser(@RequestBody UserDetails userdetails) {
		
		return udService.addUsers(userdetails);
	}
	@PutMapping("/userdetails")
	public boolean updateUser(@RequestBody UserDetails userdetails) {
		return udService.updateUsers(userdetails);
	}
	@DeleteMapping("/userdetails")
	public boolean deleteUser(@RequestBody UserDetails userdetails) {
		return udService.deleteUsers(userdetails);
	}
	

}
