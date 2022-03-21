package com.lti.Dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.entity.IceCreamDetails;
import com.lti.entity.IceCreamShops;


public class IceCreamDao {
	public void save(Object obj) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		// merge is actually a 2-in-1 method
		// can be used for insert as well as update both
		em.merge(obj);

		tx.commit();

		emf.close();

	}

	public Object fetchById(Class clazz, Object pk) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		Object obj = em.find(clazz, pk);

		emf.close();

		return obj;
	}

	public IceCreamShops fetchbyid(int id) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");

		EntityManager em = emf.createEntityManager();

		IceCreamShops p1 = em.find(IceCreamShops.class, id);

		emf.close();
		return p1;

	}

	public IceCreamDetails fetchdetailsbyid(int id) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");

		EntityManager em = emf.createEntityManager();

		IceCreamDetails p1 = em.find(IceCreamDetails.class, id);

		emf.close();
		return p1;

	}

	public void add(IceCreamDetails ice) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");

		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(ice);

		tx.commit();

		emf.close();

	}
	
	public List<IceCreamDetails> fetchAllbyIceCreamshopName(String name) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		// JPQL/HQL
		Query q = em.createQuery("select c from IceCreamDetails c join c.IceCreamShops s where s.shopname =: art");

		q.setParameter("art", name);
		List<IceCreamDetails> list = q.getResultList();

		emf.close();

		return list;
		/////////////////////////////////////////////
			}
	
	public List<IceCreamDetails> fetchallicecreambyprice(double price) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		// JPQL/HQL
		Query q = em.createQuery("select c from IceCreamDetails c  where c.price =:pr");
		q.setParameter("pr", price);
		List<IceCreamDetails> list = q.getResultList();

		emf.close();

		return list;
	}
	public List<IceCreamShops> fetchallbyShopName(String name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		// JPQL/HQL
		Query q = em.createQuery("select c from IceCreamShops c  where c.Shopname =:n1");
		q.setParameter("n1", name);
		List<IceCreamShops> list = q.getResultList();

		emf.close();

		return list;
	}

	public List<IceCreamShops> fetchAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
