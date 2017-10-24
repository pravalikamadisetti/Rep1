package basic;

public class TwoDimArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][] a=new int[3][3];
        a[0][2]=6;
        
        
        /*for displaying the matrix */
          for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
               {
            	   System.out.print(a[i][j] +" ");
            	   
	
                    }
        	System.out.println();
             }
        
        
        /*assigning the values */
        int temp=5;
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
               {
            	   a[i][j]=temp;
            	   temp+=10;
            	   
	
                    }
             }
        
        /*displaying the assigned values in matrix format*/
        
	   for(int i=0;i<3;i++)
		   
        {
        	for(int j=0;j<3;j++)
        	{
        		System.out.print(a[i][j] +" ");
        	}
        	System.out.println();
        }
	}
}


