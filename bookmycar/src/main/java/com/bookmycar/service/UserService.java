package com.bookmycar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmycar.dao.UserRepository;
import com.bookmycar.exceptions.UserNotFoundException;
import com.bookmycar.model.User;

@Service
public class UserService 
{
	@Autowired
	UserRepository userRepository;
	
	public User getLoginDetailsByUserId(int id) throws UserNotFoundException
	{
		Optional<User> details = userRepository.findByUserId(id);
		if(details.isPresent())
		{
			return details.get();
		}
		throw new UserNotFoundException();
	}
	
	public List<User> getAll(){
		return userRepository.findAll();
	}

}
