package Exercises;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,y;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter y");
		y=input.nextInt();
		while(x<y)
		{
			System.out.println(x +" " +"Hello");
			x++;
		}
		

	}

}
