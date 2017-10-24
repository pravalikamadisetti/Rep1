package basic;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String x="mahipravilucky";
      System.out.println("Hello" + " " + x);
      System.out.println(x.toUpperCase());
      System.out.println(x.toLowerCase());
      System.out.println(x.charAt(6));
      System.out.println(x.substring(3));
      System.out.println(x.substring(9,14));
      
      String age="36";
     
      String salary="10000.50";
      /*
       * As the data type value is string,we can do manipulations like 36/2 or 32*2....
       * for that we need to convert string to integer by using wrapper classes and do
       * the required manipulations
       */
//      int a=Integer.parseInt(age); converting string to int and assigning to a 
     
      int a=Integer.parseInt(age)/2;
      System.out.println(a);
      double b=Double.valueOf(salary)*2;
      System.out.println(b);
      
      
      
      
	}

}
