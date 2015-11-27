package com.softserve.edu.registrator.dao;

import com.softserve.edu.registrator.dao.implementation.DaoOperationsImp;
import com.softserve.edu.registrator.entity.Role;

public class RoleDao extends DaoOperationsImp<Role>{

	public RoleDao() {
		super(Role.class);
		
	}

}
