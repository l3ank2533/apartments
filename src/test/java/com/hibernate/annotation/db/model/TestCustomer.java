package com.hibernate.annotation.db.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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

public class TestCustomer {

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
		
		Query queryBefore = session.createQuery("FROM Customer");
		List<Customer> customerBefore= queryBefore.list();
		
		session.getTransaction().begin();
		Customer customer = new Customer();
		customer.setFirstName("Pannawat");
		customer.setLastName("Kanyawutthiphat");
		customer.setAddress("84/391");
		customer.setEmail("Ball@gmail.com");
		customer.setPhoneNumber("084-3366559");
		session.save(customer);
		session.getTransaction().commit();
		
		Query query = session.createQuery("FROM Customer");
		List<Customer> customers = query.list();
		assertEquals(customerBefore.size()+1, customers.size());
	}
	
	@Test
	public void updateEntity(){
		session.getTransaction().begin();
		Customer customer = (Customer)session.get(Customer.class, 1);
		customer.setEmail("bank@hotmail.com");
		session.update(customer);
		session.getTransaction().commit();
		
		Customer customerDB = (Customer)session.get(Customer.class, 1);
		assertEquals(customer.getEmail(), customerDB.getEmail());
	}
	
	@Test
	public void deleteEntity(){
		session.getTransaction().begin();
		Customer customer = (Customer)session.get(Customer.class, 1);
		session.delete(customer);
		session.getTransaction().commit();
	}
	
	@Test
	public void testFindAll(){
		Query query = session.createQuery("FROM Customer");
		List<Customer> customers = query.list();
		
		for(Customer customer:customers){
			System.out.println(customer.getFirstName());
		}
		assertEquals(4, customers.size());
	}
	
	@Test
	public void testFindByName(){
		Query query = session.getNamedQuery("FIND_BY_NAME_CUSTOMER");
		query.setParameter("NAME","Thanutchapong");
		List<Customer> customers = query.list();
		assertEquals(customers.size(), 1);
	}
	
	public static SessionFactory createSessionFactory() {
	    Configuration configuration = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
	            configuration.getProperties()). buildServiceRegistry();
	    return configuration.buildSessionFactory(serviceRegistry);
	}
}
