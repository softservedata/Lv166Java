package com.softserve.edu.core.dao;

import com.softserve.edu.core.dao.implementation.DaoOperationsImp;
import com.softserve.edu.core.dto.Role;

public class RoleDao extends DaoOperationsImp<Role>{

	public RoleDao() {
		super(Role.class);
		
	}

}
