package Exercises;

public class SumofMultipleArgsUsingSameMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(sumofnumbers(10,20,30,40,60,90));//we can keep adding any no of arguments and get the sum value.
        System.out.println(sumofdecimalvalues(2.4,3.6,4.9,6.6,13.9));
        
	}
 
	public static int sumofnumbers(int...total) //by using int...  (any datatype we can use followed by 3 dots),we can add any no of values or arguments to the variable called "total"
	{
		int sum=0;
		for(int i:total)    //similar to enhanced for loop used in arrays
		{
			sum+=i;
			
		}
		//return sum;               // to return the sum value 
		int avg=sum/total.length;   //to return the avg value
		return avg;
	}
	public static double sumofdecimalvalues(double...adddecimalvalues)
	{
		double sum=0.0;
		for(double j:adddecimalvalues)
		{
			sum+=j;
			
		}
		return sum;
	}
	
	
	
	
	
}
