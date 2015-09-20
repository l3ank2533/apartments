package com.hibernate.annotation.db.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="BILL")
@Entity
public class Bill {
	
	@Id
	@GeneratedValue
	@Column(name="ID_BILL")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="ID_ROOM")
	private Room room;
	
	@ManyToOne
	@JoinColumn(name="ID_CUSTOMER")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="ID_EMPLOYEE")
	private Employee employee;
	
	@Column(name="UNIT_WATER")
	private Integer water;
	
	@Column(name="UNIT_ELECTRIC")
	private Integer electric;
	
	@Column(name="BILL_DATE")
	private Date date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Integer getWater() {
		return water;
	}

	public void setWater(Integer water) {
		this.water = water;
	}

	public Integer getElectric() {
		return electric;
	}

	public void setElectric(Integer electric) {
		this.electric = electric;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
