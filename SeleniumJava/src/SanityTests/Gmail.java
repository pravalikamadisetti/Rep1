package SanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//WEB ELEMENT LOCATORS:ID,NAME,CLASSNAME,TAGNAME,LINKTEXT.....

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	
             //ID:	
//driver.findElement(By.id("identifierId")).sendKeys("pravalika.madisetti");//we can write this way or another way shown below
//		WebElement Email=driver.findElement(By.id("identifierId"));//We can use this syntax for multiple operations on that element.
//		Email.sendKeys("Pravalika.madisetti");
//		Email.clear();
		
		    //NAME:
//		driver.findElement(By.name("identifier")).sendKeys("magham9");
		
		   //CLASSNAME:
//		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("magham9");
		
		  //TAGNAME:
//		driver.findElement(By.tagName("input")).sendKeys("India");
		
		  //linkText:This is only for text links.Linktext is visible and need not to inspect.For example,search google.com and there you can find "Gmail"linkText
//		driver.findElement(By.linkText("Gmail")).click();
		
		//PARTIAL LINKTEXT:This is only for text links.we can use partial value of linktext .For example,Gmail in the above can used as "Gma"
//		driver.findElement(By.partialLinkText("Gma")).click();
		
		//CSS SELECTOR:
//		driver.findElement(By.cssSelector("#identifierId")).sendKeys("India");
	
		//XPATH:
//	    driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("Nihal");	
		
		
		//PROGRAM TO LOGIN TO GMAIL:
		
		driver.findElement(By.id("identifierId")).sendKeys("pravalika.madishetty");
		driver.findElement(By.tagName("span")).click();
		driver.findElement(By.name("password")).sendKeys("sairam06");
		driver.findElement(By.className("RveJvd snByac")).click();
	}

}
