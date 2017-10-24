package Exercises;

public class CompositionClass {

	private int day;
	private int month;
	private int year;
	
	public CompositionClass(int d,int m,int y)
	{
		day=d;
		month=m;
		year=y;
		//System.out.printf("printed dates is %s", this);
	}
	
	public String toString()
	{
		return String.format("%d/%d/%d", day,month,year);
	}
	
}

