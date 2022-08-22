package com.bookmycar.exceptions;

public class IncorrectPasswordException extends Exception
{	
	public String getMessage()
	{
		return "Incorrect Password";
	}
}
