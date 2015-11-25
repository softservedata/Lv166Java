package com.softserve.edu.core.dto;

import javax.persistence.*;

@Entity
@Table(name = "area")
public class Area {

	@Id
	@Column(name = "area_id")
	@GeneratedValue
	private Integer area_id;

	@ManyToOne
	@JoinColumn(name = "resource_id", nullable = false)
	private Resource resource;
	
	@Column(name = "latitude", nullable = false)
	private String latitude;
	
	@Column(name = "longitude", nullable = false)
	private String longitude;
	
	@Column(name = "number_of_point", nullable = false)
	private Integer numberOfPoint;

	public Area() {
		
	}

	public Integer getArea_id() {
		return area_id;
	}

	public void setArea_id(Integer area_id) {
		this.area_id = area_id;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Integer getNumberOfPoint() {
		return numberOfPoint;
	}

	public void setNumberOfPoint(Integer numberOfPoint) {
		this.numberOfPoint = numberOfPoint;
	}

}
