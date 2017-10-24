/*Method Parameters*/
package basic;

public class Calculatescore {
	int score=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatescore scorer=new Calculatescore();
		scorer.add(4, 6, 8, 2, 6, 6);
		scorer.add(4, 6, 4, 2, 6, 9);
		scorer.add(6, 6, 8, 2, 6, 6);
		scorer.add(9, 3, 8, 2, 9, 6);
		scorer.add(8, 6, 3, 2, 4, 6);
		scorer.add(9, 3, 8, 6, 2, 6);
		scorer.printscore();
		
		

	}

	
	public void add(int run1,int run2,int run3,int run4,int run5,int run6)
	{
		score=score+run1+run2+run3+run4+run5+run6;
	}
	public void printscore()
	{
		System.out.println("score is " +score);
		
		
	}

}
