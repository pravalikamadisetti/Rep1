/*If Else and Nested if*/
package basic;

public class IfElseExample {

	public String getSimpleGrade(int score)
	{
		String grade="";
		if(score>80)
		{
			grade="A";
			
		}else if(score>60)
		{
		 grade="B";
		 
		}else if(score>40)
		{
			grade="C";
			
		}else
		{
			grade="D";
		}
		return grade;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         IfElseExample simplegrade=new IfElseExample();
        String grade= simplegrade.getSimpleGrade(70);
        System.out.print(grade);
	}
	

}
