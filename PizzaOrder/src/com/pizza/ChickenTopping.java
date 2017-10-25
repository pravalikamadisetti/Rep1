package com.pizza;

public class ChickenTopping implements Toppings{
	private Pizza aPizza;
	//Chicken Tipping Cost
    private double cost = 2.0;
    
    public ChickenTopping(Pizza inPizza) {
        aPizza = inPizza;
   }
    
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		//return 2.3;
		 return aPizza.getCost() + cost;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		//return "chicken PIzza";
		return aPizza.getDescription() + ", additioanally added Chicken Topping";
	}

	@Override
	public Double getToppingcost() {
		// TODO Auto-generated method stub
		return cost;
	}

}
