package com.pizza;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChickenToppingTest {

 
	//Test Case Scenario:Verifying the cost of pizza with chicken toppings and the output should be 8.99,then the test is passed otherwise failed.
	@Test
	public void testGetCost() {
		Pizza chickenTopping =new BasePizza();
		chickenTopping = new ChickenTopping(chickenTopping);
		 double output=chickenTopping.getCost();
		// assertEquals(8.99, output,0.00001); //Pass
		 assertEquals(3, output,0.00001); //Fail
		  
	}
	//Test Case Scenario:Verifying the cost of only chicken toppings and the output should be 2.0,then the test is passed otherwise failed.
	@Test
	public void testGetToppingcost() {
		Pizza chickenTopping =new BasePizza();
		chickenTopping = new ChickenTopping(chickenTopping);
		 double output=chickenTopping.getToppingcost();
		 //assertEquals(2.0, output,0.0001); //Pass
		 assertEquals(1, output,0.0001); //Fail
	}

}
