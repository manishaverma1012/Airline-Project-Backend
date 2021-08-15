package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.UserDetails;

public interface UserDetailsService {
	
	  public List<UserDetails> getAllUsers();
		public boolean addUsers(UserDetails userdetails);
		public boolean updateUsers(UserDetails userdetails);
		public boolean deleteUsers(UserDetails userdetails);

}
