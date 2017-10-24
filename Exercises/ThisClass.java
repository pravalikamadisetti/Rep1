package Exercises;

public class ThisClass {

	private int a=10;     //here variable names are a,b,c
	private int b=15;
	private int c=13;
	
	
	
public void assignValues(int a ,int b,int c) //variable names are same (a,b,c) as class variables
{
	//if we dont use "this" keyword then it will print the above values assigned in the class because of same variable names.
	//"This" keyword prompts to print the values assigned in that particular method  incase of same variable names used .
	
	this.a=24;
	this.b=10;
	this.c=99;
	/*System.out.print(a + " ");
	System.out.print(b + " ");
	System.out.print(c + " ");
	*/
}
public String FullTime()
{
	return String.format("%02d:%02d:%02d", a,b,c);
}

}
