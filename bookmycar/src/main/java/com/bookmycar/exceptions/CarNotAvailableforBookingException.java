package com.bookmycar.exceptions;

public class CarNotAvailableforBookingException extends Exception{
	
	public String getMesssage() {
		return "Car not available for booking";
	}
}
