package com.softserve.edu.core.dto;


import javax.persistence.*;

@Entity
@Table(name = "tomes")
public class Tome {
	
	@Id
	@Column(name = "tome_id")
	@GeneratedValue
	private Integer tomeId;

	@Column(name = "identifier", nullable = false)
	private String identifier;

	@Column(name = "name", nullable = false)
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "registrator_id", nullable = false)
	private User user;

	public Tome() {
		
	}

	public Integer getTome_id() {
		return tomeId;
	}

	public void setTome_id(Integer tome_id) {
		this.tomeId = tome_id;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
