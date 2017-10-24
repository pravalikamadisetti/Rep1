package Exercises;

public class MultipleConstrutors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleConstructorsExample obj  = new MultipleConstructorsExample();
		MultipleConstructorsExample obj1 = new MultipleConstructorsExample(6);
		MultipleConstructorsExample obj2 = new MultipleConstructorsExample(9,30);
		MultipleConstructorsExample obj3 = new MultipleConstructorsExample(6,36,42);
		
		System.out .println(obj.Time());
		System.out.println(obj1.Time());
		System.out.println(obj2.Time());
		System.out.println(obj3.Time());

	}

}

