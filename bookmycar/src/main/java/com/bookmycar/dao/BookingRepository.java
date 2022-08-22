package com.bookmycar.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmycar.model.Booking;
import com.bookmycar.model.Car;
import com.bookmycar.model.User;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer>{
	public Optional<Booking> findByBookingId(int id);
	public List<Booking> findAllByUser(User user);
	public List<Booking> findAllByCar(Car car);
	//public Optional<Booking> findByUserAndCarAndBookingStatus(User user,Car car,String bookingStatus);

}
