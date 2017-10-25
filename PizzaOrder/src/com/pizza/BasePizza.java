package com.pizza;

public class BasePizza implements Pizza{
	private double cost;
	private String description;
	private double costtopping;
	
public BasePizza( )
{
	cost=6.99;
	//cost=6;
	costtopping=0;
	description="Plain cheese Pizza with Tomato sauce";
}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.cost;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}
	
	@Override
	public Double getToppingcost() {
		// TODO Auto-generated method stub
		return this.costtopping;
	}
	
}
