package com.softserve.edu.core.dao;

import com.softserve.edu.core.dao.implementation.DaoOperationsImp;
import com.softserve.edu.core.entity.Resource;

public class ResourceDao extends DaoOperationsImp<Resource>{

	public ResourceDao() {
		super(Resource.class);
	
	}

}
