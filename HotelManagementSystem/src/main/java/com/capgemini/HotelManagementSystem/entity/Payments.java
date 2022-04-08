package com.capgemini.HotelManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payments_tbl")
public class Payments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int payment_id;
	
	@ManyToOne
	@JoinColumn(name = "booking_id")
	private BookingDetails bookingDetails;
	private double amount;
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public BookingDetails getBookingDetails() {
		return bookingDetails;
	}
	public void setBookingDetails(BookingDetails bookingDetails) {
		this.bookingDetails = bookingDetails;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
