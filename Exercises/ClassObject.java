package Exercises;
import java.util.Scanner;
public class ClassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ClassMethod obj=new ClassMethod();
      Scanner input=new Scanner(System.in);
      System.out.println("Enter username");
      String username=input.nextLine();
      obj.GoogleAcc(username);
	}

}
