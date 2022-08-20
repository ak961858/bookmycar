package com.bookmycar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmycar.dao.CarRepository;
import com.bookmycar.model.Car;

@Service
public class CarService {
	@Autowired
	CarRepository carRepository;
	
	public List<Car> getAllCars()
	{
		return carRepository.findAll();
	}
	
	public Car getCarById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Car> getCarByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Car AddCar(Car c) {		
		return carRepository.save(c);
	}
	
	public String DeleteCarById(int id)
	{ 
		Optional<Car> c=carRepository.findById(id);
		if(c.isPresent())
		{
			carRepository.delete(c.get());
			return "Car deleted Successfully";
		}
		return "Car not Found";
		
	}

	public Car updateCar(Car toUpdate) {
		// TODO Auto-generated method stub
		return null;
	}


}
