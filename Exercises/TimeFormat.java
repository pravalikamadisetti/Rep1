package Exercises;

public class TimeFormat {
	private int number1;
	private int number2;
	private int number3;
	
	public void Numbers(int nm1,int nm2,int nm3)
	{
		number1=(nm1>=0&&nm1<100?nm1:0);
		number2=(nm2>=0&&nm2<200?nm2:0);
		number3=(nm3>=0&&nm3<300?nm3:0);
		
	}
	public String ConvertFormat()
	{
		return String.format("%03d:%03d:%03d",number1,number2,number3 );
	}
	

}
