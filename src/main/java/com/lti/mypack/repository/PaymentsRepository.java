package com.lti.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.mypack.model.Payments;
@Repository
public interface PaymentsRepository extends JpaRepository<Payments, Integer> {

}
