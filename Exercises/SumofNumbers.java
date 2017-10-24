package Exercises;

public class SumofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(Sum(10,20,30));
		
		 //SumofNumbers obj=new SumofNumbers();
		  //obj.Sum(10,20,30);
		  
		System.out.println(Sum(10,20,30)); //   we can write this way also instead of creating an object

	}
    public static int Sum(int a ,int b,int c)
    {
    	int total=a+b+c;
    	//System.out.println(total);  in case of creating an object and printing the value we can use this
        return total;
    	
    }
}
