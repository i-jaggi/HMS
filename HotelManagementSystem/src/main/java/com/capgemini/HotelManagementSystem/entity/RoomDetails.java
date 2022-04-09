package com.capgemini.HotelManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "room_details_tbl")
public class RoomDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int room_id;

	@ManyToOne
	@JoinColumn(name = "hotel_id")
	@JsonIgnoreProperties("rooms")
	private Hotel hotel;
	
	@ManyToOne
	private BookingDetails bookingDetails;
	
	private int room_no;
	private String room_type;
	private double rate_per_day;
	private boolean is_available;
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public BookingDetails getBookingDetails() {
		return bookingDetails;
	}
	public void setBookingDetails(BookingDetails bookingDetails) {
		this.bookingDetails = bookingDetails;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public double getRate_per_day() {
		return rate_per_day;
	}
	public void setRate_per_day(double rate_per_day) {
		this.rate_per_day = rate_per_day;
	}
	public boolean isAvailable() {
		return is_available;
	}
	public void setAvailable(boolean is_available) {
		this.is_available = is_available;
	}
	

}
