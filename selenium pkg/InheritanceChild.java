package seleniumPkg;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InheritanceChild extends InheritanceParent {

	public static void Main(String[] args)
	{
	
		invokeBrowser();
		driver.get("https://www.google.com/");
		
	}
}
