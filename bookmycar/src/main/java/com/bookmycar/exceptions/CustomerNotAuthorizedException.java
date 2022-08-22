package com.bookmycar.exceptions;

public class CustomerNotAuthorizedException extends Exception{
	public String getMesssage() {
		return "Not Authorized to perfom this function";
	}

}
