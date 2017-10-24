package Exercises;

public class TimeLogic {

    private int  hr;
	private int  min;
	private  int sec;
	
	public void SetTime(int hh,int mm,int ss)
	{
		hr=(hh>=0&&hh<24?hh:0);   //conditional values
		min=(mm>=0&&mm<60?mm:0);
		sec=(ss>=0&&ss<60?ss:0);
		
	}
	public String FullTime()
	{
		return String.format("%02d:%02d:%02d", hr,min,sec);  //converting the values from above method to the format 00:00:00
	}
	
	public String RegularTime()  //converting full time (24 hrs time) to regular time(clock time 1 to 12)
	{
		return String.format("%d:%02d:%02d %s", ((hr==0 || hr==12) ? 12 : hr%12), min, sec, (hr<12) ? "AM" : "PM");
		
	}
	
	
}
