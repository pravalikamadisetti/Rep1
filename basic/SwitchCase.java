package basic;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int j=3;
		switch(j){
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("none");
			break;
			
		}*/
		
/*
 * till java 7 strings are not accepted for switch case but after java 8 its accepted
 */
		String j="two";
		switch(j){
		case "zero":
			System.out.println("zero");
			break;
		case "one":
			System.out.println("one");
			break;
		case "two":
			System.out.println("two");
			break;
		case "three":
			System.out.println("three");
			break;
		default:
			System.out.println("none");
			break;
			
		}
	}

}
