package Exercises;

public class DateConstructorExample {

	private int  day;
	private int  month;
	private int  year;
	
	public DateConstructorExample(int d,int m,int y)
	{
		day=d;
		month=m;
		year=y;
		
		//System.out.printf("printed date from constructor is %s ",DateFormat());// way to print the DateFormat() by using method name
		
		System.out.printf("printed date from constructor is %s ",this);//change the method to toString() name(Another way to print the dbelow method (date format))
		
		    //this keyword will search for toString()(in-built java method) and will print toStringvalue
	}
	//public String DateFormat()
	
	 public String toString()   //in case if we want to print the statement by using "this" keyword,then we need use "toString()"
	{
		return String.format("%d/%d/%d", day,month,year);
	}
	 
	 /*public String myString()  //if there are 2 string methods toString() and myString(),still it prints toString() only.Final result comes from toString() only.
	 {
		 return String.format("%d/%d/%d",month,day,year);
	 }
	 */
	 
}
