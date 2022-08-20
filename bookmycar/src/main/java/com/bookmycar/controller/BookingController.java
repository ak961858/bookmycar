package com.bookmycar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmycar.exceptions.CarNotFoundException;
import com.bookmycar.exceptions.UserNotFoundException;
import com.bookmycar.model.Booking;
import com.bookmycar.model.User;
import com.bookmycar.service.BookingService;
import com.bookmycar.service.UserService;

import sun.print.resources.serviceui;

@RestController
@RequestMapping("/bookings")
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	
	@GetMapping("/{userId}/{carId}")
	public Booking placeOrder(@PathVariable("userId") int userId,@PathVariable("carId") int carId) throws UserNotFoundException,CarNotFoundException {
		return bookingService.placeOrder(userId, carId);
	}

}
