package com.bookmycar.exceptions;

public class UserNotFoundException extends Exception
{
	public String getMessage()
	{
		return "No user found with the given email!";
	}
}
