package Exercises;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class EventHandlerClass extends JFrame {
	
	private JTextField Field1;
	private JTextField Field2;
	private JTextField Field3;
	private JPasswordField pwField;
	
	public EventHandlerClass()
	{
		super("My Sofware");
		setLayout(new FlowLayout());
		
		Field1=new JTextField(15);
		add(Field1);
		
		Field2=new JTextField("Enter your text here");
		add(Field2);
		
		Field3=new JTextField("You can edit the text here");
		Field3.setEditable(false);
		add(Field3);
		
		pwField=new JPasswordField("Enter your password");
		add(pwField);
		
		theHandler obj=new theHandler();     //theHandler is the another class we created below
		Field1.addActionListener(obj);
		Field2.addActionListener(obj);
		Field3.addActionListener(obj);
		pwField.addActionListener(obj);
		
	}
   
	 private class theHandler implements ActionListener
	 {
		 public void actionPerformed(ActionEvent myEvent)  //myEvent is the event name
		 {
			 
			 String myText="";
			 
			 if(myEvent.getSource()==Field1){
				 myText=String.format("Your text :%s", myEvent.getActionCommand());}
				 else if(myEvent.getSource()==Field2){
					 myText=String.format("You entered :%s", myEvent.getActionCommand());}
				 else if(myEvent.getSource()==Field3){
					 myText=String.format("You typed:%s", myEvent.getActionCommand());}
				 else if(myEvent.getSource()==pwField){
					 myText=String.format("Your Password :%s", myEvent.getActionCommand());}
			 
			 
			     JOptionPane.showMessageDialog(null, myText);
				 }
				 
			 }
			 
			 
			 
			 
		 }
	 
	 

