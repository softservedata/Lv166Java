package com.softserve.edu.registrator.entity;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name = "users")
public class User implements Serializable {
	
	@Id
    @Column(name = "user_id")
    @GeneratedValue
    private Integer userId;
	
	@Column(name = "login",unique = true, nullable = false)
	
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
	
	@Column(name = "email",unique = true, nullable = false)
	private String email;
	
	@Column(name = "status", nullable = false, columnDefinition = "ENUM('BLOCK','UNBLOCK','INACTIVE')")
	@Enumerated
	private UserStatus status;
	
	public User() {
		
	}
	

	public User(String login, String password, Role role, String firstName, String lastName, String middleName,
			String email, String status) {
		this.login = login;
		this.password = password;
		this.role = role;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.email = email;		
		this.status = checkStatus(status);
	}



	private UserStatus checkStatus(String status){
		UserStatus userStatus = null;
		if (status.equalsIgnoreCase(UserStatus.BLOCK.toString())){
			userStatus = UserStatus.BLOCK;
		}
		else if(status.equalsIgnoreCase(UserStatus.UNBLOCK.toString())){
			userStatus = UserStatus.UNBLOCK;
		}
		else if(status.equalsIgnoreCase(UserStatus.INACTIVE.toString())){
			userStatus = UserStatus.INACTIVE;
		}
		return userStatus;
		
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

enum UserStatus {BLOCK, UNBLOCK,INACTIVE};
