package com;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Demo {
	public static void main(String[] args) {
		
		
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setTitle("Demo");
		frame.setLayout(null);
		
		JLabel name = new JLabel("Username");
		name.setBounds(50, 50, 100, 20);
		JLabel email = new JLabel("Email");
		email.setBounds(50, 80, 100, 20);
		JLabel phone = new JLabel("Phone");
		phone.setBounds(50, 110, 100, 20);
		JLabel gender = new JLabel("Gender");
		gender.setBounds(50, 140, 100, 20);
		
		JTextField t1 = new JTextField();
		t1.setBounds(160, 50, 100, 20);
		JTextField t2 = new JTextField();
		t2.setBounds(160, 80, 100, 20);
		JTextField t3 = new JTextField();
		t3.setBounds(160, 110, 100, 20);
		JRadioButton male = new JRadioButton("male");
		JRadioButton female = new JRadioButton("female");
		male.setBounds(160, 140, 80, 20);
		female.setBounds(240, 140, 80, 20);
		ButtonGroup group = new ButtonGroup();
		group.add(male);
		group.add(female);
		
		frame.add(name);
		frame.add(email);
		frame.add(phone);
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(gender);
		frame.add(male);
		frame.add(female);
	}
}
