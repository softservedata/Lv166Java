package com.softserve.edu.core.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

	@Id
	@Column(name = "user_id")
	@GeneratedValue
	private Integer userId;

	@Column(name = "login", unique = true, nullable = false)

	private String login;

	@Column(name = "password", nullable = false)
	private String password;

	@ManyToOne
	@JoinColumn(name = "role_id", nullable = false)
	private Role role;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "middle_name", nullable = false)
	private String middleName;

	@Column(name = "email", unique = true, nullable = false)
	private String email;

	// !!! to dalate postcode int(11) NOT NULL,

	@Column(name = "status", nullable = false)
	@Enumerated(EnumType.STRING)
	private UserStatus status;

	public User() {

	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

}

enum UserStatus {
	BLOCK, UNBLOCK
};
