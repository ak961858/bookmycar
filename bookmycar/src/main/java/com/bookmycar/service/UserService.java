package com.bookmycar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmycar.dao.UserRepository;
import com.bookmycar.exceptions.ExistingUserException;
import com.bookmycar.exceptions.UserNotFoundException;
import com.bookmycar.model.User;

@Service
public class UserService 
{
	@Autowired
	UserRepository userRepository;
	

	public String isValidLogin(User login) throws UserNotFoundException
    {
        Optional<User> details = userRepository.findByEmail(login.getEmail());
        if(details.isPresent())
        {
            if(details.get().getPassword().equals(login.getPassword()))
            {
                return "Login Successful";
            }
            else
            {
                return "Login Failed";
            }
        }
        throw new UserNotFoundException();
    }
	public User getLoginDetailsByUserId(int userId) throws UserNotFoundException
	{
		Optional<User> details = userRepository.findByUserId(userId);
		if(details.isPresent())
		{
			return details.get();
		}
		throw new UserNotFoundException();
	}
	
	public User getLoginDetailsByEmail(String email) throws UserNotFoundException
	{
		Optional<User> details = userRepository.findByEmail(email);
		if(details.isPresent())
		{
			return details.get();
		}
		throw new UserNotFoundException();
	}
	
	public String getAll(){
		List<User> users=userRepository.findAll();
		if(users.isEmpty()) {
			return "No Users registered yet";
		}
		return users.toString();
				
	}
	
	public String createUser(User newUser) throws ExistingUserException
	{
		if(userRepository.findByEmail(newUser.getEmail()).isPresent())
		{
			throw new ExistingUserException();
		}
		userRepository.save(newUser);
		return "New User Created Successfully";
	}

}
