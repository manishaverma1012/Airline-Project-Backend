package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.Payments;


public interface PaymentsService {
	public List<Payments> getAllPayments();
	public boolean addPayment(Payments payments);
	public boolean updatePayment(Payments payments);
	public boolean deletePayment(Payments payments);

}
