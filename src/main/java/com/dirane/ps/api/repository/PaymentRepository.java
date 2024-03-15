package com.dirane.ps.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dirane.ps.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
