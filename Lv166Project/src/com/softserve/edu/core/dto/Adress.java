package com.softserve.edu.core.dto;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Adress {

    @Id
    @Column(name = "address_id")
    @GeneratedValue
    private Integer addressId;
    
    @ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user; 
    
    @Column(name = "postcode", nullable = false)
    private Integer postCode;
    
    @Column(name = "region", nullable = false)
    private String region;
    
    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "street", nullable = false)
    private String street;

    @Column(name = "building_number", nullable = false)
    private Integer buildingNumber;

    @Column(name = "flat_number")
    private Integer flatNumber;
    
    public Adress() {
    	
    }

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getPostCode() {
		return postCode;
	}

	public void setPostCode(Integer postCode) {
		this.postCode = postCode;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(Integer buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public Integer getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(Integer flatNumber) {
		this.flatNumber = flatNumber;
	}

}
