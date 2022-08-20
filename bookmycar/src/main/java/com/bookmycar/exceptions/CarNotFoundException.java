package com.bookmycar.exceptions;

public class CarNotFoundException extends Exception
{
	public String getMessage()
	{
		return "Car Not Found";
	}
}
