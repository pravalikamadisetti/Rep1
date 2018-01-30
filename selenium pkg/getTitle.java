package seleniumPkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.setProperty("webdriver.gecko.driver", "C:\\SW\\Selenium Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\SW\\Selenium Drivers\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.indeed.com/");
		String actual=driver.getTitle();
		System.out.println("the actual title is " +actual);
		String expected="Job Search | Indeed";
		if(actual.equals(expected))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}	
		}
		
	}


