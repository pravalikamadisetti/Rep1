package com.pizza;

import static org.junit.Assert.*;

import org.junit.Test;

public class PepperoniToppingsTest {

	@SuppressWarnings("deprecation")
	//Test Case Scenario:Verifying the cost of pizza with pepperoni toppings and the output should be 8.49,then the test is passed otherwise failed.
	@Test
	public void testGetCost() {
		Pizza pepperoniToppings =new BasePizza();
		pepperoniToppings =new PepperoniToppings(pepperoniToppings);
		double output=pepperoniToppings.getCost();
		//System.out.println(output);
		double actual=8.49;
		
		//assertEquals(actual, output,0.0001); //PASS
		assertEquals(actual, output,0.0001); //Fail
		
		
	}
}
