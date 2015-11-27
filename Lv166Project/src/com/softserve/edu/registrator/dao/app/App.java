package com.softserve.edu.registrator.dao.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.softserve.edu.registrator.dao.daofactory.DaoFactory;
import com.softserve.edu.registrator.dao.utils.HibernateUtil;
import com.softserve.edu.registrator.entity.ResourceType;

public class App {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		DaoFactory.get().getResourceTypeDao().add(new ResourceType("клімат"));
		tx.commit();

	}
}
