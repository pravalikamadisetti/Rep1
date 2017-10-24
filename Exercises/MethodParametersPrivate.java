package Exercises;
import java.util.Scanner;


public class MethodParametersPrivate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		PrivateVariable obj=new PrivateVariable();
		System.out.println("Enter your favorite movie name");
		String moviename=input.nextLine();
		obj.setMovie(moviename);
        obj.result();
        
	}
	

}
