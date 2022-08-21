package com.bookmycar.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmycar.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>
{
	public List<Car> findAllByBrand(String brand);

	public List<Car> findAllByModel(String model);

	public List<Car> findAllByColor(String color);

	public List<Car> findAllByVariant(String variant);

	public List<Car> findAllByPrice(double price);

	public List<Car> findAllByTransmissionType(String transmissionType);

	public List<Car> findAllByKmsDriven(float kmsDriven);

	public List<Car> findAllByRegistrationDate(float registrationDate);

	public List<Car> findAllByFuelType(String fuelType);

	public List<Car> findAllBySeatingCapacity(int seatingCapacity);

	public List<Car> findAllByMaxPower(float maxPower);

	public List<Car> findAllByMaxTorque(float maxTorque);

	public List<Car> findAllByFuelTankCapacity(int fuelTankCapacity);

	public List<Car> findAllByMileage(float mileage);

	public String findByRegistrationNumber(String registrationNumber);
}
