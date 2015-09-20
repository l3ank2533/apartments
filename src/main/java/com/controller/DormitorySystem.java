package com.controller;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import com.hibernate.annotation.db.model.Customer;
import com.hibernate.annotation.db.model.Room;
import com.view.GUI;

public class DormitorySystem {

	private static final SessionFactory sessionFactory = createSessionFactory();
	private Session session;
	private GUI gui;
	private ActionListener clear, save, room201;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DormitorySystem dorm = new DormitorySystem(new GUI());
	}
	
	public DormitorySystem(GUI gui){
		this.gui = gui;
		setActionListener();
	}
	
	private void setActionListener(){
		clear = new ActionListener(){
			public void actionPerformed(ActionEvent actionEvent){
				gui.getBox1().setSelectedItem("Gender");
				gui.getTxtFName().setText("");
				gui.getTxtLName().setText("");
				gui.getTxtID().setText("");
				gui.getTxtPhone().setText("");
				gui.getTxtMail().setText("");
				gui.getTxtAddress().setText("");
			}
		};
		
		save = new ActionListener(){
			public void actionPerformed(ActionEvent actionEvent){
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
		};
		
		room201 = new ActionListener(){
			public void actionPerformed(ActionEvent actionEvent){
				session = sessionFactory.openSession();

				gui.getRoomDetail().setTitle("Room 201");
				gui.getRoomDetail().setSize(600,400);
				gui.getRoomDetail().setLayout(null);
				
				Room room = (Room)session.get(Room.class,201);
				
				gui.getLbDetail1().setText("Status : " + room.getStatus().getName());
				gui.getLbDetail1().setFont(gui.getFont1());
				gui.getLbDetail1().setBounds(30, 30, 200, 24);
				gui.getLbDetail2().setText("Size : " + room.getType().getName());
				gui.getLbDetail2().setFont(gui.getFont1());
				gui.getLbDetail2().setBounds(30, 84, 200, 24);
				gui.getLbDetail3().setText("Price : " + room.getType().getPrice());
				gui.getLbDetail3().setFont(gui.getFont1());
				gui.getLbDetail3().setBounds(30, 138, 200, 24);
				
				gui.getRoomDetail().add(gui.getLbDetail1());
				gui.getRoomDetail().add(gui.getLbDetail2());
				gui.getRoomDetail().add(gui.getLbDetail3());
				
				gui.getRoomDetail().setVisible(true);
			}
		};
		
		
		
		gui.getBtnClear().addActionListener(clear);
		gui.getBtnSave().addActionListener(save);
		gui.getBtnRoom201().addActionListener(room201);
	}

	public static SessionFactory createSessionFactory() {
	    Configuration configuration = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
	            configuration.getProperties()). buildServiceRegistry();
	    return configuration.buildSessionFactory(serviceRegistry);
	}
}
