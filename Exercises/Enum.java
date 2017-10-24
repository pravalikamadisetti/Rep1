package Exercises;

public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(EnumClass users:EnumClass.values())  //advanced for loop...Here users is the name or identifier(any name),EnumClass is the enum name
		{
		System.out.printf("%s\t%s\t%s\t%s\n",users,users.getDesc(),users.getAge(),users.getGender());
		}

	}

}
