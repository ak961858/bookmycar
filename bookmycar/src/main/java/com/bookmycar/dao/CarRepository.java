package com.bookmycar.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.firstdemo.model.Book;

public interface CarRepository extends JpaRepository<Car, Integer>
{
	public Optional<Car> findByCarId(int id);

}
