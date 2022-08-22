package com.bookmycar.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import sun.java2d.d3d.D3DScreenUpdateManager;

@Entity
public class Booking{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int bookingId;
	
	@ManyToOne
	@JoinColumn(name="car_id")
	private Car car;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	
	private String bookingStatus;
	private Date dateBookingPlaced;
	private Date dateBookingCancelled;
	
	
	
	public Date getDateBookingPlaced() {
		return dateBookingPlaced;
	}
	public void setDateBookingPlaced(Date dateBookingPlaced) {
		this.dateBookingPlaced = dateBookingPlaced;
	}
	public Date getDateBookingCancelled() {
		return dateBookingCancelled;
	}
	public void setDateBookingCancelled(Date dateBookingCancelled) {
		this.dateBookingCancelled = dateBookingCancelled;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
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
	
	
	
	public Booking(Car car, User user, String bookingStatus, Date dateBookingPlaced, Date dateBookingCancelled) {
		super();
		this.car = car;
		this.user = user;
		this.bookingStatus = bookingStatus;
		this.dateBookingPlaced = dateBookingPlaced;
		this.dateBookingCancelled = dateBookingCancelled;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", car=" + car + ", user=" + user + ", bookingStatus="
				+ bookingStatus + ", dateBookingPlaced=" + dateBookingPlaced + ", dateBookingCancelled="
				+ dateBookingCancelled + "]";
	}
	
	
	
	
	

}
