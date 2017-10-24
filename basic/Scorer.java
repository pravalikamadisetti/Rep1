/*Method Parameters*/
package basic;

public class Scorer {
	int score=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scorer scorer=new Scorer();
		scorer.add(6);
		scorer.add(3);
		scorer.add(9);
		scorer.printscore();

	}
	public void add(int runs)
	{
		score=score+runs;
	}
	public void printscore()
	{
		System.out.println("score is " +score);
	}

}
