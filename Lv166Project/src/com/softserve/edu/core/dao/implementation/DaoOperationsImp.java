package com.softserve.edu.core.dao.implementation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.softserve.edu.core.dao.interfaces.IDaoOperations;
import com.softserve.edu.core.dao.utils.HibernateUtil;

public class DaoOperationsImp<T> implements IDaoOperations<T> {

	private Class<T> elementClass;

	public DaoOperationsImp(Class<T> elementClass) {
		this.elementClass = elementClass;
	}

	@Override
	public void add(T entity) {
		Session session = null;

		try {

			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
	}

	@Override
	public void update(T entity) {
		Session session = null;

		try {

			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.update(entity);
			transaction.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public T findById(Long entityId) {

		Session session = null;
		T element = null;
		try {

			session = HibernateUtil.getSessionFactory().openSession();
			element = (T) session.get(elementClass, entityId);

		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
		return element;
	}

	@Override
	public void delete(T entity) {
		Session session = null;

		try {

			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(entity);
			transaction.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll() {
		Session session = null;
		List<T> elements = new ArrayList<T>();

		try {
			session = HibernateUtil.getSessionFactory().openSession();
			elements = session.createCriteria(elementClass).list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}

		return elements;
	}

	@Override
	public void deleteAll() {
		List<T> elements = getAll();
		for (T t : elements) {
			delete(t);
		}

	}

}
