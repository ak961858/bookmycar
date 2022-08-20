package com.bookmycar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookmycar.exceptions.UserNotFoundException;
import com.bookmycar.model.Login;
import com.bookmycar.service.LoginService;

@RestController
public class LoginController
{
	
	@Autowired
	LoginService service;
	
	@PostMapping("/login")
	public String checkLogin(@RequestBody Login login)
	{
		Login actual = null;
		try 
		{
			actual = service.getLoginDetailsByUserId(login.getUserId());
		} 
		catch (UserNotFoundException e) 
		{
			return e.getMessage();
		}
		
		if(actual.getPassword().equals(login.getPassword()))
		{
			return "Login Successful";
		}
		return "Login Failed";
	}

}
