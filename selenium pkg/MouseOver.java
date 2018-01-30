package seleniumPkg;




import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		/*driver.get("https://www.macys.com/");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='WOMEN']")));
		act.moveToElement(driver.findElement(By.xpath("(//a[text()='Basics'])[1]")));*/
		
		driver.get("https://www.modcloth.com/");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("/shop/dresses")));
		action.moveToElement(driver.findElement(By.linkText("/shop/special-occasion-dresses")));
		action.click();
		action.perform();
		
		
	}

}
