package com.capgemini.HotelManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.HotelManagementSystem.entity.BookingDetails;
import com.capgemini.HotelManagementSystem.exception.ResourceNotFoundException;
import com.capgemini.HotelManagementSystem.repository.IBookingDetailsRepository;

@Service
public class BookingDetailsServiceImpl implements IBookingDetailsService {

	@Autowired
	private IBookingDetailsRepository bookingDetailsRepository;

	@Override
	public BookingDetails addBookingDetails(BookingDetails bookingDetails) {
		BookingDetails savedBookingDetails = bookingDetailsRepository.save(bookingDetails);
		return savedBookingDetails;
	}

	@Override
	public BookingDetails updateBookingDetails(BookingDetails bookingDetails) {

		BookingDetails updateBookingDetails = showBookingDetails(bookingDetails);
		updateBookingDetails = bookingDetailsRepository.save(updateBookingDetails);
		return updateBookingDetails;
	}

	@Override
	public BookingDetails removeBookingDetails(BookingDetails bookingDetails) {

		BookingDetails updateBookingDetails = showBookingDetails(bookingDetails);
		updateBookingDetails = bookingDetailsRepository.save(updateBookingDetails);
		return updateBookingDetails;
	}

	@Override
	public List<BookingDetails> showAllBookingDetails() {

		List<BookingDetails> allBookingDetails = bookingDetailsRepository.findAll();
		return allBookingDetails;
	}

	@Override
	public BookingDetails showBookingDetails(BookingDetails bookingDetails) {
		Optional<BookingDetails> optionalBookingDetails = bookingDetailsRepository.findById(bookingDetails.getBooking_id());
		if (optionalBookingDetails.isEmpty())
			throw new ResourceNotFoundException("User Not found with id : " + bookingDetails.getBooking_id());
		BookingDetails bookingDetails1 = optionalBookingDetails.get();
		return bookingDetails1;
	
	}
}
