package com.capgemini.HotelManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.HotelManagementSystem.entity.BookingDetails;
import com.capgemini.HotelManagementSystem.payload.OrderRequestPayload;
import com.capgemini.HotelManagementSystem.service.IBookingDetailsService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/booking")
public class BookingDetailsController {
	@Autowired
	private IBookingDetailsService bookingDetailsService;

	@PostMapping("/save")
	public ResponseEntity<?> bookRooms(@RequestBody OrderRequestPayload reqPayload) {
		ResponseEntity<?> responseEntity = null;
		BookingDetails bookkingDetails = new BookingDetails();
		bookkingDetails.setUser_id(reqPayload.getUser_id());
		bookkingDetails.setHotel_id(reqPayload.getHotel_id());
		//bookkingDetails.setR
		
		return null;
	}
}
