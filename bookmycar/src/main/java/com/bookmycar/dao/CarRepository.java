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
}
