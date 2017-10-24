package Exercises;

public class InheritanceA {
	
	//This is a Super/Parent Class
	
	public void Fruits()   //private void Fruits():if super class method is declared as "private",subclass cannot inherit the method/properties of super class
	                             //So,inheritance happens only when it is declared as public
	                            //public final void Fruits() :if the super class method is declared as final,then sub class cannot override the super class method
	{
		System.out.println("People love to eat me");
	}

}
