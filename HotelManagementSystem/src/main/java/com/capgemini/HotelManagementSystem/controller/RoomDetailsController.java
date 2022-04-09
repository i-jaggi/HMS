package com.capgemini.HotelManagementSystem.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.HotelManagementSystem.entity.RoomDetails;
import com.capgemini.HotelManagementSystem.service.RoomDetailsServiceImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/roomdetails")
public class RoomDetailsController {

	@Autowired
	private RoomDetailsServiceImpl roomDetailsService;

	@PostMapping("/add")
	public ResponseEntity<RoomDetails> addRoomDetails(@RequestBody RoomDetails roomDetails) {
		RoomDetails roomDetails1 = roomDetailsService.addRoomDetails(roomDetails);
		ResponseEntity<RoomDetails> responseEntity = new ResponseEntity<>(roomDetails1, HttpStatus.CREATED);
		return responseEntity;
	}

	@GetMapping("/all")
	public List<RoomDetails> getAllRoomDetails() {
		return roomDetailsService.showAllRoomDetails();
	}
	
}
