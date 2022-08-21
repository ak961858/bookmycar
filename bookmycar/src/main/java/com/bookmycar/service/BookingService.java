package com.bookmycar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmycar.dao.BookingRepository;
import com.bookmycar.exceptions.CarNotAvailableforBookingException;
import com.bookmycar.exceptions.CarNotFoundException;
import com.bookmycar.exceptions.UserNotFoundException;
import com.bookmycar.model.Booking;
import com.bookmycar.model.Car;
import com.bookmycar.model.User;

@Service
public class BookingService {
	
	@Autowired
	BookingRepository bookingRepository;
	@Autowired
	UserService userService;
	@Autowired
	CarService carService;
	
	public Booking placeOrder(int userId,int carId) throws UserNotFoundException,CarNotFoundException, CarNotAvailableforBookingException{
			
			User user = userService.getLoginDetailsByUserId(userId);
			Car car=carService.getCarById(carId);
				Booking booking=new Booking(user,car,"order placed");			
				booking=bookingRepository.save(booking);
				//System.out.println("hello placed order");
				return booking;
			
			//return new Booking();
	}
	
	public List<Booking> viewAllBookings(){
		return bookingRepository.findAll();
	}
	

}
