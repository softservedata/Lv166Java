package com.softserve.edu.core.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "inquiry_list")
public class Inquiry {

	@Id
	@Column(name = "inquiry_list_id")
	@GeneratedValue
	private Integer inquiry_list_id;

	@Column(name = "inquiry_type", nullable = false)
	@Enumerated(EnumType.STRING)
	private InquiryType inquiryType;

	@Column(name = "date", nullable = false)
	private Date date;

	@ManyToOne
	@JoinColumn(name = "from_user_id", nullable = false)
	private User user;

	@ManyToOne
	@JoinColumn(name = "to_user_id", nullable = false)
	private User registrator;

	@ManyToOne
	@JoinColumn(name = "resource_id", nullable = false)
	private Resource resource;

	public Inquiry() {

	}

	public Integer getInquiry_list_id() {
		return inquiry_list_id;
	}

	public void setInquiry_list_id(Integer inquiry_list_id) {
		this.inquiry_list_id = inquiry_list_id;
	}

	public InquiryType getInquiryType() {
		return inquiryType;
	}

	public void setInquiryType(InquiryType inquiryType) {
		this.inquiryType = inquiryType;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getRegistrator() {
		return registrator;
	}

	public void setRegistrator(User registrator) {
		this.registrator = registrator;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}
}

enum InquiryType {
	INPUT, OUTPUT
};
