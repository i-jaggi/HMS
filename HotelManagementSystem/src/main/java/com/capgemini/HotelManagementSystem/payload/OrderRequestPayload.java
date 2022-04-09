package com.capgemini.HotelManagementSystem.payload;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.HotelManagementSystem.entity.RoomDetails;

public class OrderRequestPayload {
	private int hotel_id;

	private int user_id;
	private List<BookedRooms> rooms = new ArrayList<>();

	public List<BookedRooms> getRooms() {
		return rooms;
	}
	public void setRooms(List<BookedRooms> rooms) {
		this.rooms = rooms;
	}
	private LocalDate booked_from;
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
	private LocalDate booked_to;
	private int no_of_adults;
	private int no_of_children;

}
