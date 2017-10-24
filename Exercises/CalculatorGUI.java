package Exercises;
import javax.swing.JFrame;

public class CalculatorGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CalculatorGUIClass Calc=new CalculatorGUIClass();
     Calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     Calc.setSize(340,430);  //width and height
     Calc.setVisible(true);
     Calc.setResizable(false);
	}

}
