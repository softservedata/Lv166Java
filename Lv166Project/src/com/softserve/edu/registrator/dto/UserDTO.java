package com.softserve.edu.registrator.dto;

import java.io.Serializable;
import java.util.List;

import com.softserve.edu.registrator.entity.Role;

public class UserDTO implements Serializable {
	
	private String firstName;
	private String lastName;
	private String middleName;
	private Role role;
	private String login;
	private String password;
	private String email;
	private String status;
	private List<AddressDTO> address;
	private List<PassportDTO> passport;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<AddressDTO> getAddress() {
		return address;
	}
	public void setAddress(List<AddressDTO> address) {
		this.address = address;
	}
	public List<PassportDTO> getPassport() {
		return passport;
	}
	public void setPassport(List<PassportDTO> passport) {
		this.passport = passport;
	}
	
}
