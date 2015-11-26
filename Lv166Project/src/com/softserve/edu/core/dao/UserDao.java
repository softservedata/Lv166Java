package com.softserve.edu.core.dao;

import com.softserve.edu.core.dao.implementation.DaoOperationsImp;
import com.softserve.edu.core.entity.User;

public class UserDao extends DaoOperationsImp<User>{

	public UserDao() {
		super(User.class);
		
	}

}
