package seleniumPkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='queryTop']/div/input[6]")).click();
		Alert alrt=driver.switchTo().alert();
		String alertText=alrt.getText();
		System.out.println("get the text her:: " +alertText);
		alrt.accept();
		
		
//		driver.get("http://ksrtc.in/oprs-web/");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("searchBtn")).click();
//		Alert alrt=driver.switchTo().alert();
//		String text=alrt.getText();
//		System.out.println("the text here is :: " +text);
//		alrt.accept();
		

	}

}
