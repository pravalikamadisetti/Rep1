package Exercises;

public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisClass obj=new ThisClass();
		System.out.println(obj.FullTime());    //we did not call the assignValues() method so values assigned in the class will be displayed
		System.out.println(" ");
		
		obj.assignValues(00,00,00);       //Calling the assignValues() and it will print the values assigned in that method
		System.out.println(obj.FullTime());

	}

}
