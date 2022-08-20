package com.bookmycar.service;

import java.util.Collection;
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
import com.sun.org.apache.regexp.internal.recompile;

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
			if(car.getStatus().equals("available")){
				Booking booking=new Booking(user,carId,"order placed");			
				booking=bookingRepository.save(booking);
				car.setStatus("sold");
				car=carService.updateCar(car);
				//System.out.println("hello placed order");
				return booking;
			}
			else {
				throw new CarNotAvailableforBookingException();
			}
			
			//return new Booking();
	}
	
	public List<Booking> viewAllBookings(){
		return bookingRepository.findAll();
	}
	
	public String deleteBooking(int id) {
		 bookingRepository.deleteById(id);
		 return "deleted booking";
	}

}
