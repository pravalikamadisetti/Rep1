package Exercises;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key=new Scanner(System.in);
		
/*	NOTE:	 System.out.print(key.nextLine());   For strings
		double myNum=key.nextDouble();       for numbers
		System.out.print(myNum); */
		
		/*FOR ADDING 2 NUMBERS */
		
		int x;//we can use other data types like double,float as well
		int y;
		int z;//or int x,y,z;
		System.out.print("Enter a number: ");
		x=key.nextInt();
		System.out.print("Enter another number: ");
		y=key.nextInt();
		z=x+y;
		/* z=x*y ;we can implement any operation  */
		System.out.println("z value is :" +z);
		
		

	}

}
