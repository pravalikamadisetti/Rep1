package seleniumPkg;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.id("uh-search-box")).sendKeys("selenium webdriver");
		Thread.sleep(5000);
		
		List<WebElement> searchlist=driver.findElements(By.cssSelector("ul[role='listbox']>li"));
		
		for(int i=0;i<searchlist.size();i++)
		{
			//WebElement ele=searchlist.get(i);
			
			if(searchlist.get(i).getText().contains("interview"))
			{
				searchlist.get(i).click();
				System.out.println("Element found ");
				break;
				
			}
		}
		
	}

}
