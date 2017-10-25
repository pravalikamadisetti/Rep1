package com.pizza;

public class PepperoniToppings implements Toppings{
	private Pizza aPizza;
	//Pepperoni Toping Cost
    private double cost = 1.5;
    
    public PepperoniToppings(Pizza inPizza) {
        aPizza = inPizza;
   }
    
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		//return 4.5;
		return aPizza.getCost()+cost;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return aPizza.getDescription() + " ,additioanally added Peppereoni slices";
	}

	@Override
	public Double getToppingcost() {
		// TODO Auto-generated method stub
		return cost;
	}

}
