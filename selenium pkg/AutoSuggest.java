package seleniumPkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("gsfi")).sendKeys("ind");
		Thread.sleep(5000);
		List<WebElement> li=driver.findElementsByCssSelector("ul[role='listbox']>li");
		System.out.println("size of list box is " +li.size());
		
		for(int i=0;i<li.size();i++)
		{
			if(li.get(i).getText().equals("indigo"));
			{
				li.get(i).click();
				System.out.println("Match found " );
				break;
			}
		}
	}

}
