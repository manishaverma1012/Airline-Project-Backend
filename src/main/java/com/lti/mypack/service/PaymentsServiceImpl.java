package com.lti.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mypack.model.Payments;
import com.lti.mypack.repository.PaymentsRepository;
@Service
@Transactional
public class PaymentsServiceImpl implements PaymentsService {
	
	@Autowired
	PaymentsRepository pRepo;

	@Override
	public List<Payments> getAllPayments() {
		
		return pRepo.findAll();
	}

	@Override
	public boolean addPayment(Payments payments) {
		pRepo.save(payments);
		return true;
	}

	@Override
	public boolean updatePayment(Payments payments) {
		Payments p=pRepo.findById(payments.getPayment_id()).get();
		p=payments;
		pRepo.save(p);
		return true;
	}

	@Override
	public boolean deletePayment(Payments payments) {
		pRepo.delete(payments);
		return true;
	}

}
