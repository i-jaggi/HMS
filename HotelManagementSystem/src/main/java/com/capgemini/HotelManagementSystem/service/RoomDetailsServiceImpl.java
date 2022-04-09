package com.capgemini.HotelManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.HotelManagementSystem.entity.RoomDetails;
import com.capgemini.HotelManagementSystem.exception.ResourceNotFoundException;
import com.capgemini.HotelManagementSystem.repository.IRoomDetailsRepository;

@Service
public class RoomDetailsServiceImpl implements IRoomDetailsService {

	@Autowired
	private IRoomDetailsRepository roomDetailsRepository;

	@Override
	public RoomDetails addRoomDetails(RoomDetails roomDetails) {
		RoomDetails savedRoomDetails = roomDetailsRepository.save(roomDetails);
		return savedRoomDetails;
	}

	@Override
	public RoomDetails updateRoomDetails(RoomDetails roomDetails) {
		RoomDetails roomDetails1 = showRoomDetails(roomDetails.getRoom_id());
		return roomDetails1;
	}

	@Override
	public RoomDetails removeRoomDetails(RoomDetails roomDetails) {
		RoomDetails roomDetails1 = showRoomDetails(roomDetails.getRoom_id());
		if (roomDetails1 == null) {
			throw new ResourceNotFoundException("Room Not found with id : " + roomDetails.getRoom_id());
		}
		return roomDetails1;
	}

	@Override
	public List<RoomDetails> showAllRoomDetails() {
		List<RoomDetails> allRoomDetails = roomDetailsRepository.findAll();
		return allRoomDetails;
	}

	@Override
	public RoomDetails showRoomDetails(int roomDetails_id) {
		Optional<RoomDetails> optionalRoomDetails = roomDetailsRepository.findById(roomDetails_id);
		if (optionalRoomDetails.isEmpty())
			throw new ResourceNotFoundException("User Not found with id : " + roomDetails_id);
		RoomDetails roomDetails1 = optionalRoomDetails.get();
		return roomDetails1;
	}

}

//@GetMapping("/all")
//public List<Product> fetchAllProducts() {
//	List<Product> products = productService.getAllProducts();
//	return products;
//}
//
//@PostMapping("/save")
//public ResponseEntity<Product> addProduct(@RequestBody Product product) {
//	Product newProduct = productService.saveProduct(product);
//
//	ResponseEntity<Product> responseEntity = new ResponseEntity<>(newProduct, HttpStatus.CREATED);
//
//	return responseEntity;
