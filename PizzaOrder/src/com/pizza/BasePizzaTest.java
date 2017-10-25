package com.pizza;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasePizzaTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		 BasePizza test =new BasePizza();
		 double output=test.getCost();
		 //System.out.println(output);
		 assertEquals(6.99, output,0.000001); //Pass
		 assertEquals(6, output,0.000001); //Fail
		 
	}
}
