package com.capgemini.HotelManagementSystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.HotelManagementSystem.entity.Payments;

public interface IPaymentRepository extends JpaRepository<Payments, Integer>{
//	public Payments addPayment(Payments payment);
}
