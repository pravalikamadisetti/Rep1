package Exercises;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*InheritanceB obj1=new InheritanceB();
		obj1.Fruits();*/
		
		//Here "InheritanceA" is a super class;"InheritanceB and InheritanceC" are subclasses;
		//"InheritanceB" inherits properties from InheritanceA;"InheritanceC" inherits properties from "InheritanceB"(which has properties of "InheritanceA")
		//Similarly a sub class can also inherit from another sub class as below 
		//Therefore when we create an object for subclass "InheritanceC",we can call the methods of both InheritanceB and InheritanceA 
		
		InheritanceC obj2=new InheritanceC();
		obj2.Fruits();
		obj2.Orange();
		

	}

}
