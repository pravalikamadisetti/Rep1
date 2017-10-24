package basic;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		x=-10;
		y=20;
		/*if(x>y&&y<x)
		{
			System.out.print("x is greater");
		}else if(x==y){
			
		
			System.out.print("x is equal to y");
			}
		else{
			System.out.print("y is greater");
		}*/
		if(x>0 && y>0)
		{
			System.out.print("positive");
		}else if(x>0 || y>0 )
		{
			System.out.print("atleast one is positive ");
		}
		else
		{
			System.out.print("negative");
		}

	}

}
