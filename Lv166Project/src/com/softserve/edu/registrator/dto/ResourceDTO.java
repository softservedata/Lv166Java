package com.softserve.edu.registrator.dto;

import java.util.Date;

public class ResourceDTO {
	//public enum ResourceStatus {ACTIVE, UNCHECKED, DENIED, OBSOLETE}
	//private ResourceStatus status;
	private String resourceStatus;
	
	private ResourceTypeDTO resourceType;
	
	private String identifier;
	// private UserDTO registrator;
	private String registratorName;
	private Date date;
	
	
	private String reasonInclusion;
	
	private ResourceAreaDTO resourceArea;
	private ResourceLinearDTO resourceLinear;
	private ResourceDiscreteDTO resourceDiscrete;
}
