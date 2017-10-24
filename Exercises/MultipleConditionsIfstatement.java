package Exercises;

public class MultipleConditionsIfstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int english,telugu,hindi;
		english=90;
		telugu=95;
		hindi=80;
		if(english>=75 && telugu>90||hindi>85)
		{
			System.out.println("Passed"+" "+"Grade A");
			
		}else{
			System.out.println("Failed"+" "+"Grade F");
			
		}
     //Mutiple IF statements
		 if(english>=90&&telugu>=95&&hindi>=90)
		 {
			 System.out.println("Passed"+" "+"Grade A");
		 }else if(english>=80 && telugu>=85 || hindi>=80){
			 System.out.println("Passed"+" "+"Grade B");
			 
			 
		 }else if(english>=60 && telugu>=65 && hindi>=55){
			 System.out.println("Passed"+" "+"Grade C");
			 
			 
		 }else{
			 System.out.println("Failed"+" "+"Grade F");
		 }
	}

}
