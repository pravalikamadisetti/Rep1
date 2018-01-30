package seleniumPkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InheritanceParent {

	

		static FirefoxDriver driver;
		public static void invokeBrowser()
		{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			 driver =new FirefoxDriver();
		}
	}


