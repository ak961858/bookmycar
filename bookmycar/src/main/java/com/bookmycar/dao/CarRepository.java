package com.bookmycar.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmycar.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>
{
	public Optional<Car> findByCarId(int id);

}
