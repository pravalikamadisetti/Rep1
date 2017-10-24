package basic;

public class car {
	String name="DEFAULT VALUE";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car sportscar = new car();
		sportscar.price();
		car nano = new car();
		nano.safety();
		car luxury = new car();
		luxury.model();
		

	}
	public void price()
	{
		System.out.println(name + "price of the car is 10000000");
	
	}
	public void model()
	{
		System.out.println(name + "model of the car is xyz");
		
	}
	public void safety()
	{
		System.out.println(name +"safety level is poor5");
	}

}
