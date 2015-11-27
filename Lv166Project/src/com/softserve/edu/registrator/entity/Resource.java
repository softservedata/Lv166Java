package com.softserve.edu.registrator.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "list_of_resouces")
public class Resource implements Serializable {
	
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

    @Column(name = "status", nullable = false, columnDefinition = "ENUM('ACTIVE', 'UNCHECKED', 'DENIDED', 'OBSOLETE')")
    @Enumerated
    private ResourceStatus status;

    @ManyToOne
	@JoinColumn(name = "tome_id", nullable = false)
    private Tome tome;
    
    @Column(name = "reason_inclusion", nullable = false)
    private String reasonInclusion;
    
    
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


	public Tome getTome() {
		return tome;
	}


	public void setTome(Tome tome) {
		this.tome = tome;
	}


	public String getReasonInclusion() {
		return reasonInclusion;
	}


	public void setReasonInclusion(String reasonInclusion) {
		this.reasonInclusion = reasonInclusion;
	}

}

enum ResourceStatus{ ACTIVE, UNCHECKED, DENIDED, OBSOLETE}
