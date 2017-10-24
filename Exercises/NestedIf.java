package Exercises;
import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner marks=new Scanner(System.in);
		int telugu,hindi;
		System.out.println("Enter telugu marks");
		telugu=marks.nextInt();
		System.out.println("Enter hindi marks");
		hindi=marks.nextInt();
		
		
		telugu=45;
		hindi=20;
		if(telugu >=30){  
			if(hindi>25)
			{
				System.out.println("passed");
			}else{
				System.out.println("failed in hindi");
			}
		}else{
				System.out.println("failed in telugu or both");
			}
		}

	}

//if fist condition is passed then only it will go and check the next condition otherwise it will get failed.
//For the statement to be passed,both the conditions must be true in the above code
