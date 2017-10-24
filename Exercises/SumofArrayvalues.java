package Exercises;

public class SumofArrayvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={25,35,15,19,3,13};
		int total=0;
		
		/*for(int i=0;i<a.length;i++)
		{
			total=total+a[i];
			
			
		}
		   System.out.println("sum of values in the array is: " + total);
*/
		//same program logic using enhanced for loop is shown below:
		
		for(int i: a) //enhanced for loop:  for(arraydatatype variablename:arrayname)
		{
			total+=i;
			
		}
		
		System.out.println("sum of values in the array is: " + total);
	}

}
