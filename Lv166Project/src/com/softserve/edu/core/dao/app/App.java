package com.softserve.edu.core.dao.app;

import com.softserve.edu.core.dao.daofactory.DaoFactory;
import com.softserve.edu.core.dto.ResourceType;

public class App {
	public static void main(String[] args) {

		DaoFactory.get().getResourceTypeDao().add(new ResourceType("klimat"));
		
	
	
	
	
	}
}
