package com.lti.mypack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.mypack.model.Passenger;
@Repository
public interface PassengersRepository extends JpaRepository<Passenger, Integer> {
	
	@Query("from Passenger p where p.passenger_id=(select max(pm.passenger_id)from Passenger pm)")
	public Passenger getPassenger();
}
