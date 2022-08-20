package com.bookmycar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmycar.dao.LoginDao;
import com.bookmycar.exceptions.UserNotFoundException;
import com.bookmycar.model.Login;

@Service
public class LoginService 
{
	@Autowired
	LoginDao dao;
	
	public Login getLoginDetailsByUserId(int id) throws UserNotFoundException
	{
		Optional<Login> details = dao.findByUserId(id);
		if(details.isPresent())
		{
			return details.get();
		}
		throw new UserNotFoundException();
	}

}
