package com.softserve.edu.registrator.dao;

import com.softserve.edu.registrator.dao.implementation.DaoOperationsImp;
import com.softserve.edu.registrator.entity.User;

public class UserDao extends DaoOperationsImp<User>{

	public UserDao() {
		super(User.class);
		
	}

}
