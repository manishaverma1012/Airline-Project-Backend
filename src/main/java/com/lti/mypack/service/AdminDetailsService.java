package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.AdminDetails;

public interface AdminDetailsService {
	
	public List<AdminDetails> getAllAdmins();
	public boolean addAdmin(AdminDetails admindetails);
	public boolean updateAdmin(AdminDetails admindetails);
	public boolean deleteAdmin(AdminDetails admindetails);


}
