package com.bookmycar.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmycar.exceptions.CarNotFoundException;
import com.bookmycar.model.Car;
import com.bookmycar.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {
	@Autowired
	CarService carService;
	
	//request To view all cars based on role-admin or customer
	@GetMapping("/{role}")
	public List<Car> getCars(@PathVariable("role") String role)
	{
		return carService.getAllCars(role);
	}
	
	
	//view car by carId
	@GetMapping("/id/{id}")
	public Car getCarById(@PathVariable("id") int id) throws CarNotFoundException
	{
		return carService.getCarById(id);
	}
	
	//view car by brand name
	@GetMapping("/brand/{brand}")
	public List<Car> getCarByBrand(@PathVariable String brand) 
	{
		return carService.getCarByBrand(brand);
	}
	
	@GetMapping("/city/{city}")
	public List<Car> getCarByCarCity(@PathVariable String city) 
	{
		return carService.getCarByCarCity(city);
	}
	@GetMapping("/model/{model}")
	public List<Car> getCarByModel(@PathVariable String model ){
		return carService.getCarByModel(model);
	}
	@GetMapping("/color/{color}")
	public List<Car> getCarByColor(@PathVariable String color){
		return carService.getCarByColor(color);
	}
	@GetMapping("/variant/{variant}")
	public List<Car> getCarByVariant(@PathVariable String variant)	{
		return carService.getCarByVariant(variant);
	}
	@GetMapping("/price/{price}")
	public List<Car> getCarByPrice(@PathVariable double price)
	{
		return carService.getCarByPrice(price);
	}
	@GetMapping("/transmissionType/{transmissionType}")
	public List<Car> getCarByTransmissionType(@PathVariable String transmissionType){
		return carService.getCarByTransmissionType(transmissionType);
	}
	@GetMapping("/kms/{kmsDriven}")
	public List<Car> getCarByKmsDriven(@PathVariable float kmsDriven){
		return carService. getCarByKmsDriven( kmsDriven);
	}
	@GetMapping("/registrationDate/{registrationDate}")
	public List<Car> getCarByRegistrationDate(@PathVariable float registrationDate){
		return carService. getCarRegistrationDate(registrationDate );
	}
	@GetMapping("/fuelType/{fuelType}")
	public List<Car> getCarByFuelType(@PathVariable String fuelType){
		return carService. getCarByFuelType(fuelType );
	}
	@GetMapping("/seatingCapacity/{seatingCapacity}")
	public List<Car> getCarBySeatingCapacity(@PathVariable int seatingCapacity){
		return carService. getCarBySeatingCapacity(seatingCapacity );
	}
	@GetMapping("/maxPower/{maxPower}")
	public List<Car> getCarByMaxPower(@PathVariable float maxPower){
		return carService. getCarByMaxPower(maxPower);
	}
	@GetMapping("/maxTorque/{maxTorque}")
	public List<Car> getCarByMaxTorque(@PathVariable float maxTorque){
		return carService. getCarByMaxTorque(maxTorque);
	}
	@GetMapping("/fuelTankCapacity/{fuelTankCapacity}")
	public List<Car> getCarByFuelTankCapacity(@PathVariable int fuelTankCapacity){
		return carService. getCarByFuelTankCapacity(fuelTankCapacity);
	}
	@GetMapping("/mileage/{mileage}")
	public List<Car> getCarByMileage(@PathVariable float mileage){
		return carService. getCarByMileage(mileage);
	}
	@GetMapping("/registrationNumber/{registrationNumber}")
	public String getCarByRegistrationNumber(@PathVariable String registrationNumber)
	{
		return carService.getCarByRegistrationNumber(registrationNumber);
	}
	@PostMapping
    public Car addCar(@RequestBody Car car)
    {
        return carService.addCar(car);
        
    }
    
    @DeleteMapping("/id/{id}")   
    public String deleteCarById(@PathVariable int id)
    {
        return carService.DeleteCarById(id);
    }
    
    @PutMapping
    public Car updateCar(@RequestBody Car toUpdate)
    {
        return carService.updateCar(toUpdate);
    }
}
