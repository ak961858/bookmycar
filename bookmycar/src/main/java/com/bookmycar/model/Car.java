package com.bookmycar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Car {
	@Id
	@GeneratedValue
	private int id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
}
