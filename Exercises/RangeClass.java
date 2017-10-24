package Exercises;

public enum RangeClass {
	
	A("He is a Software Engineer","35","Male","TCS","Massachussets","United States"),
	B("She is a Doctor","39","Female","KIMS","Hyderabad","India"),
	C("He is a Lawyer","30","Male","Supreme Court","Bangalore","India"),
	D("She is a pilot","28","Female","Indian Airways","Chennai","India"),
	E("She is a soldier","40","Female","Indian Army","Kashmir","India");
	
	private final String designation;
	private final String age;
	private final String gender;
	private final String Organisation;
	private final String state;
	private final String country;
	
	RangeClass(String userDesg,String userAge,String userGender,String userOrg,String userState,String userCoun)
	{
		designation=userDesg;
		age=userAge;
		gender=userGender;
		Organisation=userOrg;
		state=userState;
		country=userCoun;
		
	}
	String getDesignation()
	{
		return designation;
	}
	String getAge()
	{
		return age;
		
	}
	String getGender()
	{
		return gender;
		
	}
	String getOrganisation()
	{
		return Organisation;
	}
    String getState()
    {
    	return state;
    }
    String getCountry()
    {
    	return country;
    }
}
