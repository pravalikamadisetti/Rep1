package com.pizza;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//----Pizza Order options 
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner keyboard = new Scanner(System.in);

		//  Variables
		int choice=0;
		String firstName; // first name of user
		double sizeCost=0 ;
		int inches; // Pizza size
		double total=0; // total of base size and delivery fee
		double lastTotal=0; // total of everything
		 
		// Prompts for name & determines discount
		System.out.println("Enter your name: " );
		firstName = keyboard.nextLine();
		
		//Prompts for distance 
		double distance = 0;
		double deliveryfee = 0;
		System.out.println("Please enter total distance in miles from pizza shop (0 for in store pickup):");
		distance = keyboard.nextDouble();
		if (distance == 0)
		{
		deliveryfee = 0;
		System.out.println("There is no delivery fee.");}
		else if (distance > 1){
		deliveryfee = ((distance * 0.5) +2);
		System.out.println("Your delivery fee is: $" + df.format(deliveryfee));}
		else if (distance > 0){
		deliveryfee = 2.00;
		System.out.println("Your delivery fee is: $" + df.format(deliveryfee));
		}
		
		// Prompts for Pizza size
		System.out.print("What size of pizza would you like (diameter in inches)? (10,   12, 14, or 16) " );
		inches = keyboard.nextInt();
		if (inches == 10 ){
			sizeCost = 0; }
		else if (inches == 12){
			sizeCost = 2.99;}
		else if (inches == 14){
			sizeCost = 4.99;}
		else if (inches == 16){
			sizeCost = 6.99;}
		else if (inches != 10 && inches != 12 && inches != 14 && inches != 16){
		System.out.println("The number you have entered is illegal, your pizza size will be set to 12 inches. " );
		sizeCost = 2.99;}
		keyboard.nextLine();
	
		// Prompts user for additional toppings
		System.out.println("Additional toppings are Chicken:$2.0  ,Pepperoni:$1.5 ,Veggie:$2.5 " );
		
		//Select Toppings
		
		System.out.print("1. Chicken " );
		System.out.print("2. pepperoni " );
		System.out.print("3. Veggie " );
		System.out.print("4. No Toppings " );
		System.out.print("5. All meat and Veggie " );
		choice = keyboard.nextInt();
		System.out.println(" " );
		
		if(choice==1||choice==2||choice==3||choice==4||choice==5)
		{
			total=deliveryfee+sizeCost;	 //Includes Delivery and additional base cost based on size
		}
		 
		 switch(choice)
		  {
		    case 1:
		    	    System.out.println("------------------------------------------------------"); 
					System.out.println("Checken Topping Pizza Order");
					Pizza chickenTopping =new BasePizza();
					chickenTopping = new ChickenTopping(chickenTopping);
					lastTotal= total+chickenTopping.getCost();
					System.out.println("chicken pizza Cost: "+lastTotal);
					System.out.println("chicken pizza description: "+chickenTopping.getDescription());
					System.out.println("------------------------------------------------------"); 
					break;
			case 2:
				    System.out.println("------------------------------------------------------"); 
				    System.out.println("Pepperoni Topping Pizza Order");
					Pizza pepperoniToppings =new BasePizza();
					pepperoniToppings =new PepperoniToppings(pepperoniToppings);
					lastTotal= total+pepperoniToppings.getCost();
					System.out.println("Pepperoni pizza Cost: "+lastTotal);
					System.out.println("pepperoni pizza description: "+pepperoniToppings.getDescription());
					System.out.println("------------------------------------------------------");
					break;
		    case 3:
		    	    System.out.println("------------------------------------------------------");    
		    	    System.out.println("Veggie Topping Pizza Order");
		    		Pizza vegTopping =new BasePizza();
		    		vegTopping =new VegToppings(vegTopping);
		    		lastTotal= total+vegTopping.getCost();
		    		System.out.println("Veg pizza Cost: "+lastTotal);
		    		System.out.println("veg pizza description: "+vegTopping.getDescription());
		    		System.out.println("------------------------------------------------------");
					break;
		    case 4:  
		    	   System.out.println("------------------------------------------------------");  
		    	   System.out.print("No Toppings" );
		    	   BasePizza basePizza=new BasePizza();
		    	   lastTotal= total+basePizza.getCost();
		   		   System.out.println("Base pizza Cost: "+lastTotal);
		   		   System.out.println("Base pizza Desc: "+basePizza.getDescription());
		   		   System.out.println("------------------------------------------------------");
					break;
			case 5:
				    System.out.println("------------------------------------------------------");
				    System.out.print("All meat and Veggie" );
				    //A meat and veggie pizza 
			        Pizza AllMeatnVeggie =new BasePizza();
			        AllMeatnVeggie = new ChickenTopping(AllMeatnVeggie);
			        AllMeatnVeggie =new PepperoniToppings(AllMeatnVeggie);
			        AllMeatnVeggie =new VegToppings(AllMeatnVeggie);
			        lastTotal= total+AllMeatnVeggie.getCost();
			      	System.out.println("All Meat and Veggie pizza Cost: "+lastTotal);
			      	System.out.println("All Meat and Veggie description: "+AllMeatnVeggie.getDescription());
			      	System.out.println("------------------------------------------------------");
					break;

		    //case 0: return 0;
		    default:
		    	System.out.print("Try again!!\n" ); 
			    break;
	        
		  }
		 
		//----End Pizza Order 
  
       
	}
}
