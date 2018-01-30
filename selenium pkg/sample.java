package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		String str="Pravalika";
//		System.out.println("My name is "+str);
		//System.setProperty("webdriver.gecko.driver", "c:\\SW\\Selenium Drivers\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("u_0_e")).sendKeys("Pravalika");
		driver.findElement(By.xpath("//input[contains(@class,'_58mg')]")).sendKeys("pravalika");
		/*driver.findElement(By.xpath(".//*[@id='u_0_e']")).sendKeys("pravalika");
		driver.findElement(By.id("u_0_g")).sendKeys("Magham");
		driver.findElement(By.id("u_0_j")).sendKeys("pravimagham@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("pravi");
		Select month_dd=new Select(driver.findElement(By.id("month")));
		month_dd.selectByVisibleText("Jun");*/
		/*Thread.sleep(3000);
		month_dd.selectByValue("12");//select has 3 options:select by visible text,slect by value,select by index
		Thread.sleep(4000);
		month_dd.selectByIndex(1);
		Select day_dd=new Select(driver.findElement(By.id("day")));
		day_dd.selectByIndex(6);
		Select year_dd=new Select(driver.findElement(By.id("year")));
		year_dd.selectByVisibleText("2010");
		System.out.println(month_dd.getOptions().size());
		driver.findElement(By.id("u_0_b")).click();*/
		
		driver.findElement(By.id("email")).sendKeys("pravalika.madishetty@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mahipravi@6");
		driver.findElement(By.id("u_0_3")).submit();
		
		
	}

}
