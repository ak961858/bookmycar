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
}
