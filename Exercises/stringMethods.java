package Exercises;

public class stringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1="my name is pravalika";
		String name2="my name is pravalika";
		boolean result=name1.startsWith("my");	 //startsWith()
		System.out.println(result);
        boolean result2=name2.endsWith("i");     //endsWith()
        System.out.println(result2);
        String actual="welcome";
        String expected="welcome";
        boolean status=actual.equals(expected);   //equals()
        System.out.println(status);
        boolean status2=actual.equalsIgnoreCase(expected);  //equalsIgnoreCase()-it ignores case sensitive(uppercase or lowercase)
        System.out.println(status2);
        boolean value=actual.contains("we");
        System.out.println(value);
	}

}
