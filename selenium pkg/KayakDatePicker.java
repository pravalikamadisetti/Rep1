package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class KayakDatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.kayak.com/");
		//driver.get("https://www.onetravel.com/booknow/flights/airlines?airline-code=ai&fpaffiliate=MSN&fpsub=MS-air-india+utm_term=airline&msclkid=18b664892d9c11af8f8d3ee03c59307f&utm_source=bing&utm_medium=cpc&utm_campaign=Airlines%3A%2003%20Main%20T1&utm_term=air%20india&utm_content=Air%20India");
		driver.manage().window().maximize();
		String text=driver.findElement(By.xpath("((.//div[@class='_bX _bDK'])[3]/child::div)[1]")).getText();
		System.out.println();
		driver.findElement(By.xpath("((.//div[@class='_bX _bDK'])[3]/child::div)[1]")).click();
		String DepDate="6/june2018";
		String day,monthyear;
		String date[]= DepDate.split("/");
		day=date[0];
		monthyear=date[1];
		String MonthYear,CalYear;
        MonthYear=driver.findElement(By.xpath("(.//div[@class='month'])[2]/child::div[1]")).getText();
   	    //.//*[@id='Ocld-201801']/div/div[1]
        System.out.println(MonthYear);
	    System.out.println("monthyear");
        while(!MonthYear.equals(monthyear))
         {
        	driver.findElement(By.xpath(".//*[@id='Ocld-next']/svg")).click();
        	MonthYear=driver.findElement(By.xpath(".//*[@id='Ocld-201801']/div/div[1]")).getText();
        	System.out.println("displayed monthyear is :: " +MonthYear);
        	
        }
       
       driver.findElement(By.xpath("(//div[@class='day'])[6]")).click();
	}

}
