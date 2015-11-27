package com.softserve.edu.registrator.dao;

import com.softserve.edu.registrator.dao.implementation.DaoOperationsImp;
import com.softserve.edu.registrator.entity.Address;

public class AddressDao extends DaoOperationsImp<Address>{

	public AddressDao() {
		super(Address.class);
		
	}

}
