package com.capgemini.HotelManagementSystem.entity;

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
@Table(name = "hotel_tbl")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hotel_id;
	private String city;
	private String hotel_name;
	private String address;
	private String description;
	private double avg_rate_per_day;
	private String email;
	private String phone1;
	private String phone2;
	private String website;
	
	@OneToMany(mappedBy = "hotel", cascade = CascadeType.PERSIST)
	private List<RoomDetails> rooms = new ArrayList<>();

	public int getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAvg_rate_per_day() {
		return avg_rate_per_day;
	}

	public void setAvg_rate_per_day(double avg_rate_per_day) {
		this.avg_rate_per_day = avg_rate_per_day;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public List<RoomDetails> getRooms() {
		return rooms;
	}

	public void setRooms(List<RoomDetails> rooms) {
		this.rooms = rooms;
	}
	

}
