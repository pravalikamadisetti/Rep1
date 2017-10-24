package Exercises;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GUICalculatorClass implements ActionListener  {   //Create the varibales
	
	//first step:create a frame using JFrame and set the frame options in constructor 
	
	JFrame frame=new JFrame();
	
	//second step:create a panel that includes textarea and buttons
	
	JPanel panel=new JPanel();
	
	//Third step:create a textarea 
	
	JTextArea textArea=new JTextArea(2,10);
	
	//Fourth step:create buttons to the panel(we need 17 buttons including symbols)
	
	JButton button1  = new JButton();
	JButton button2  = new JButton();
	JButton button3  = new JButton();
	JButton button4  = new JButton();
	JButton button5  = new JButton();
	JButton button6  = new JButton();
	JButton button7  = new JButton();
	JButton button8  = new JButton();
	JButton button9  = new JButton();
	JButton button0  = new JButton();
	JButton buttonAdd=new JButton();
	JButton buttonSub=new JButton();
	JButton buttonMul=new JButton();
	JButton buttonDiv=new JButton();
	JButton buttonDot=new JButton();
	JButton buttonEqual=new JButton();
	JButton buttonClr=new JButton();
	
	
	double number1,number2,result;
	int addc=0,subc=0,mulc=0,divc=0;
	
	
	
	
	
	public GUICalculatorClass ()//set the options in constrcutor
	{
		
		//set options for Calculator Frame
		
		frame.setTitle("Calculator");  //title of the frame
		frame.setSize(340,430);   //width and height of the calculator frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //for close ,minimise and maximise options in the frame
		frame.setVisible(true);
		
	//U can execute and check the above code whether the frame is created with options are not	
		
		
	//add panel to the calculator frame
		
		frame.add(panel);
		
	//next set the panel options which includes color,border,bordersize...
		
		
		panel.setBackground(Color.GRAY);
		
	//Create border to the panel and set the border options
		
		Border border=BorderFactory.createLineBorder(Color.CYAN,4);
		
	//Add border to the panel
		
		panel.setBorder(border);
		
	//add textArea to the panel
		
		panel.add(textArea);
		
	//set options(border) to the textArea
		
		Border tborder=BorderFactory.createLineBorder(Color.BLUE,3);
		
	//add border to the textarea
		
		textArea.setBorder(tborder);
	
	//set background color to the textarea
		
		textArea.setBackground(Color.BLACK);
		
	//Create and set Font options to the textArea
		
		Font font=new Font("Ariel",Font.BOLD,33);
		
		textArea.setFont(font);
		
		textArea.setForeground(Color.GREEN);
		
		textArea.setPreferredSize(new Dimension(3,9));
		
		textArea.setLineWrap(true);
		
   //Add buttons to the panel and set options
		
		button1.setPreferredSize(new Dimension(100,42));
		button1.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\Calc Buttons\\1.jpg"));
		
		
		button2.setPreferredSize(new Dimension(100,42));
		button2.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\Calc Buttons\\2.jpg"));
		
		button3.setPreferredSize(new Dimension(100,42));
		button3.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\Calc Buttons\\3.jpg"));
		
		button4.setPreferredSize(new Dimension(100,42));
		button4.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\Calc Buttons\\4.jpg"));
		
		button5.setPreferredSize(new Dimension(100,42));
		button5.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\Calc Buttons\\5.jpg"));
		
		button6.setPreferredSize(new Dimension(100,42));
		button6.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\Calc Buttons\\6.jpg"));
		
		button7.setPreferredSize(new Dimension(100,42));
		button7.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\Calc Buttons\\7.jpg"));
		
		button8.setPreferredSize(new Dimension(100,42));
		button8.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\Calc Buttons\\8.jpg"));
		
		button9.setPreferredSize(new Dimension(100,42));
		button9.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\Calc Buttons\\9.jpg"));
		
		button0.setPreferredSize(new Dimension(100,42));
		button0.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\Calc Buttons\\zero.jpg"));
		
		buttonAdd.setPreferredSize(new Dimension(100,42));
		buttonAdd.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\Calc Buttons\\add.jpg"));
		
		buttonSub.setPreferredSize(new Dimension(100,42));
		buttonSub.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\Calc Buttons\\sub.jpg"));
		
		buttonMul.setPreferredSize(new Dimension(100,42));
		buttonMul.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\Calc Buttons\\mul.jpg"));
		
		buttonDiv.setPreferredSize(new Dimension(100,42));
		buttonDiv.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\Calc Buttons\\div.jpg"));
		
		buttonEqual.setPreferredSize(new Dimension(200,35));
		buttonEqual.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\Calc Buttons\\equals.jpg"));
		
		buttonClr.setPreferredSize(new Dimension(100,35));
		buttonClr.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\Calc Buttons\\clr.jpg"));
		
		buttonDot.setPreferredSize(new Dimension(100,42));
		buttonDot.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\Calc Buttons\\dot.jpg"));
		
		
		
		
		
		
		
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		panel.add(buttonAdd);
		panel.add(buttonSub);
		panel.add(buttonMul);
		panel.add(buttonDiv);
		panel.add(buttonDot);
		panel.add(buttonEqual);
		
		panel.add(buttonClr);
		
		//add ActionListener to the  buttons
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		buttonAdd.addActionListener(this);
		buttonSub.addActionListener(this);
		buttonMul.addActionListener(this);
		buttonDiv.addActionListener(this);
		buttonDot.addActionListener(this);
		buttonEqual.addActionListener(this);
		buttonClr.addActionListener(this);
		
	}
		
		
		public void actionPerformed(ActionEvent e)
		{
		
		Object source=e.getSource();
		
		if(source==buttonClr)
		{
			number1=0.0;
			number2=0.0;
			textArea.setText(" ");
		}
		
		if(source==button1)
		{
			textArea.append("1");
		}
		if(source==button2)
		{
			textArea.append("2");
		}
		if(source==button3)
		{
			textArea.append("3");
		}
		if(source==button4)
		{
			textArea.append("4");
		}
		if(source==button5)
		{
			textArea.append("5");
		}
		if(source==button6)
		{
			textArea.append("6");
		}
		if(source==button7)
		{
			textArea.append("7");
		}
		if(source==button8)
		{
			textArea.append("8");
		}
		if(source==button9)
		{
			textArea.append("9");
		}
		if(source==button0)
		{
			textArea.append("0");
		}
		
		if(source==buttonDot)
		{
			textArea.append(".");
		}
		if(source==buttonAdd)
		{
			number1=number_reader();
			textArea.setText(" ");
			addc=1;
			subc=0;
			mulc=0;
			divc=0;
			
		}
		if(source==buttonSub)
		{
			number1=number_reader();
			textArea.setText(" ");
			subc=1;
			addc=0;
			mulc=0;
			divc=0;
		}
		if(source==buttonMul)
		{
			number1=number_reader();
			textArea.setText(" ");
			mulc=1;
			addc=0;
			subc=0;
			divc=0;
		}
		if(source==buttonDiv)
		{
			number1=number_reader();
			textArea.setText(" ");
			divc=1;
			addc=0;
			subc=0;
			mulc=0;
		}
		if(source==buttonEqual)
		{
		number2=number_reader();
		
		if(addc>0)
		{
			result=number1+number2;
			textArea.setText(Double.toString(result));
		}
		if(subc>0)
		{
			result=number1-number2;
			textArea.setText(Double.toString(result));
		}
		if(mulc>0)
		{
			result=number1*number2;
			textArea.setText(Double.toString(result));
		}
		if(divc>0)
		{
			result=number1/number2;
			textArea.setText(Double.toString(result));
		}
		}
		}

		public double number_reader()
		{
			
			double num1;
			String s;
			s=textArea.getText();
			num1=Double.valueOf(s);
			return num1;
		
		
		}
		
		
		
		
		
		
		
		
	}

