package Exercises;

public class MultipleConstructorsExample {

	private int hr;
	private int min;
	private int sec;
	
	public MultipleConstructorsExample() //default constructor with no arguments
	{
		this(0,0,0);
	}
    public MultipleConstructorsExample(int h)       //constructor with 1 argument
    {
    	this(h,0,0);
    }
    public MultipleConstructorsExample(int h,int m)  //constructor with 2 arguments
    {
    	this(h,m,0);
    }
    public MultipleConstructorsExample(int h,int m,int s) //constructor with 3 arguments
    {
    	
    	SetTime(h,m,s);
    }
    public void SetTime(int h,int m,int s)
    {
    	SetHour(h);
    	SetMinute(m);
    	SetSecond(s);
    }
    public void SetHour(int h)
    {
    	hr=((h >= 0 && h <24) ? h :0);
    	
    }
    public void SetMinute(int m)
    {
    	min=((m >= 0 && m <60) ? m :0);
    	
    }
    public void SetSecond(int s)
    {
    	sec=((s >= 0 && s < 60) ? s :0);
    	
    }
    public int getHour()
    {
    	return hr;
    }
    public int getMinute()
    {
    	return min;
    	
    }
    public int getSecond()
    {
    	return sec;
    }
    public String Time()
    {
    	return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
    }
	
}
