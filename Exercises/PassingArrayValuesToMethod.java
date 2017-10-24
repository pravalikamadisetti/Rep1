package Exercises;

public class PassingArrayValuesToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]={10,20,30,40,50,60};
       System.out.println("before passing and applying the method logic : ");
       
       for(int j:a)     //logic to print the array values
       {
    	   System.out.println(j);
       }
       
       //passing the above values in the array to the (Change) method is shown below:
       
       Change(a);    //syntax is :methodname(arrayname);array values in a[] are passed to dummy array
       
       System.out.println("after passing and applying the method logic : ");
       
       for(int j:a)
       {
    	   System.out.println(j);
       }
       
	}
   public static void Change(int dummy[])
   {
	   for(int i=0;i<dummy.length;i++)
	   {
		   dummy[i]+=5;
	   }
   }
}
