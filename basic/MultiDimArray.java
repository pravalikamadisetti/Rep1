package basic;

public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[][]={{1,2,3,4,5},{5,6,7,8,9},{3,9,1,15,13}};
    
  //the values in the curly braces will be read as {{a[0][0},a[0][1],[0][2},...},{[1][0],[1][1],[1][2},...},{[2][0],[2][1],[2][2]...}
    
    
	 for(int r=0;r<a.length;r++)  //r for rows and c for columns
	{
		for(int c=0;c<a[r].length;c++)  //here in order to get the column length,we are taking row as reference
		{
			System.out.print(a[r][c] + "\t");
		}
		System.out.println("");
	} 
	
	}

}
