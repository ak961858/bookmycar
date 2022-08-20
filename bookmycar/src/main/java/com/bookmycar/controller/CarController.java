package com.bookmycar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmycar.service.CarService;

@RestController
@RequestMapping("/web")
public class CarController {
	@Autowired
	CarService carService;
	
	@GetMapping("/car")
	public List<Car> getCar()
	{
		return CarService.getCar();
	}

}
