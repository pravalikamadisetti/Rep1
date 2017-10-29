package SanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class operationsOnTextArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  FirefoxDriver driver=new FirefoxDriver();
		  
		 // driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
	     //driver.findElement(By.xpath("identifierId")).sendKeys("pravalika");
	     
	     driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	     
	     String s=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div/div/div/svg")).getText();
	
	     System.out.println(s);
	        
	}

}
