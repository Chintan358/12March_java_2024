package com;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
		JLabel lang = new JLabel("Language");
		lang.setBounds(50, 170, 100, 20);
		JLabel country = new JLabel("Country");
		country.setBounds(50, 230, 100, 20);
		
		JTextField t1 = new JTextField();
		t1.setBounds(160, 50, 160, 20);
		JTextField t2 = new JTextField();
		t2.setBounds(160, 80, 160, 20);
		JTextField t3 = new JTextField();
		t3.setBounds(160, 110, 160, 20);
		JRadioButton male = new JRadioButton("male");
		JRadioButton female = new JRadioButton("female");
		male.setBounds(160, 140, 80, 20);
		female.setBounds(240, 140, 80, 20);
		ButtonGroup group = new ButtonGroup();
		group.add(male);
		group.add(female);
		JCheckBox gujarati = new JCheckBox("Gujarati");
		JCheckBox hindi = new JCheckBox("Hindi");
		JCheckBox english = new JCheckBox("English");
		JCheckBox marathi = new JCheckBox("Marathi");
		gujarati.setBounds(160, 170, 80, 20);
		hindi.setBounds(240, 170, 80, 20);
		english.setBounds(160, 200, 80, 20);
		marathi.setBounds(240, 200, 80, 20);
		String str[] = {"India","USA","UK","Canada"};
		JComboBox<String> c = new JComboBox<String>(str);
		c.setBounds(160, 230, 160, 20);
		
		JButton btn = new JButton("submit");
		btn.setBounds(50,260,260,20);
		
		
		JMenuBar menubar = new JMenuBar();
		menubar.setBounds(0, 0, 500, 20);
		
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu help = new JMenu("Help");
		JMenu run = new JMenu("Run");
				
		menubar.add(file);
		menubar.add(edit);
		menubar.add(help);
		menubar.add(run);
		
		JMenuItem open = new JMenuItem("Open");
		JMenuItem save = new JMenuItem("Save");
		
		file.add(open);
		file.add(save);
		
		frame.add(name);
		frame.add(email);
		frame.add(phone);
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(gender);
		frame.add(male);
		frame.add(female);
		frame.add(lang);
		frame.add(gujarati);
		frame.add(marathi);
		frame.add(english);
		frame.add(hindi);
		frame.add(c);
		frame.add(country);
		frame.add(btn);
		frame.add(menubar);
	}
}
