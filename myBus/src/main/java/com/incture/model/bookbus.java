package com.incture.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="bookbus")
public class bookbus {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="bookingId")
	private int bookingId;
	
	@Column
	private Date bookingDate;
	
	@Column(name="user_id")
	@ManyToMany
	@JoinColumn(name="user_id")
	private List<User> userList;
	
	@Column(name="bus_id")
	@ManyToMany
	@JoinColumn(name="bus_id")
	private List<Bus> busList;
	
	
	public bookbus()
	{
		super();
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public List<Bus> getBusList() {
		return busList;
	}

	public void setBusList(List<Bus> busList) {
		this.busList = busList;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public bookbus(int bookingId, List<User> userList, List<Bus> busList, Date bookingDate) {
		super();
		this.bookingId = bookingId;
		this.userList = userList;
		this.busList = busList;
		this.bookingDate = bookingDate;
	}

	@Override
	public String toString() {
		return "bookbus [bookingId=" + bookingId + ", userList=" + userList + ", busList=" + busList + ", bookingDate="
				+ bookingDate + "]";
	}
	
	
}
