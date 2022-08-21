package com.bookmycar.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carId;
	
	private String carCity;
	private String brand;
	private String model;
	private String variant;
	private double price;
	private String transmissionType;
	private float kmsDriven;
	private String registrationNumber;
	private String registrationDate;
	private String fuelType;
	private int seatingCapacity;
	private float maxPower;
	private float maxTorque;
	private int fuelTankCapacity;
	private float mileage;
	private String color;
	
	@OneToOne(mappedBy = "car",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("car")
	private Booking booking;

	
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	
	public String getCarCity() {
		return carCity;
	}
	public void setCarCity(String carCity) {
		this.carCity = carCity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVariant() {
		return variant;
	}
	public void setVariant(String variant) {
		this.variant = variant;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTransmissionType() {
		return transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	public float getKmsDriven() {
		return kmsDriven;
	}
	public void setKmsDriven(float kmsDriven) {
		this.kmsDriven = kmsDriven;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public float getMaxPower() {
		return maxPower;
	}
	public void setMaxPower(float maxPower) {
		this.maxPower = maxPower;
	}
	public float getMaxTorque() {
		return maxTorque;
	}
	public void setMaxTorque(float maxTorque) {
		this.maxTorque = maxTorque;
	}
	public int getFuelTankCapacity() {
		return fuelTankCapacity;
	}
	public void setFuelTankCapacity(int fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}
	public float getMileage() {
		return mileage;
	}
	public void setMileage(float mileage) {
		this.mileage = mileage;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Car(String carCity, String brand, String model, String variant, double price, String transmissionType,
			float kmsDriven, String registrationNumber, String registrationDate, String fuelType, int seatingCapacity,
			float maxPower, float maxTorque, int fuelTankCapacity, float mileage, String color,	Booking booking) {
		super();
		this.carCity = carCity;
		this.brand = brand;
		this.model = model;
		this.variant = variant;
		this.price = price;
		this.transmissionType = transmissionType;
		this.kmsDriven = kmsDriven;
		this.registrationNumber = registrationNumber;
		this.registrationDate = registrationDate;
		this.fuelType = fuelType;
		this.seatingCapacity = seatingCapacity;
		this.maxPower = maxPower;
		this.maxTorque = maxTorque;
		this.fuelTankCapacity = fuelTankCapacity;
		this.mileage = mileage;
		this.color = color;
		this.booking = booking;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
