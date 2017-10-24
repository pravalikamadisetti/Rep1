/*return value from function*/
package basic;

public class Maths {
	public int Sumof4numbers(int num1,int num2,int num3,int num4)
	{
		int sum=num1+num2+num3+num4;
		return sum;
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Maths maths=new Maths();
		 int sum = maths.Sumof4numbers(3,6,9,13);
		 System.out.println(sum);
		 
	}


}
