package com.lti.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mypack.model.AdminDetails;
import com.lti.mypack.repository.AdminDetailsRepository;

@Service
@Transactional
public class AdminDetailsServiceImpl implements AdminDetailsService {
	
	@Autowired
	AdminDetailsRepository adRepo;

	@Override
	public List<AdminDetails> getAllAdmins() {
		
		return adRepo.findAll();
	}

	@Override
	public boolean addAdmin(AdminDetails admindetails) {
		adRepo.save(admindetails);
		return true;
	}

	@Override
	public boolean updateAdmin(AdminDetails admindetails) {
		AdminDetails a=adRepo.findById(admindetails.getAdmin_id()).get();
		a=admindetails;
		adRepo.save(admindetails);
		return true;
	}

	@Override
	public boolean deleteAdmin(AdminDetails admindetails) {
		adRepo.delete(admindetails);
	
		return true;
	}

	
}
