package com.capgemini.HotelManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.HotelManagementSystem.entity.Payments;
import com.capgemini.HotelManagementSystem.repository.IPaymentRepository;

@Service
public class PaymentServiceImpl implements IPaymentService{

	@Autowired
	private IPaymentRepository paymentRepository;
	
	@Override
	public Payments addPayment(Payments payment) {
		Payments savedPayment = paymentRepository.save(payment);
		return savedPayment;
	}

}
