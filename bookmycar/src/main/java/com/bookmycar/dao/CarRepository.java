package com.bookmycar.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bookmycar.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>
{
	public Optional<Car> findAllByBrand(String brand);
	
	public List<Car> findAllByBookingStatus(String bookingStatus);

	public Optional<Car> findByCarId(int id);

	public List<Car> findAllByModel(String model);

	public List<Car> findAllByColor(String color);

	public List<Car> findAllByVariant(String variant);

	public List<Car> findAllByPriceLessThan(double price);

	public List<Car> findAllByTransmissionType(String transmissionType);

	public Optional<Car> findAllByKmsDrivenLessThan(float kmsDriven);

	public List<Car> findAllByRegistrationDate(float registrationDate);

	public List<Car> findAllByFuelType(String fuelType);

	public List<Car> findAllBySeatingCapacity(int seatingCapacity);

	public List<Car> findAllByMaxPower(float maxPower);

	public List<Car> findAllByMaxTorque(float maxTorque);

	public List<Car> findAllByFuelTankCapacity(int fuelTankCapacity);

	public Optional<Car> findAllByMileageGreaterThanEqual(float mileage);

	public String findByRegistrationNumber(String registrationNumber);
}
