package basic;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*int []a={10,20,30,40,50};
        System.out.println(a[0] +" " +a[3]);
        for(int temp:a){
        	System.out.println(temp);
        }*/
		
		/*
		 * Enhanced for loop
		 */
		int []a=new int[5];
		a[0]=20;
		a[3]=60;
		for(int temp1:a){
        	System.out.println(temp1);
        }
		/*similarly for strings*/
		/*String str[]={"one","two","three","four","five"};
		for(String temp2:str)
		{
		System.out.println(temp2);
		}*/
		
		/*
		 * Enhanced for loop
		 */
		String str[]=new String[5];
		str[3]="40";
		str[4]="zer0";
		for(String temp2:str)
		{
			System.out.println(temp2);
		}
			
		}
	}


