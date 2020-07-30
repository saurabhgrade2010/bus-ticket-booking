package com.incture.model;

import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bus")
public class Bus {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="bus_id")
	@Id
	private int bus_id;
	
	@Column(name="bus_name")
	private String bus_name;
	
	@Column(name="no_of_seats")
	private int no_of_seats;
	
	@Column(name="price")
	private float price;
	
	@Column(name="source")
	private String source;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="arrivalTime")
	private Time arrivalTime;
	
	@Column(name="departTime")
	private Time departTime;
	
	@Column(name="availableSeats")
	private int availableSeats;
	
	public Bus()
	{
		super();
	}

	public int getBus_id() {
		return bus_id;
	}

	public void setBus_id(int bus_id) {
		this.bus_id = bus_id;
	}

	public String getBus_name() {
		return bus_name;
	}

	public void setBus_name(String bus_name) {
		this.bus_name = bus_name;
	}

	public int getNo_of_seats() {
		return no_of_seats;
	}

	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Time getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Time getDepartTime() {
		return departTime;
	}

	public void setDepartTime(Time departTime) {
		this.departTime = departTime;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Bus(int bus_id, String bus_name, int no_of_seats, float price, String source, String destination,
			Time arrivalTime, Time departTime, int availableSeats) {
		super();
		this.bus_id = bus_id;
		this.bus_name = bus_name;
		this.no_of_seats = no_of_seats;
		this.price = price;
		this.source = source;
		this.destination = destination;
		this.arrivalTime = arrivalTime;
		this.departTime = departTime;
		this.availableSeats = availableSeats;
	}

	@Override
	public String toString() {
		return "Bus [bus_id=" + bus_id + ", bus_name=" + bus_name + ", no_of_seats=" + no_of_seats + ", price=" + price
				+ ", source=" + source + ", destination=" + destination + ", arrivalTime=" + arrivalTime
				+ ", departTime=" + departTime + ", availableSeats=" + availableSeats + "]";
	}
	
	
}
