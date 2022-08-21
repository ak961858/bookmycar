package com.bookmycar.controller;

import java.util.List;
import java.util.Optional;

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
	
	@GetMapping
	public List<Car> getCars()
	{
		return carService.getAllCars();
	}
	
	@GetMapping("/id/{id}")
	public Car getCarById(@PathVariable int id) throws CarNotFoundException
	{
		return carService.getCarById(id);
	}
	
	@GetMapping("/brand/{brand}")
	public List<Car> getCarByBrand(@PathVariable String brand) 
	{
		return carService.getCarByBrand(brand);
	}
	@GetMapping("/model/{model}")
	public List<Car> getCarByModel(@PathVariable String model ){
		return carService.getCarByModel(model);
	}
	@GetMapping("/color/{color}")
	public List<Car> getCarByColor(@PathVariable String color){
		return carService.getCarByColor(color);
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
