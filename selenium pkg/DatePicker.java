package seleniumPkg;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("DepartDate")).click();
		String dateOfTravel="2/December/2019";
		String day,month,year;
		String date[]=dateOfTravel.split("/"); // delimeter /
		day=date[0];
		month=date[1];
		year=date[2];
		String calMonth,CalYear;
		CalYear=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/div/span[2]")).getText();
	    System.out.println(CalYear);
	    System.out.println(year);
	    while(!CalYear.equals(year))
	    {
	    	driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
	    	CalYear=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/div/span[2]")).getText();
	    	System.out.println("While loop printing year " +CalYear);
	    	
	    }
	    calMonth=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
	    System.out.println("current month visible is " +calMonth);
	    System.out.println(month);
	   while(!calMonth.equals(month))
	   {
		   driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
		   calMonth=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
		    System.out.println("while loop printing month " +calMonth);
	   }

	List<WebElement> tdList=driver.findElements(By.xpath("//table[@class='calendar']/tbody/tr/td"));

	   for(int i=0;i<tdList.size();i++)
	   {
		  WebElement e = tdList.get(i);
		  if(e.getText().equals(day))
		  {
			  System.out.println("date matched " +e.getText());
			  e.click();
			  break;
		  }
	   }
	}

	
		
	}


