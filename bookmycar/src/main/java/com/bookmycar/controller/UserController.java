package com.bookmycar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookmycar.exceptions.ExistingUserException;
import com.bookmycar.exceptions.UserNotFoundException;
import com.bookmycar.model.User;
import com.bookmycar.service.UserService;

@RestController
public class UserController
{
	
	@Autowired
	UserService service;
	
	@PostMapping("/login")
	public String checkLogin(@RequestBody User login)
	{
		User actual = null;
		try 
		{
			actual = service.getLoginDetailsByEmail(login.getEmail());
		} 
		catch (UserNotFoundException e) 
		{
			return e.getMessage();
		}
		
		if(actual.getPassword().equals(login.getPassword()))
		{
			return "Login Successful";
		}
		return "Incorrect Password";
	}
	
	
	
	@GetMapping("/users")
	public String getAll(){
		return service.getAll();
	}
	
	@PostMapping("/register")
	public String createUser(@RequestBody User newUser) 
	{
		try {
			return service.createUser(newUser);
		} catch (ExistingUserException e) {
			return e.getMessage();
		}
	}

}
