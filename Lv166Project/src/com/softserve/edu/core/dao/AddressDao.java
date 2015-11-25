package com.softserve.edu.core.dao;

import com.softserve.edu.core.dao.implementation.DaoOperationsImp;
import com.softserve.edu.core.dto.Address;

public class AddressDao extends DaoOperationsImp<Address>{

	public AddressDao() {
		super(Address.class);
		
	}

}
