package Exercises;

import java.awt.FlowLayout;
import javax.swing.JFrame;   //Jframe:for titlebar options:minimise,maximise,close,restore...
import javax.swing.JLabel;   //Jlabel:to display text and simple images

public class CustomLayoutClass extends JFrame {
	
	
	private JLabel item1;
	
	public CustomLayoutClass()
	{
		super("The Title Bar");
		setLayout(new FlowLayout());
		
		item1=new JLabel("Welcome to my Page");  
		item1.setToolTipText("Message from Pravalika____");///This is mouseover(when we put cursor on "welcome to my page",then this text should appear(Tool tip from pravalika)
		add(item1);
	}
	
	

}
