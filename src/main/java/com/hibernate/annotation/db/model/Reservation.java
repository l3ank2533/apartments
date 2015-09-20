package com.hibernate.annotation.db.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="RESERVATION")
@Entity
public class Reservation {

	@Id
	@GeneratedValue
	@Column(name="ID_RESERVATION")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="ID_CUSTOMER")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="ID_ROOM")
	private Room room;
	
	@Column(name="CHECK_IN_DATE")
	private Date checkInDate;
	
	@Column(name="CHECK_OUT_DATE")
	private Date checkOutDate;
	
	@Column(name="DEPOSIT_DATE")
	private Date deposit_date;
	
	@Column(name="DEPOSIT")
	private Integer dePosit;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public Date getDeposit_date() {
		return deposit_date;
	}

	public void setDeposit_date(Date deposit_date) {
		this.deposit_date = deposit_date;
	}

	public Integer getDePosit() {
		return dePosit;
	}

	public void setDePosit(Integer dePosit) {
		this.dePosit = dePosit;
	} 
}
