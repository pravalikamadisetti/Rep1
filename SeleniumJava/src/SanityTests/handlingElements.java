package SanityTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		
		/*String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		
		String windowHandle=driver.getWindowHandle();
		System.out.println(windowHandle);
		
		driver.close();*/
		
		//navigate() methods
		
		driver.navigate().to("https://www.yahoo.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		
		
	}

}
