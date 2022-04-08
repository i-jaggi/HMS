package com.capgemini.HotelManagementSystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.HotelManagementSystem.entity.Hotel;
import com.capgemini.HotelManagementSystem.entity.User;
import com.capgemini.HotelManagementSystem.exception.ResourceNotFoundException;
import com.capgemini.HotelManagementSystem.repository.IHotelRepository;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepository hotelRepository;

	@Override
	public Hotel addHotel(Hotel hotel) {
		Hotel savedHotel = hotelRepository.save(hotel);
		return savedHotel;
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		Hotel updateHotel = showHotel(hotel);
		updateHotel = hotelRepository.save(updateHotel);
		return updateHotel;
	}

	@Override
	public void removeHotel(Hotel hotel) {
		Hotel hotel1 = showHotel(hotel);
		if(hotel1==null) {
			throw new ResourceNotFoundException("Hotel Not found with id : " + hotel1.getHotel_id());
		}
		hotelRepository.delete(hotel1);
		
	}

	@Override
	public List<Hotel> showAllHotels() {
		List<Hotel> list = new ArrayList<>();
		return list;
	}

	@Override
	public Hotel showHotel(Hotel hotel) {
		Optional<Hotel> optionalHotel = hotelRepository.findById(hotel.getHotel_id());
		if (optionalHotel.isEmpty())
			throw new ResourceNotFoundException("User Not found with id : " + hotel.getHotel_id());
		Hotel hotel1 = optionalHotel.get();
		return hotel1;
	}

}
