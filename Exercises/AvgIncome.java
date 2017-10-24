package Exercises;
import java.util.Scanner;

public class AvgIncome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int income;
		int total=0;
		int avg;
		int i=0;
		//System.out.println("Enter amount per day");
		//int amount=input.nextInt();
		while(i<10)
		{
			//System.out.println("Enter income per day"+ i +":");
			System.out.print("Enter income per day"+ i +":");
			income=input.nextInt();
			total=total+income;
			//System.out.println("total income is:"+total);
			i++;
			
		}
		
        avg=total/10;
        System.out.println();//to get a gap before avg statement
        System.out.println("avg income per day is: " +avg);
	}

}
