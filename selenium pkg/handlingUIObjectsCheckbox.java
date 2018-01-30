package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handlingUIObjectsCheckbox {

	@Test
	public void handlingCheckbox()
	{
		
		String location="From PreferredLoc";
	System.setProperty("webdriver.chrome.driver", "C:\\SW\\Selenium Drivers\\chromedriver.exe");
    
    ChromeDriver driver=new ChromeDriver();
    
    driver.get("https://www.ebay.com/");
    driver.findElement(By.id("gh-ac")).sendKeys("laptop");
    driver.findElement(By.id("gh-btn")).click();
    driver.findElement(By.id("gh-as-a")).click();
    driver.manage().window().maximize();
    if(!driver.findElement(By.id("_mPrRngCbx")).isSelected())
    {
    	driver.findElement(By.id("_mPrRngCbx")).click();
    }
    //handling radio button
    if(location.equals("From PreferredLoc"))
    {
    	driver.findElement(By.id("LH_PrefLocRadio")).click();
    }else
    {
    	driver.findElement(By.id("LH_LocatedInRadio"));
    	
    }
    }
    
}