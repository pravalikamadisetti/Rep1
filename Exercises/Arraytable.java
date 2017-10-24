package Exercises;

public class Arraytable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Index\tvalue");
		int a[]={10,20,30,40,50};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i + "\t" + a[i]);
		}
     //printing array values using enhanced for loop
		/*for(int i:a)
		{
			//System.out.print(i);
			System.out.println( i);
		}*/
	}

}
