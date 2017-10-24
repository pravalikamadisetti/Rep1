package basic;
/*Integer Variable*/

public class Cricketscore {
	int score=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricketscore scorer=new Cricketscore();
		scorer.printscore();
		scorer.one();
		scorer.six();
		scorer.two();
		scorer.four();
		scorer.printscore();
		

	}
	public void one()
	{
		score=score+1;
		
	}
	public void two()
	{
		score=score+2;
		
	}
	public void four()
	{
		score=score+4;
		
	}
	public void six()
	{
		score=score+6;
		
	}
    public void printscore()
    {
    	System.out.print("score is " +score);
    }
}
