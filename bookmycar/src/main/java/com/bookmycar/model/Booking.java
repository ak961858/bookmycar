package com.bookmycar.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.security.auth.login.FailedLoginException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id",nullable = false)
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="car_id")
	@JsonIgnoreProperties("booking")
	private Car car;
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	private String bookingStatus;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	
	
	
	
	public Booking(User user, Car car, String bookingStatus) {
		super();
		this.user = user;
		this.car = car;
		this.bookingStatus = bookingStatus;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
