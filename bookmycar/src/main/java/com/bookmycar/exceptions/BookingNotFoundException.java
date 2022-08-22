package com.bookmycar.exceptions;

public class BookingNotFoundException extends Exception{
	public String getMessage() {
		return "No such Booking exist";
	}

}
