package com.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BoxView;

public class GUI2 extends JFrame{
	
	private JTabbedPane tab = new JTabbedPane();
	private JComboBox box1 = new JComboBox(new String[] {"Gender","Male","Female"});
	private JLabel lbFName = new JLabel("Firstname");
	private JLabel lbLName = new JLabel("Lastname");
	private JLabel lbPhone = new JLabel("Phone Number");
	private JLabel lbID = new JLabel("ID Card");
	private JLabel lbAddress = new JLabel("Address");
	private JLabel lbMail = new JLabel("E-mail");
	private JTextField txtFName = new JTextField();
	private JTextField txtLName = new JTextField();
	private JTextField txtPhone = new JTextField();
	private JTextField txtID = new JTextField();
	private JTextArea txtAddress = new JTextArea();
	private JTextField txtMail = new JTextField();
	
	private JLabel lbRoomType = new JLabel("Size");
	private JComboBox box2 = new JComboBox(new String[] {"Small","Medium","Large","Large-x"});
	private JRadioButton jrMonth = new JRadioButton("Monthly");
	private JRadioButton jrDay = new JRadioButton("Daily");
	private ButtonGroup group = new ButtonGroup();
	private JCheckBox internet = new JCheckBox("Internet");
	private JTextArea area = new JTextArea();
	
	private JButton btnClear = new JButton("Clear");
	private JButton btnSave = new JButton("Save");
	
	private Font font1 = new Font("tahoma",Font.ROMAN_BASELINE, 17);
	private Font font2 = new Font("tahoma",Font.ROMAN_BASELINE,14);
	private Font font3 = new Font("tahoma",Font.CENTER_BASELINE,24);
	
	public GUI2(){
		createFrame();
	}
	
	private void createFrame(){
		
		setTitle("Dormitory");
		setSize(800,600);
		
		//panel1
		JPanel customer_Info = new JPanel(null);
		box1.setFont(font2);
		box1.setBounds(30, 30, 90, 24);
		lbFName.setFont(font1);
		lbFName.setBounds(140, 30, 90, 24);
		lbLName.setFont(font1);
		lbLName.setBounds(445, 30, 90, 24);
		txtFName.setBounds(225,30,200,24);
		txtLName.setBounds(540,30,200,24);
		lbPhone.setFont(font1);
		lbPhone.setBounds(395, 84, 110, 24);
		txtPhone.setBounds(510, 84, 230, 24);
		lbID.setFont(font1);
		lbID.setBounds(30, 84, 60, 24);
		txtID.setBounds(95, 84, 280, 24);
		lbAddress.setFont(font1);
	    lbAddress.setBounds(30, 192, 70, 24);
	    txtAddress.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	    txtAddress.setBounds(30, 246, 710, 200);
	    lbMail.setFont(font1);
	    lbMail.setBounds(30, 138, 50, 24);
	    txtMail.setBounds(85, 138, 350, 24);
	    btnClear.setFont(font2);
	    btnClear.setBounds(520, 486, 100, 28);
	    btnSave.setFont(font2);
	    btnSave.setBounds(640, 486, 100, 28);
	    
		customer_Info.add(lbFName);
		customer_Info.add(lbLName);
		customer_Info.add(box1);
		customer_Info.add(txtFName);
		customer_Info.add(txtLName);
		customer_Info.add(lbPhone);
		customer_Info.add(txtPhone);
		customer_Info.add(lbID);
		customer_Info.add(txtID);
		customer_Info.add(lbAddress);
		customer_Info.add(txtAddress);
		customer_Info.add(lbMail);
		customer_Info.add(txtMail);
		customer_Info.add(btnClear);
		customer_Info.add(btnSave);
		
		//panel2
		JPanel room_Info = new JPanel(null);
		lbRoomType.setFont(font1);
		lbRoomType.setBounds(30, 30, 30, 24);
		box2.setFont(font2);
		box2.setBounds(80, 30, 200, 24);
//		jrDay.setFont(font1);
//		jrDay.setBounds(80, 84, 70, 24);
//		jrMonth.setFont(font1);
//		jrMonth.setBounds(120, 45, 80, 20);
		internet.setFont(font1);
		internet.setBounds(80, 84, 100, 24);
		area.setBounds(30, 138, 710, 300);
		
		group.add(jrDay);
		group.add(jrMonth);
		
		room_Info.add(lbRoomType);
		room_Info.add(box2);
//		room_Info.add(jrDay);
//		room_Info.add(jrMonth);
		room_Info.add(internet);
		room_Info.add(area);
		
		//panel3
		JPanel rooms_Info = new JPanel(null);
		JLabel lbFloor2 = new JLabel("Floor 2");
		lbFloor2.setFont(font3);
		lbFloor2.setBounds(50, 110, 120, 30);
		JLabel lbFloor3 = new JLabel("Floor 3");
		lbFloor3.setFont(font3);
		lbFloor3.setBounds(640, 380, 120, 30);
		JPanel room2L = new JPanel(new GridLayout(1,5));
		JPanel room2R = new JPanel(new GridLayout(1,5));
		JPanel room3L = new JPanel(new GridLayout(1,5));
		JPanel room3R = new JPanel(new GridLayout(1,5));
//		JButton rooms_1_1 = new JButton("201");
//		JButton rooms_1_2 = new JButton("202");
//		JButton rooms_1_3 = new JButton("203");
//		JButton rooms_1_4 = new JButton("204");
//		JButton rooms_1_5 = new JButton("205");
//		JButton rooms_2_1 = new JButton("206");
//		JButton rooms_2_2 = new JButton("207");
//		JButton rooms_2_3 = new JButton("208");
//		JButton rooms_2_4 = new JButton("209");
//		JButton rooms_2_5 = new JButton("210");
//		JButton rooms_3_1 = new JButton("301");
//		JButton rooms_3_2 = new JButton("302");
//		JButton rooms_3_3 = new JButton("303");
//		JButton rooms_3_4 = new JButton("304");
//		JButton rooms_3_5 = new JButton("305");
//		JButton rooms_4_1 = new JButton("306");
//		JButton rooms_4_2 = new JButton("307");
//		JButton rooms_4_3 = new JButton("308");
//		JButton rooms_4_4 = new JButton("309");
//		JButton rooms_4_5 = new JButton("310");
		room2L.setBounds(200, 30, 540, 75);
		room2R.setBounds(200, 155, 540, 75);
		room3L.setBounds(50, 310, 540, 75);
		room3R.setBounds(50, 435, 540, 75);
		
		ArrayList<JButton> floor2 = new ArrayList<JButton>();
		ArrayList<JButton> floor3 = new ArrayList<JButton>();
		
		for(int i = 0 ; i < 10 ; i++){
			floor2.add(new JButton(201+i+""));
			floor3.add(new JButton(301+i+""));
		}

		for(int i = 0 ; i < 10 ; i++){
			if(i%2 == 0){
				room2L.add(floor2.get(i));
				room3L.add(floor3.get(i));
			}
			else{
				room2R.add(floor2.get(i));
				room3R.add(floor3.get(i));
			}
		}
		
//		rooms_1.add(rooms_1_1);
//		rooms_1.add(rooms_1_2);
//		rooms_1.add(rooms_1_3);
//		rooms_1.add(rooms_1_4);
//		rooms_1.add(rooms_1_5);
//		rooms_2.add(rooms_2_1);
//		rooms_2.add(rooms_2_2);
//		rooms_2.add(rooms_2_3);
//		rooms_2.add(rooms_2_4);
//		rooms_2.add(rooms_2_5);
//		rooms_3.add(rooms_3_1);
//		rooms_3.add(rooms_3_2);
//		rooms_3.add(rooms_3_3);
//		rooms_3.add(rooms_3_4);
//		rooms_3.add(rooms_3_5);
//		rooms_4.add(rooms_4_1);
//		rooms_4.add(rooms_4_2);
//		rooms_4.add(rooms_4_3);
//		rooms_4.add(rooms_4_4);
//		rooms_4.add(rooms_4_5);
		
		
		rooms_Info.add(lbFloor2);
		rooms_Info.add(lbFloor3);
		rooms_Info.add(room2L);
		rooms_Info.add(room2R);
		rooms_Info.add(room3L);
		rooms_Info.add(room3R);
		
		tab.add("Room",rooms_Info);
		tab.add("Customer",customer_Info);
		tab.add("Room",room_Info);
		
		add(tab);
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}

	public JTabbedPane getTab() {
		return tab;
	}

	public JComboBox getBox1() {
		return box1;
	}

	public JLabel getLbFName() {
		return lbFName;
	}

	public JLabel getLbLName() {
		return lbLName;
	}

	public JLabel getLbPhone() {
		return lbPhone;
	}

	public JLabel getLbID() {
		return lbID;
	}

	public JLabel getLbAddress() {
		return lbAddress;
	}

	public JLabel getLbMail() {
		return lbMail;
	}

	public JTextField getTxtFName() {
		return txtFName;
	}

	public JTextField getTxtLName() {
		return txtLName;
	}

	public JTextField getTxtPhone() {
		return txtPhone;
	}

	public JTextField getTxtID() {
		return txtID;
	}

	public JTextArea getTxtAddress() {
		return txtAddress;
	}

	public JTextField getTxtMail() {
		return txtMail;
	}

	public JLabel getLbRoomType() {
		return lbRoomType;
	}

	public JComboBox getBox2() {
		return box2;
	}

	public JRadioButton getJrMonth() {
		return jrMonth;
	}

	public JRadioButton getJrDay() {
		return jrDay;
	}

	public ButtonGroup getGroup() {
		return group;
	}

	public JCheckBox getInternet() {
		return internet;
	}

	public JTextArea getArea() {
		return area;
	}

	public JButton getBtnClear() {
		return btnClear;
	}

	public JButton getBtnSave() {
		return btnSave;
	}

	public Font getFont1() {
		return font1;
	}

	public Font getFont2() {
		return font2;
	}
	
	
}
