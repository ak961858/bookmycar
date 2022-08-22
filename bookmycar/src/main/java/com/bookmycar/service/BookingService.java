package com.bookmycar.service;

import java.util.List;
import java.util.Optional;

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
	

	public Booking placeOrder(String email,int carId) throws UserNotFoundException,CarNotFoundException, CarNotAvailableforBookingException{
		
		User user = userService.getLoginDetailsByEmail(email);//check whether such user exists
		Car car=carService.getCarById(carId);//check whether such car exists
			
		//check whether car is available for booking
		if(car.getBookingStatus().equals("available")) {
			//if car available for booking
			//create a new booking
			Booking booking=new Booking(user,car,"order placed");
			car.setBookingStatus("order placed");//set car status from available to order placed,update in db
			carService.updateCar(car);
			booking=bookingRepository.save(booking);//confirm the booking
			return booking;
		}
		else {
			//car not available for booking,car status not available
			throw new CarNotAvailableforBookingException();
		}
	}
	
	public List<Booking> viewAllBookings(){
		return bookingRepository.findAll();
	}
	
	public String viewBookingByUser(int id) throws UserNotFoundException {
		User user = userService.getLoginDetailsByUserId(id);
		if(bookingRepository.findAllByUser(user).isEmpty()) {
			return "No Bookings exist for this user";
		}
		else {
			return bookingRepository.findAllByUser(user).toString();
		}
	}
	
	public String viewBookingByCar(int id) throws CarNotFoundException {
		Car car=carService.getCarById(id);
		if(bookingRepository.findAllByCar(car).isEmpty()) {
			return "No Bookings exist for this car";
		}
		else {
			return bookingRepository.findAllByCar(car).toString();
		}
	}
	
	public Booking viewBookingByBookingId(int id) {
		return bookingRepository.findByBookingId(id).get();
	}
	
	public String cancelBooking(int id) throws CarNotFoundException {
		//check if booking exists or not
		Optional<Booking> booking=bookingRepository.findByBookingId(id);
		if(booking.isPresent()) {
			Booking updateBooking=booking.get();
			//if booking exists,update the booking status in that car as available and booking status in booking as cancelled
		
			Car car=carService.getCarById(updateBooking.getCar().getCarId());//get that particular car
			car.setBookingStatus("available");//set status as available
			car=carService.updateCar(car);//update the car details
			updateBooking.setBookingStatus("cancelled");//update booking entity status as cancelled
			bookingRepository.saveAndFlush(updateBooking);//save the booking
			return "Booking cancelled";
		}
		else {
			//booking with such id does not exists
			return "No such Booking exists";
		}
	}

}
