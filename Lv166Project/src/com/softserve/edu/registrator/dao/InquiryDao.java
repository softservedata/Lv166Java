package com.softserve.edu.registrator.dao;

import com.softserve.edu.registrator.dao.implementation.DaoOperationsImp;
import com.softserve.edu.registrator.entity.Inquiry;

public class InquiryDao extends DaoOperationsImp<Inquiry>{

	public InquiryDao() {
		super(Inquiry.class);
		
	}

}
