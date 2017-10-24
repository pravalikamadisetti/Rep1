package Exercises;

public class StaticVariable {
	
	private String fname;
	private String lname;
	public static int members=0;  //As we static keyword,the value of that variable will be fixed initially
	
	public StaticVariable(String fn,String ln)
	{
		fname=fn;
		lname=ln;
		members++;
		
		System.out.printf("My name is %s%s and total members are %d \n",fname,lname,members );
	}
	public String getFname()
	{
		return fname;
	}
	public String Lname()
	{
	return lname;	
	}
	public int members()
	{
		return members;
	}

}
