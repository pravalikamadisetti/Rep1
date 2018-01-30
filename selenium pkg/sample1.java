package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.setProperty("webdriver.chrome.driver", "C:\\SW\\Selenium Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-ac")).sendKeys("laptop");
		driver.findElement(By.id("gh-btn")).click();
		
        

	}

}
