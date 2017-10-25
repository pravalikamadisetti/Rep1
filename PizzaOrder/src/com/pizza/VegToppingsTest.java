package com.pizza;

import static org.junit.Assert.*;

import org.junit.Test;

public class VegToppingsTest {
//Test Case Scenario:Verifying the cost of pizza with veggie toppings and the output should be 9.49,then the test is passed otherwise failed.
	@Test
	public void testGetCost() {
		
		  Pizza VegToppings = new BasePizza();
		  VegToppings = new VegToppings(VegToppings);
		  double output=VegToppings.getCost();
		  assertEquals(9.49, output,0.00001);//pass
		 // assertEquals(9.4, output,0.00001);//fail
	}
	//Test Case Scenario:Verifying the cost of only veggie toppings and the output should be 2.5,then the test is passed otherwise failed.
	@Test
	public void testGetToppingcost() {
		
		Pizza VegToppings = new BasePizza();
	VegToppings = new VegToppings(VegToppings);
	double output=VegToppings.getToppingcost();
	//assertEquals(2.0, output,0.0001); //fail
	assertEquals(2.5, output,0.0001);//pass
	
	}

}
