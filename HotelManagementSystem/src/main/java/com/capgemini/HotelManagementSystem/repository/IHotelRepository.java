package com.capgemini.HotelManagementSystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.HotelManagementSystem.entity.Hotel;

public interface IHotelRepository extends JpaRepository<Hotel, Integer> {
//	public Hotel addHotel(Hotel hotel);
//	public Hotel updateHotel(Hotel hotel);
//	public Hotel removeHotel(Hotel hotel);
//	public List<Hotel> showAllHotels();
//	public Hotel showHotel(Hotel id);
}
