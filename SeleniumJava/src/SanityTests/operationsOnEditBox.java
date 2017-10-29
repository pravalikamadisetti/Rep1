package SanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class operationsOnEditBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		
		WebElement Email=driver.findElement(By.xpath(".//*[@id='identifierId']"));
		
		
		//operations on Email edit box:
		
		Email.sendKeys("pravalika.magham");   //enter a value in the edit box
		
		Email.clear();                       //clear the value
		
		//System.out.println(Email.getAttribute("type"));  //return the type attribute of that value
		
		System.out.println(Email.getText());            //return the value 
		
		//System.out.println(Email.isDisplayed());        //displayed status-boolean value-true or false
		
		//System.out.println(Email.isEnabled());          //enabled status-boolean result
	}
	

}
