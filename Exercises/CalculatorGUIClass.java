package Exercises;

import javax.swing.*;

import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class CalculatorGUIClass extends JFrame {
	
	private JTextField t;
	private JFrame f;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bmul,bsub,badd,bdiv,bclr,beq;
	/*static double a=0,b=0,result=0;
    static int operator=0;*/
	
	 public CalculatorGUIClass()
	 {
		 
		 super("My Calculator");
		 setLayout(new FlowLayout());
		 
		 t=new JTextField();
		 t.setBounds(30,60,120,240);
		 add(t);
		 /*//f=new JFrame("Calculator");
		 add(t);*/
		 b1=new JButton("1");
		 b1.setBounds(50,100,150,200);
		 add(b1);
		 b2= new JButton("2");
		 b2.setBounds(35,70,120,180);
		 add(b2);
		 b3=new JButton("3");
		 b3.setBounds(50,65,80,140);
		 add(b3);
		 b4=new JButton("4");
		 b4.setBounds(55,67,85,160);
		 add(b4);
		 b5=new JButton("5");
		 b5.setBounds(70,95,100,140);
		 add(b5);
		 b6=new JButton("6");
		 b6.setBounds(80,165,180,240);
		 add(b6);
		 b7=new JButton("7");
		 b7.setBounds(90,165,190,250);
		 add(b7);
		 b8=new JButton("8");
		 b8.setBounds(50,65,80,140);
		 add(b8);
		 b9=new JButton("9");
		 b9.setBounds(50,70,90,150);
		 add(b9);
		 b0=new JButton("0");
		 b0.setBounds(50,65,80,140);
		 add(b0);
		 badd=new JButton("+");
		 badd.setBounds(35,65,95,105);
		 add(badd);
		 bsub=new JButton("-");
		 bsub.setBounds(60,120,180,260);
		 add(bsub);
		 bmul=new JButton("*");
		 bmul.setBounds(50,70,90,110);
		 add(bmul);
		 bdiv=new JButton("/");
		 bdiv.setBounds(40,80,160,280);
		 add(bdiv);
		 beq=new JButton("=");
		 beq.setBounds(20,40,60,180);
		 add(beq);
		 bclr=new JButton("clear");
		 bclr.setBounds(40,80,160,280);
		 add(bclr);
		 
		 theHandler obj=new theHandler();
		 
		 t.addActionListener(obj);
		 b1.addActionListener(obj);
		 b2.addActionListener(obj);
		 b3.addActionListener(obj);
		 b4.addActionListener(obj);
		 b5.addActionListener(obj);
		 b6.addActionListener(obj);
		 b7.addActionListener(obj);
		 b8.addActionListener(obj);
		 b9.addActionListener(obj);
		 b0.addActionListener(obj);
		 badd.addActionListener(obj);
		 bsub.addActionListener(obj);
		 bmul.addActionListener(obj);
		 bdiv.addActionListener(obj);
		 beq.addActionListener(obj);
		 bclr.addActionListener(obj);
		 
		 
		 
			 
	 }
	private class theHandler implements ActionListener
	{
		 double a=0,b=0,result=0;
	     int operator=0;
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1)
				t.setText(t.getText().concat("1"));
			if(e.getSource()==b2)
				t.setText(t.getText().concat("2"));
			if(e.getSource()==b3)
				t.setText(t.getText().concat("3"));
			if(e.getSource()==b4)
				t.setText(t.getText().concat("4"));
			if(e.getSource()==b5)
				t.setText(t.getText().concat("5"));
			if(e.getSource()==b6)
				t.setText(t.getText().concat("6"));
			if(e.getSource()==b7)
				t.setText(t.getText().concat("7"));
			if(e.getSource()==b8)
				t.setText(t.getText().concat("8"));
			if(e.getSource()==b9)
				t.setText(t.getText().concat("9"));
			if(e.getSource()==b0)
				t.setText(t.getText().concat("0"));
			if(e.getSource()==badd)
			{
				a=Double.parseDouble(t.getText());
				operator=1;
				t.setText("");
			}
				
			if(e.getSource()==bsub)
			{
				a=Double.parseDouble(t.getText());
				operator=2;
				t.setText("");
			}
				
			if(e.getSource()==bmul)
			{
				a=Double.parseDouble(t.getText());
				operator=3;
				t.setText("");
			}
			if(e.getSource()==bdiv)
			{
				a=Double.parseDouble(t.getText());
				operator=4;
				t.setText("");
			}
			if(e.getSource()==beq)
				b=Double.parseDouble(t.getText());
			switch(operator)
			{
			case 1:result=a+b;
			break;
			case 2:result=a-b;
			break;
			case 3:result=a*b;
			break;
			case 4:result=a/b;
			break;
			default:result=0;
			
			
			
			}
			
			t.setText(""+result);
			//JOptionPane.showMessageDialog(null,result);
			
			
			
	      	if(e.getSource()==bclr)
		     t.setText("");
		
		     JOptionPane.showMessageDialog(null,result);
			
			
			
			
			
		}
	}

}
