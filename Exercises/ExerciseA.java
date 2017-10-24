package Exercises;

public class ExerciseA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double salary=20000.50;
    double tax=0.0;
    if(salary<=10000)
    {
    	tax=salary*0.10;
    	
    }else if (salary<25000)
    {
    	tax=salary*0.40;
    	
    }else 
    {
    	tax=salary*0.60;
	}
	System.out.println(tax);
	}
     
}
