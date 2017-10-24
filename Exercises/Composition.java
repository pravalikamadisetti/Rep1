package Exercises;

public class Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		CompositionClass obj= new CompositionClass(27,7,1989);
		CompositionClass2 obj1=new CompositionClass2("pravalika",obj);//here obj is the reference of "CompositionClass" class
		System.out.println(obj1);
		
		
	}

}
