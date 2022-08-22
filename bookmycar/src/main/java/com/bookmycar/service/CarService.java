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
	
	public List<Car> getAllCars(String role)
	{
		if(role.equals("admin"))
			return carRepository.findAll();
		else {
			
			return carRepository.findAllByBookingStatus("available");
		}
	}
	
	
	public Car getCarById(int id) throws CarNotFoundException{
		// TODO Auto-generated method stub
		Optional<Car> car = carRepository.findByCarId(id);
		if(car.isPresent())
		{
			return car.get();
		}
		throw new CarNotFoundException();
	}
	
	
	
	
	public List<Car> getCarByBrand(String brand) {
		return carRepository.findAllByBrand(brand);
	}
	public List<Car> getCarByModel(String model) {
		// TODO Auto-generated method stub
		return carRepository.findAllByModel(model);
	}
	public List<Car> getCarByCarCity(String city)
	{
		return carRepository.findAllByCarCity(city);
	}
	public List<Car> getCarByColor(String color) {
		// TODO Auto-generated method stub
		return carRepository.findAllByColor(color);
	}
	public List<Car> getCarByVariant(String variant) {
		// TODO Auto-generated method stub
		return carRepository.findAllByVariant(variant);
	}
	public List<Car> getCarByPrice(double price) {
		// TODO Auto-generated method stub
		return carRepository.findAllByPriceLessThan(price);
	}
	public List<Car> getCarByTransmissionType(String transmissionType) {
		// TODO Auto-generated method stub
		return carRepository.findAllByTransmissionType(transmissionType);
	}
	public List<Car> getCarByKmsDriven(float kmsDriven) {
		// TODO Auto-generated method stub
		return carRepository.findAllByKmsDrivenLessThan(kmsDriven);
		
	}
	public List<Car> getCarRegistrationDate(float registrationDate) {
		// TODO Auto-generated method stub
		return carRepository.findAllByRegistrationDate(registrationDate);
	}
	public List<Car> getCarByFuelType(String fuelType) {
		// TODO Auto-generated method stub
		return carRepository.findAllByFuelType(fuelType);
	}
	public List<Car> getCarBySeatingCapacity(int seatingCapacity) {
		// TODO Auto-generated method stub
		return carRepository.findAllBySeatingCapacity(seatingCapacity);
	}
	public List<Car> getCarByMaxPower(float maxPower) {
		// TODO Auto-generated method stub
		return carRepository.findAllByMaxPower(maxPower);
	}
	public List<Car> getCarByMaxTorque(float maxTorque) {
		// TODO Auto-generated method stub
		return carRepository.findAllByMaxTorque(maxTorque);
	}
	public List<Car> getCarByFuelTankCapacity(int fuelTankCapacity) {
		// TODO Auto-generated method stub
		return carRepository.findAllByFuelTankCapacity(fuelTankCapacity);
	}
	public List<Car> getCarByMileage(float mileage){
		// TODO Auto-generated method stub
		return carRepository.findAllByMileageGreaterThanEqual(mileage);
		
	}
	
	public String getCarByRegistrationNumber(String registrationNumber) {
		// TODO Auto-generated method stub
		return carRepository.findByRegistrationNumber(registrationNumber);
	}



	public Car addCar(Car c) {
		c.setBookingStatus("available");
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
		Car c = carRepository.findById(toUpdate.getCarId()).get();
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
		c.setBookingStatus(toUpdate.getBookingStatus());
		
		return carRepository.save(c);
	}

}
