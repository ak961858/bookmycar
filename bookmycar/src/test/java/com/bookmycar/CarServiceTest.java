package com.bookmycar;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.bookmycar.exceptions.CarNotFoundException;
import com.bookmycar.model.Car;
import com.bookmycar.service.CarService;

@SpringBootTest
public class CarServiceTest {
	
	@Autowired
	private CarService carService;
	
	
	//We should use @MockBean Annotation if we dont want to perform CRUD operations on our DB during testing phase
	//just test the Service Layer
	//@MockBean
	//private CarRepository carRepository;
	
	@BeforeEach
	void setUp() {
		
		
	}
	
	@Test
	void testGetCarById() throws CarNotFoundException {
		Car testCar=carService.getCarById(3);
		assertNotNull(testCar);
		assertEquals(3, testCar.getCarId());
	}
	
	@Test
	void testGetCarByCarCity(){
		List<Car> testCarList=carService.getCarByCarCity("pune");
		System.out.println(testCarList);
		assertNotNull(testCarList);
	}

	@Test
	void testGetCarByCarColor() throws CarNotFoundException {
		List<Car> testCarList=carService.getCarByColor("black");
		System.out.println(testCarList);
		assertNotNull(testCarList);
	}
	@Test
	void testGetCarByCarPrice() throws CarNotFoundException {
		List<Car> testCarList=carService.getCarByPrice(600000.00);
		System.out.println(testCarList);
		assertNotNull(testCarList);
	}
	@Test
	void testGetCarByCarTransmission() throws CarNotFoundException {
		List<Car> testCarList=carService.getCarByTransmissionType("heavy loaded");
		System.out.println(testCarList);
		assertNotNull(testCarList);
	}

	@Test
	void testGetCarByCarFuelType() throws CarNotFoundException {
		List<Car> testCarList=carService.getCarByFuelType("petrol");
		System.out.println(testCarList);
		assertNotNull(testCarList);
	}
	@Test
	void testGetCarByKmsDriven() throws CarNotFoundException {
		List<Car> testCarList=carService.getCarByKmsDriven(200.52f);
		System.out.println(testCarList);
		assertNotNull(testCarList);
	}
	@Test
	void testGetCarBySeatingCapacity() throws CarNotFoundException {
		List<Car> testCarList=carService.getCarBySeatingCapacity(5);
		System.out.println(testCarList);
		assertNotNull(testCarList);
	}
	@Test
	void testGetCarByMaxPower() throws CarNotFoundException {
		List<Car> testCarList=carService.getCarByMaxPower(200.55f);
		System.out.println(testCarList);
		assertNotNull(testCarList);
	}
	@Test
	void testGetCarByMaxTorque() throws CarNotFoundException {
		List<Car> testCarList=carService.getCarByMaxTorque(200.55f);
		System.out.println(testCarList);
		assertNotNull(testCarList);
	}
	
}
