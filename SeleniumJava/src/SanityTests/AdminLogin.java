package SanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:/SW/geckodriverv0.18.0win64/geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();//Here WebDriver is the interface,Launches firefox browser with blank url.similarly we do it for chrome,IE..
		
		//Creating firefox driver object using webdriver interface.For Firefox,no need to set path
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin"); //driver.findElement(By.name("username")).sendKeys("admina");-For invalid input.test it and see if it is getting failed or not.
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		//driver.close(); //close the browser.
		
		//VERIFICATION POINT:Capture the browser URL after submission of login credentials and compare with expected URL.
		
		String url=driver.getCurrentUrl();
		if(url.equals("http://www.gcrit.com/build3/admin/index.php"))
		{
			System.out.println("Login successful:Passed");
	
			
		}
		else{
			System.out.println("Login Unsuccessful:Failed");
		}
		driver.close();
		}
		
	
		
		
}


