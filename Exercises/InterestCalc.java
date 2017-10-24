package Exercises;
import java.util.Scanner;


public class InterestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		double amount;
		double principal;
		double rate;
		double totalterms;
		System.out.println("Enter principal amount: " );
		principal=input.nextDouble();
		System.out.println("Enter interest rate: " );
		rate=input.nextDouble()/100;//if user doesnt know how to convert to %(ex:he can enter as 2%,3%....)
//		rate=input.nextDouble(); //if user knows to convert the % he can directly enter the value(EX:0.02)
		System.out.println("Enter totalterms :");
		totalterms=input.nextDouble();
		
		double interest= principal*rate;
	
		double totalinterest=interest*totalterms;
		System.out.println( totalinterest);
		amount=principal+totalinterest;
		System.out.println( "final amount with interest is: " +amount);
		//till the above statement,we calculated interest for the principal amount which is constant
		//in the next logic,interest is calculated(compound interest):principal amount will change for every month by adding interest
		
		//Scanner input=new Scanner(System.in);
		
		for(int month=1;month<=12;month++)
		{
	
			amount=principal*Math.pow(1+rate, month);//math.pow is used for exponential form
//			System.out.println(month + " amount is: " + amount);
			if(month==12)
			{
				System.out.println( "final amount with compound interest is: " +amount);
			}
			
		}

	}

}
