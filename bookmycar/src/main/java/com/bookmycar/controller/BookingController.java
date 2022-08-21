package com.bookmycar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmycar.exceptions.CarNotAvailableforBookingException;
import com.bookmycar.exceptions.CarNotFoundException;
import com.bookmycar.exceptions.UserNotFoundException;
import com.bookmycar.model.Booking;
import com.bookmycar.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@GetMapping("/{email}/{carId}")
	public Booking placeOrder(@PathVariable("email") String email,@PathVariable("carId") int carId) throws UserNotFoundException,CarNotFoundException, CarNotAvailableforBookingException {
		return bookingService.placeOrder(email, carId);
	}
	
	@GetMapping
	public List<Booking> viewAllBookings(){
		return bookingService.viewAllBookings();
	}
	
	//delete a booking should not exist because once an order is placed,it's status should be changed instead
	//of deleting the order
	/*
	 * public String deleteBooking(int id) { return
	 * "deletion of a booking not allowed"; }
	 */
	
	public Booking viewBookingByUser() {
		return null;
	}

}
