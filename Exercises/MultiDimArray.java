package Exercises;

public class MultiDimArray {

	public static void main(String[] args) {
		//Multi dimensional Array for creating rows and colums in excel
		
		
		
		int a[][]={{10,20,30,40,50},{5,15,25,35,45},{3,6,9,12,16}};
		
		//the values in the curly braces will be read as {{a[0][0},a[0][1],[0][2},...},{[1][0],[1][1],[1][2},...},{[2][0],[2][1],[2][2]...}
		
		//System.out.println(a[1][2]);//so a[1][2] will be 25
		
		System.out.println("This is Table A : ");
		
		printmethod(a); //for passing the array values in a[][] to the method(print method) defined below
		
		//suppose to create another table with the same method
		
		int b[][]={{1,2,3,4,5},{6,13,27},{3,6}};
		
		System.out.println("This is Table B : ");
		
		printmethod(b);
		
			
		
		}
		
	
	
	
	public static void printmethod(int dummy[][])
	{
		for(int r=0;r<dummy.length;r++)  //r for rows and c for columns
		{
			for(int c=0;c<dummy[r].length;c++)  //here in order to get the column length,we are taking row as reference
			{
				System.out.print(dummy[r][c] + "\t");
			}
			System.out.println("");
		}
		
	}
}

