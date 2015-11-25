package com.softserve.edu.core.dto;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "list_of_resouces")
public class Resource {
	
    @Id
    @Column(name = "resources_id")
    @GeneratedValue
    private Integer resourcesId;
    
	@ManyToOne
	@JoinColumn(name = "resource_type_id", nullable = false)
	private ResourceType type;

    @Column(name = "identifier", nullable = false)
    private String identifier;

    @ManyToOne
	@JoinColumn(name = "registrator_id", nullable = false)
	private User user;
    
    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "status", nullable = false)
    private ResourceStatus status;

    @ManyToOne
	@JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;

    @ManyToOne
	@JoinColumn(name = "tome_id", nullable = false)
    private Tome tome;
    
    
    public Resource() {
    	
    }


	public Integer getResourcesId() {
		return resourcesId;
	}


	public void setResourcesId(Integer resourcesId) {
		this.resourcesId = resourcesId;
	}


	public ResourceType getType() {
		return type;
	}


	public void setType(ResourceType type) {
		this.type = type;
	}


	public String getIdentifier() {
		return identifier;
	}


	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public ResourceStatus getStatus() {
		return status;
	}


	public void setStatus(ResourceStatus status) {
		this.status = status;
	}


	public Owner getOwner() {
		return owner;
	}


	public void setOwner(Owner owner) {
		this.owner = owner;
	}


	public Tome getTome() {
		return tome;
	}


	public void setTome(Tome tome) {
		this.tome = tome;
	}

}

enum ResourceStatus{ ACTIVE, UNCHECKED, DENIDED, OBSOLETE}
