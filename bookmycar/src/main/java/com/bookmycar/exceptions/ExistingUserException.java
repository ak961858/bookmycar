package com.bookmycar.exceptions;

public class ExistingUserException extends Exception
{
	public String getMessage()
	{
		return "User Already Exists";
	}
}
