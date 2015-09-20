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

public class GUI extends JFrame{
	
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
	private JCheckBox internet = new JCheckBox("Internet");
	private JTextArea area = new JTextArea();
	
	private JButton btnClear = new JButton("Clear");
	private JButton btnSave = new JButton("Save");
	
	private JPanel floor2L = new JPanel(new GridLayout(1,5));
	private JPanel floor2R = new JPanel(new GridLayout(1,5));
	private JPanel floor3L = new JPanel(new GridLayout(1,5));
	private JPanel floor3R = new JPanel(new GridLayout(1,5));
	private ArrayList<JButton> floor2 = new ArrayList<JButton>();
	private ArrayList<JButton> floor3 = new ArrayList<JButton>();
	
	private Font font1 = new Font("tahoma",Font.ROMAN_BASELINE, 17);
	private Font font2 = new Font("tahoma",Font.ROMAN_BASELINE,14);
	private Font font3 = new Font("tahoma",Font.CENTER_BASELINE,24);
	
	private JFrame roomDetail = new JFrame();
	private JLabel lbDetail1 = new JLabel(); 
	private JLabel lbDetail2 = new JLabel(); 
	private JLabel lbDetail3 = new JLabel();
	
	public GUI(){
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
		internet.setFont(font1);
		internet.setBounds(80, 84, 100, 24);
		area.setBounds(30, 138, 710, 300);
		
		room_Info.add(lbRoomType);
		room_Info.add(box2);
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
		floor2L.setBounds(200, 30, 540, 75);
		floor2R.setBounds(200, 155, 540, 75);
		floor3L.setBounds(50, 310, 540, 75);
		floor3R.setBounds(50, 435, 540, 75);
		
		for(int i = 0 ; i < 10 ; i++){
			floor2.add(new JButton(201+i+""));
			floor3.add(new JButton(301+i+""));
		}

		for(int i = 0 ; i < 10 ; i++){
			if(i%2 == 0){
				floor2L.add(floor2.get(i));
				floor3L.add(floor3.get(i));
			}
			else{
				floor2R.add(floor2.get(i));
				floor3R.add(floor3.get(i));
			}
		}		
		
		rooms_Info.add(lbFloor2);
		rooms_Info.add(lbFloor3);
		rooms_Info.add(floor2L);
		rooms_Info.add(floor2R);
		rooms_Info.add(floor3L);
		rooms_Info.add(floor3R);
		
		tab.add("Room",rooms_Info);
		tab.add("Customer",customer_Info);
//		tab.add("Room",room_Info);
		
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
	
	public JFrame getRoomDetail() {
		return roomDetail;
	}

	public JLabel getLbDetail1() {
		return lbDetail1;
	}
	
	public JLabel getLbDetail2() {
		return lbDetail2;
	}
	
	public JLabel getLbDetail3() {
		return lbDetail3;
	}

	public JButton getBtnRoom201(){
		return floor2.get(0);
	}

	public JButton getBtnRoom202(){
		return floor2.get(1);
	}
	
	public JButton getBtnRoom203(){
		return floor2.get(2);
	}
	
	public JButton getBtnRoom204(){
		return floor2.get(3);
	}
	
	public JButton getBtnRoom205(){
		return floor2.get(4);
	}
	public JButton getBtnRoom206(){
		return floor2.get(5);
	}
	
	public JButton getBtnRoom207(){
		return floor2.get(6);
	}
	
	public JButton getBtnRoom208(){
		return floor2.get(7);
	}
	
	public JButton getBtnRoom209(){
		return floor2.get(8);
	}
	
	public JButton getBtnRoom210(){
		return floor2.get(9);
	}
}
