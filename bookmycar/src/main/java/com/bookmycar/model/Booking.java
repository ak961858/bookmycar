package com.bookmycar.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Booking {
	@Id
	@GeneratedValue
	private int id;
	private User user;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private Car car;
	

}
