package Exercises;

public class CompositionClass2 {

	
	private String name;
	private CompositionClass birthday;  //taking reference from another class(CompositionClass) and this is called as Composition in java.
	
	public CompositionClass2(String myname,CompositionClass date)
	{
		name=myname;
		birthday=date;
		
	}
	public String toString()
	{
		return String.format("my name is %s and my birthdate is %s",name,birthday );
	}
}
