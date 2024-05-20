package com;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calc implements ActionListener {
	
	JTextField a,b,c;
	JButton add,sub,mul,div;
	public Calc() {
		
		JFrame frame = new JFrame();
		frame.setSize(700, 700);
		frame.setVisible(true);
		frame.setTitle("Demo");
		frame.setLayout(new FlowLayout());
		
		 a = new JTextField(10);
		 b = new JTextField(10);
		 c = new JTextField(10);
		
		 add = new JButton("ADD");
		 sub = new JButton("SUB");
		 mul = new JButton("MUL");
		 div = new JButton("DIV");
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
		frame.add(a);
		frame.add(b);
		frame.add(c);
		frame.add(add);
		frame.add(sub);
		frame.add(mul);
		frame.add(div);
	}
	
	public static void main(String[] args) {
		Calc c = new Calc();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int n1 = Integer.parseInt(a.getText());
		int n2 = Integer.parseInt(b.getText());
		if(e.getSource()==add)
		{
			int r  =n1+n2;
			c.setText(r+"");
		}
		else if(e.getSource()==sub)
		{
			int r  =n1-n2;
			c.setText(r+"");
		}
		else if(e.getSource()==mul)
		{
			int r  =n1*n2;
			c.setText(r+"");
		}
		else if(e.getSource()==div)
		{
			int r  =n1/n2;
			c.setText(r+"");
		}
	}
}
