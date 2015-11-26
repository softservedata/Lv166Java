package com.softserve.edu.core.entity;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Test {

	public static void main(String[] args) {

		try {
			
			Session session = HibernateSessionFactory.currentSession();
			Transaction tx = session.beginTransaction();
/*			ResourceType type = new ResourceType();
			type.setTypeName("природній");
			Integer id = (Integer) session.save(type);
			type.setTypeId(id);
			
			ResourceType type2 = new ResourceType();
			type2.setTypeName("водний");
			id = (Integer) session.save(type2);
			type2.setTypeId(id);

			Role role = new Role();
			role.setName(Name.REGISTRATOR);
			role.setDescription("реєстратор");
			id = (Integer) session.save(role);
			role.setRoleId(id);*/
			
			tx.commit();
			HibernateSessionFactory.closeSession();

//			ResourceClass resourceClass = new ResourceClass();
//			resourceClass.setName("природній");
//			ResourceClassDAOImpl resourceClassDAOImpl = new ResourceClassDAOImpl();
//			resourceClassDAOImpl.addResourceClass(resourceClass);
//			
//			ResourceSubClass resourceSubClass = new ResourceSubClass();
//			resourceSubClass.setName("земельний");
//			ResourceSubClassDAOImpl resourceSubClassDAOImpl = new ResourceSubClassDAOImpl();
//			resourceSubClassDAOImpl.addResourceSubClass(resourceSubClass);

//			resourceClass = client.create(resourceClass);
//			System.out.println("primary key is " + resourceClass.getId());
			//
			//
		} catch (HibernateException e) {
			// problem with Hibernate happened
			e.printStackTrace();
		}
	}

	public Test() {
	}

} 