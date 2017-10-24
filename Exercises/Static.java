package Exercises;

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariable member1=new StaticVariable("Mahesh","Magham");
		StaticVariable member2=new StaticVariable("Pravalika","Magham");
		StaticVariable member3=new StaticVariable("Nihal","Magham");
		
		System.out.println("\n_________________________\n");
		
		System.out.printf("Name:%s%s \ntotal members:%d \n",member1.getFname(),member1.Lname(),member1.members());
		System.out.printf("Name:%s%s \ntotal members:%d \n",member2.getFname(),member2.Lname(),member2.members());
		System.out.printf("Name:%s%s \ntotal members:%d \n",member3.getFname(),member3.Lname(),member3.members());



	}

}
