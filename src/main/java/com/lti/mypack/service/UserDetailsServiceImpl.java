package com.lti.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mypack.model.UserDetails;
import com.lti.mypack.repository.UserDetailsRepository;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	UserDetailsRepository udRepo;

	@Override
	public List<UserDetails> getAllUsers() {
		
		return udRepo.findAll();
	}

	@Override
	public boolean addUsers(UserDetails userdetails) {
		udRepo.save(userdetails);
		return false;
	}

	@Override
	public boolean updateUsers(UserDetails userdetails) {
		UserDetails u=udRepo.findById(userdetails.getUserid()).get();
		u=userdetails;
		udRepo.save(u);
		return true;
	}

	@Override
	public boolean deleteUsers(UserDetails userdetails) {
		udRepo.delete(userdetails);
		return true;
	}

}
