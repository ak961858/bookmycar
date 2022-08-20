package com.bookmycar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmycar.dao.CarRepository;
import com.bookmycar.exceptions.CarNotFoundException;
import com.bookmycar.model.Car;

@Service
public class CarService {
	@Autowired
	CarRepository carRepository;
	
	public List<Car> getAllCars()
	{
		return carRepository.findAll();
	}
	
	public Car getCarById(int id) throws CarNotFoundException{
		// TODO Auto-generated method stub
		Optional<Car> car = carRepository.findById(id);
		if(car.isPresent())
		{
			return car.get();
		}
		throw new CarNotFoundException();
	}
	
	public List<Car> getCarByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Car addCar(Car c) {		
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

	public Car updateCar(Car toUpdate , int id) {
		// TODO Auto-generated method stub
		Car c = carRepository.findById(toUpdate.getId()).get();
		c.setCarCity(toUpdate.getCarCity());
		c.setBrand(toUpdate.getBrand());
		c.setModel(toUpdate.getModel());
		c.setVariant(toUpdate.getVariant());
		c.setPrice(toUpdate.getPrice());
		c.setTransmissionType(toUpdate.getTransmissionType());
		c.setKmsDriven(toUpdate.getKmsDriven());
		c.setRegistrationNumber(toUpdate.getRegistrationNumber());
		c.setRegistrationDate(toUpdate.getRegistrationDate());
		c.setFuelType(toUpdate.getFuelType());
		c.setSeatingCapacity(toUpdate.getSeatingCapacity());
		c.setMaxPower(toUpdate.getMaxPower());
		c.setMaxTorque(toUpdate.getMaxTorque());
		c.setFuelTankCapacity(toUpdate.getFuelTankCapacity());
		c.setMileage(toUpdate.getMileage());
		c.setColor(toUpdate.getColor());
		
		carRepository.save(c);
		
		return null;
	}


}
