package com.softserve.edu.core.dto;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @Column(name = "role_id")
    @GeneratedValue
    private Integer roleId;

    //!!! name should be ENUM
    @Column(name = "name", nullable = false)
	@Enumerated(EnumType.STRING) 
	private Name name;
    
    @Column(name = "description", nullable = false)
    private String description;

    public Role(){
    }

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
}

enum Name{
    USER("Користувач"),
    REGISTRATOR("Реєстратор"),
    ADMIN("Адміністратор");

    private final String text;

    private Name(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}