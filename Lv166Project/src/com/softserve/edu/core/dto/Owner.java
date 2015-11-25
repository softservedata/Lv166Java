package com.softserve.edu.core.dto;


import javax.persistence.*;

@Entity
@Table(name = "owners")
public class Owner {
	
	@Id
	@Column(name = "owners_id")
	@GeneratedValue
	private Integer OwnerId;

    @Column(name = "ownership_type", nullable = false)
	@Enumerated(EnumType.STRING) 
	private OwnerType ownerType;
	
	public Owner() {
		
	}

	public Integer getOwnerId() {
		return OwnerId;
	}

	public void setOwnerId(Integer ownerId) {
		OwnerId = ownerId;
	}

	public OwnerType getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(OwnerType ownerType) {
		this.ownerType = ownerType;
	}
}

enum OwnerType{UKRAINIAN_PEOPLE}
