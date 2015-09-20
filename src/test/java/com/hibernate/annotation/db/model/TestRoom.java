package com.hibernate.annotation.db.model;

import static org.junit.Assert.*;

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


public class TestRoom {

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
		Room room = new Room();
		room.setId(2);
		session.save(room);
		session.getTransaction().commit();
		
		Query query = session.createQuery("FROM Room");
		List<Room> rooms = query.list();
		assertEquals(1, rooms.size());
	}
	
	@Test
	public void updateEntity(){
		session.getTransaction().begin();
		Room room = (Room)session.get(Room.class, 2);
		room.setId(1);
		session.update(room);
		session.getTransaction().commit();
	}
	
	@Test
	public void findByIdRoom(){
//		Query query = session.getNamedQuery("FIND_BY_ID_ROOM");
//		query.setParameter("ID",201);
//		List<Room> rooms = query.list();
		Room room = (Room)session.get(Room.class,201);
		assertNotNull(room);
	}
	
	public static SessionFactory createSessionFactory() {
	    Configuration configuration = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
	            configuration.getProperties()). buildServiceRegistry();
	    return configuration.buildSessionFactory(serviceRegistry);
	}
}
