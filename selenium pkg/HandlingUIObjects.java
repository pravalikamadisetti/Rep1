package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class HandlingUIObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//@Test
		//public void handlingLinks1()
		//{
			System.setProperty("webdriver.chrome.driver", "C:\\SW\\Selenium Drivers\\chromedriver.exe");
		         
		     ChromeDriver driver=new ChromeDriver();
		     
		     driver.get("https://www.ebay.com/");
		     driver.findElement(By.id("gh-ac")).sendKeys("laptop");
		     driver.findElement(By.id("gh-btn")).click();
		     driver.findElement(By.id("gh-as-a")).click();
		     
		}

	}

	

