package com.hibernate.annotation.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="ROOM")
@NamedQueries({
		@NamedQuery(name = "FIND_ALL_ROOM", query = "FROM Room"),
		@NamedQuery(name = "FIND_BY_ID_ROOM", query = "FROM Room WHERE id =:ID")
})
public class Room {

	@Id
	@Column(name="ID_ROOM")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="TYPE_ID")
	private Type type;
	
	@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private Status status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
