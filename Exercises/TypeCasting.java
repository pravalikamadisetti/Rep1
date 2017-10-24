package Exercises;

import java.util.Scanner;


public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a,b;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a value");
		
		a=input.nextLine();
		
		int x=Integer.parseInt(a);
		
		System.out.println("Enter b value");
		
		b=input.nextLine();
		
		int y=Integer.parseInt(b);
		
		int sum=x+y;
		
		System.out.println("Sum value is: "+ sum) ;
		
	}
	

}
