package Exercises;

public enum EnumClass {          //EnumClass is the Enum name;Enum is like a class that represent fixed no of values
	
	mahesh("He is a Technical Manager","35","Male"),
	pravalika("She is a student and homemaker","28","Female"),    //the values are enum constants
	lucky("He is a kid","3","Male"),
	shiny("She is a kid","3","Female"),
	Lovely("She is a kid","2","Female");
	//u can add any no of users (mahesh,pravalika,lucky,shiny,lovely...) and need not to change the code ,but if change/add the parameters (desc,age,gender...),then we need to change the code.
	
	
	private final String desc;    //varaible declared as "Final" can be initialised only once and the values cannot be changed.
	private final String age;
	private final  String gender;
	
	EnumClass(String userDesc,String userAge,String UserGender)  //constructor
	{
		desc=userDesc;
		age=userAge;
		gender=UserGender;
		
		
	}
	String getDesc()
	{
		return desc;
	}
	String getAge()
	{
		return age;
	}
	String getGender()
	{
		return gender;
	}
}
