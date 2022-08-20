package com.bookmycar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int carId;
	
	@Column(nullable = false)
	String carname;
	
	@Column(nullable = false)
	String color;
	
	@Column(nullable = false)
	double price;
	
	@Column(nullable = false)
	int noOfAvailableCars;
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}


	public Car(String carname, String color, double price, int noOfAvailableCars) {
		super();
		this.carname = carname;
		this.color = color;
		this.price = price;
		this.noOfAvailableCars = noOfAvailableCars;
	}


	public String getCarname() {
		return carname;
	}


	public void setCarname(String carname) {
		this.carname = carname;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getNoOfAvailableCars() {
		return noOfAvailableCars;
	}


	public void setNoOfAvailableCars(int noOfAvailableCars) {
		this.noOfAvailableCars = noOfAvailableCars;
	}


	public int getCarId() {
		return carId;
	}
	
	

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + carId;
		result = prime * result + ((carname == null) ? 0 : carname.hashCode());
		result = prime * result + noOfAvailableCars;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carId != other.carId)
			return false;
		if (carname == null) {
			if (other.carname != null)
				return false;
		} else if (!carname.equals(other.carname))
			return false;
		if (noOfAvailableCars != other.noOfAvailableCars)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carname=" + carname + ", color=" + color + ", price=" + price + ", noOfAvailableCars="
				+ noOfAvailableCars + "]";
	}
	
	
	
	
}
