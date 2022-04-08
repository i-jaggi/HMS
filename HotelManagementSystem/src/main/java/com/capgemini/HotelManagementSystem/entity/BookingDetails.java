package com.capgemini.HotelManagementSystem.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "booking_details_tbl")
public class BookingDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int booking_id;

	@OneToMany(mappedBy = "bookingDetails", cascade = CascadeType.PERSIST)
	private List<Payments> paymentDetails = new ArrayList<>();
	private int hotel_id;

	private int user_id;

	private LocalDate booked_from;
	private LocalDate booked_to;
	private int no_of_adults;
	private int no_of_children;
	private double amount;

	@OneToMany(mappedBy = "bookingDetails", cascade = CascadeType.PERSIST)
	private List<RoomDetails> roomDetails = new ArrayList<>();

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public List<Payments> getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(List<Payments> paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public int getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public LocalDate getBooked_from() {
		return booked_from;
	}

	public void setBooked_from(LocalDate booked_from) {
		this.booked_from = booked_from;
	}

	public LocalDate getBooked_to() {
		return booked_to;
	}

	public void setBooked_to(LocalDate booked_to) {
		this.booked_to = booked_to;
	}

	public int getNo_of_adults() {
		return no_of_adults;
	}

	public void setNo_of_adults(int no_of_adults) {
		this.no_of_adults = no_of_adults;
	}

	public int getNo_of_children() {
		return no_of_children;
	}

	public void setNo_of_children(int no_of_children) {
		this.no_of_children = no_of_children;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public List<RoomDetails> getRoomDetails() {
		return roomDetails;
	}

	public void setRoomDetails(List<RoomDetails> roomDetails) {
		this.roomDetails = roomDetails;
	}
	
}
