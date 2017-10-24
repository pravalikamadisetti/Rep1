package Exercises;

public class PrivateVariable {

	private String fmovie;
	public void setMovie(String moviename)
	{
		//fmovie=moviename;
		
		fmovie=getMovie();
	}
  private String getMovie()
   {
	  return "Lucky";
   }
  
  
  public void result(){
	  System.out.printf("your favorite movie name is %s" , getMovie());
  }
  
}