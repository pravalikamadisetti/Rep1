package Exercises;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//For TimeLogic Class  (24 hours time format)
		
      TimeLogic obj=new TimeLogic(); //as of now we did not give any values to set the time 
      System.out.println(obj.FullTime());
      obj.SetTime(16, 42, 51);    //values given using SetTime method
      System.out.println(obj.FullTime()); 
      
      System.out.println(" ");
      
      
 //For TimeLogic Class : RegularTime Method (watch clock 1 to 12 format )
      
      obj.SetTime(14, 56, 13);
      System.out.println(obj.FullTime());     //fulltime(24 hours format no AM and PM)
      System.out.println(obj.RegularTime());  //Regulartime(Clock time 1 to 12 format with AM and PM)
      
      System.out.println(" ");
      
/*NOTE:     obj.hr=2;   In TimeLogic Class,we declared hr as private variable so we cannot access the varaiable here.
                    but incase if it is not private we can acces the variable as shown
      */
          
      
 //For TimeFormat Class
      
      TimeFormat obj1=new TimeFormat();  
      System.out.println(obj1.ConvertFormat());//values not passes so default it should be 000:000:000
      obj1.Numbers(99,125,299);    //values passed
      System.out.println(obj1.ConvertFormat());   //printing the values and converting to the format by applying logic mentioned NumberFormat method
	}

}
