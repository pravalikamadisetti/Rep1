package Exercises;

public class ConstructorExample {
   private String fmovie;
   public ConstructorExample(String x)
   {
	   fmovie=x;
   }
   public void setMovie(String moviename)
   {
	   fmovie=moviename;
   }
   public String getMovie()
   {
	   return fmovie;
   }
   public void result()
   {
	   System.out.printf("your favorite movie is %s\n",getMovie());
   }
}

