package Exercises;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=16;
		/*if(age>=18)
		{
			System.out.println("eligible to vote");
		}else{
			System.out.println("not eligible to vote");
	     }*/
		//instead of writing all the above lines,a single statement can be used to mention this.
	a=(age>=18?"eligible to vote":"not eligible to vote")	
	b=	((a)?"":"")
	c=	((b)?"":"")
	
			
	
			((((age>=18?"eligible to vote":"not eligible to vote")?"a":"b"))?"c":"d")
	
		
		System.out.println((age>=18?"eligible to vote":"not eligible to vote"));
	}

}
