package com.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernate.annotation.db.model.Customer;
import com.view.GUI;

public class DormitorySystem2 implements ActionListener{

	private static final SessionFactory sessionFactory = createSessionFactory();
	private Session session;
	private GUI gui;
	private ActionListener clear, save, room;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DormitorySystem2 dorm = new DormitorySystem2(new GUI());
	}
	
	public DormitorySystem2(GUI gui){
		this.gui = gui;
		
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println(5555);
		JOptionPane.showMessageDialog(gui.getFrame(), "55555555");
		if(e.getSource().equals(gui.getBtnClear())){
			gui.getBox1().setSelectedItem("Gender");
			gui.getTxtFName().setText("");
			gui.getTxtLName().setText("");
			gui.getTxtID().setText("");
			gui.getTxtPhone().setText("");
			gui.getTxtMail().setText("");
			gui.getTxtAddress().setText("");
			JOptionPane.showMessageDialog(gui.getFrame(), "55555555");
		}
		
		else if(e.getSource().equals(gui.getBtnSave())){
			session = sessionFactory.openSession();
			session.getTransaction().begin();
			Customer customer = new Customer();
			customer.setFirstName(gui.getTxtFName().getText());
			customer.setLastName(gui.getTxtLName().getText());
			customer.setId(Integer.parseInt(gui.getTxtID().getText()));
			customer.setPhoneNumber(gui.getTxtPhone().getText());
			customer.setEmail(gui.getTxtMail().getText());
			customer.setAddress(gui.getTxtAddress().getText());
			session.save(customer);
			session.getTransaction().commit();
		}
		
		else if(e.getSource().equals(gui.getBtnRoom())){
			System.err.println("5555555555");
		}
		
	}
	
	public static SessionFactory createSessionFactory() {
	    Configuration configuration = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
	            configuration.getProperties()). buildServiceRegistry();
	    return configuration.buildSessionFactory(serviceRegistry);
	}

	
}
