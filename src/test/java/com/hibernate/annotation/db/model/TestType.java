package com.hibernate.annotation.db.model;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestType {
	
	private static final SessionFactory sessionFactory = createSessionFactory();
	private Session session;
	
	@Before
	public void setUp(){
		session = sessionFactory.openSession();
	}
	
	@After
	public void tearDown(){
		session.close();
	}
	
	@Test
	public void createEntity(){
		session.getTransaction().begin();
		Type type = new Type();
		type.setName("Air");
		session.save(type);
		session.getTransaction().commit();
		
		Query query = session.createQuery("FROM Type");
		List<Type> types = query.list();
		assertEquals(1, types.size());
	}
	
	@Test
	public void updateEntity(){
		session.getTransaction().begin();
		Type type = (Type)session.get(Type.class, 1);
		type.setName("Fan");
		session.update(type);
		session.getTransaction().commit();
		
		Type typeDB = (Type)session.get(Type.class, 1);
		assertEquals(type.getName(), typeDB.getName());
	}
	
	@Test
	public void deleteEntity(){
		session.getTransaction().begin();
		Customer customer = (Customer)session.get(Customer.class, 1);
		session.delete(customer);
		session.getTransaction().commit();
	}
	
	public static SessionFactory createSessionFactory() {
	    Configuration configuration = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
	            configuration.getProperties()). buildServiceRegistry();
	    return configuration.buildSessionFactory(serviceRegistry);
	}
}
