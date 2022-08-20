package com.bookmycar.exceptions;

public class UserNotFoundException extends Exception
{
	public String getMessage()
	{
		return "Invalid UserId";
	}
}
