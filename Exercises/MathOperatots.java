package Exercises;
import java.util.Scanner;
class MathOperatots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,z;
		
		x=11;y=2;
		//z=x+y;
		//z=x-y;
		//z=x*y;
		 z=x/y;//for division ,it doesnt give the exact results because of the datatype INT.In such case we need to use double to get the accurate value
		 System.out.println(z);
		 x++; //++x; also works
		 System.out.println(x);
		 y--;
		 System.out.println(y);
		 z+=5;
		 System.out.println(z);
		 
		 //below syntax shows how the input is taken  from the user...
		 
		/*Scanner input=new Scanner(System.in);
		System.out.println("Enter x value: " );
		x=input.nextInt();
		System.out.println("Enter y value: " );
		y=input.nextInt();
		z=x+y;
		System.out.println("sum is: " + z);
		*/
		

	}

}
