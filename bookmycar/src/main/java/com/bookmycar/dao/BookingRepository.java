package com.bookmycar.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmycar.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
