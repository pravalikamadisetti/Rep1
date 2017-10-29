package SanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingElementsFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize(); //to maximize the screen
		
		driver.findElement(By.xpath(".//*[@id='u_0_9']")).sendKeys("pravalika");//handling edit box:to enter data
		
		
		Select sel1=new Select(driver.findElement(By.xpath(".//*[@id='month']")));//handling dropdown
		
		sel1.selectByIndex(3); //select by index
		
		Select sel2=new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		
		sel2.selectByValue("28"); //select by value
		
		Select sel3=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		
		sel3.selectByVisibleText("2017");  //select by visible text
		
		driver.findElement(By.cssSelector(".login_form_label_field>div>a")).click(); //handling links
		 driver.quit();
		
		
		
	}

}
