package com.dirane.ps.api.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dirane.ps.api.entity.Payment;
import com.dirane.ps.api.repository.PaymentRepository;
import java.util.Random;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository repository;
	
	public Payment doPayment(Payment payment) {
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return repository.save(payment);
	}

	
	
	public String paymentProcessing() {
		//api should be 3rd party payment gateway (paypal, payatm..)
		return new Random().nextBoolean()?"success":"false";
	}
}
