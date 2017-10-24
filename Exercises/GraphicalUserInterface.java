package Exercises;

import javax.swing.JOptionPane;  //inbuilt function

public class GraphicalUserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x,y;
		
		x=JOptionPane.showInputDialog("Enter your 1st number: ");
		
		y=JOptionPane.showInputDialog("Enter your second number: ");
		
		int a =Integer.parseInt(x);
		int b= Integer.parseInt(y);
		
		int sum=a+b;
		
		JOptionPane.showMessageDialog(null, "Total is: " +sum,"Addition",JOptionPane.PLAIN_MESSAGE);
		
		//In the above line,"Addition" is the title we are giving to the dialog box
		
		
	}

}
