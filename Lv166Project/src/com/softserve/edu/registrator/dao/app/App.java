package com.softserve.edu.registrator.dao.app;

import com.softserve.edu.registrator.dao.daofactory.DaoFactory;
import com.softserve.edu.registrator.entity.ResourceType;

public class App {
	public static void main(String[] args) {

		DaoFactory.get().getResourceTypeDao().add(new ResourceType("клімат"));
	
	}
}
