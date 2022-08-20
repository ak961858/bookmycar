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

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id",nullable = false)
	private User user;
	@Column(unique = true,nullable = false)
	private int carId;
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
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	
	
	public Booking(User user, int carId, String bookingStatus) {
		super();
		this.user = user;
		this.carId = carId;
		this.bookingStatus = bookingStatus;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
