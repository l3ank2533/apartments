package com.hibernate.annotation.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TYPE")
public class Type {
	
	@Id
	@GeneratedValue
	@Column(name="ID_TYPE")
	private Integer id;
	
	@Column(name="NAME")
	private String name;

	@Column(name="PRICE")
	private String price;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
