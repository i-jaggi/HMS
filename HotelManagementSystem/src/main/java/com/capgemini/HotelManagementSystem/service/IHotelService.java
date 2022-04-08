package com.capgemini.HotelManagementSystem.service;

import java.util.List;

import com.capgemini.HotelManagementSystem.entity.Hotel;

public interface IHotelService {
	public Hotel addHotel(Hotel hotel);

	public Hotel updateHotel(Hotel hotel);

	public void removeHotel(Hotel hotel);

	public List<Hotel> showAllHotels();

	public Hotel showHotel(Hotel id);
}
