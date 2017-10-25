package com.pizza;

public class VegToppings implements Toppings {
	private Pizza aPizza;
	//Veggie Toping Cost
    private double cost = 2.5;
	
    public VegToppings(Pizza inPizza) {
        aPizza = inPizza;
   }
    
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return aPizza.getCost()+cost;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return aPizza.getDescription() + " ,Additionally added 1 veggie topping";
	}

	@Override
	public Double getToppingcost() {
		// TODO Auto-generated method stub
		return cost;
	}

}
