package SanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
		
		
		/*driver.get("https://www.google.com/");           //get() method
//		String title=driver.getTitle();                    //getTitle() method
//		System.out.println(title);
//		String pageSource=driver.getPageSource();          //getPageSource() method
//		System.out.println(pageSource);
		String URL1=driver.getCurrentUrl();                //getCurrentUrl() method
		System.out.println(URL1);
		driver.navigate().to("https://www.yahoo.com/");     //navigate().to() method
	    String URL2=driver.getCurrentUrl();
		System.out.println(URL2);
		driver.close();*/
		
		/*driver.get("https://www.google.com/");
        String URL=driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().to("https://www.yahoo.com/");
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().back();                         //navigate().back() method
		URL=driver.getCurrentUrl();
		System.out.println(URL);*/
		
		
		/*driver.get("https://www.google.com/");
        String URL=driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().to("https://www.yahoo.com/");
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().back();                         //navigate().forward() method
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().forward();
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		*/
		/*driver.get("https://www.google.com/");
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().refresh();                      //navigate().refresh() method
		URL=driver.getCurrentUrl();
		System.out.println(URL);*/
		
		//close() method
		  /*driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		  driver.findElement(By.id("identifierId")).sendKeys("pravalika.magham");
		  driver.close();  //It closes all the opened browsers which are launched by webdriver
*/		  
		  
		
		/*//quit()
		  driver.get("https://search.yahoo.com/search?fr=mcafee&type=C115US91118D20160403&p=bjs+fitchburg");
		  driver.findElement(By.className("ac-algo fz-l ac-21th lh-24")).click();
		  driver.quit(); //closes all the browsers launched by webdriver
*/		
		
		  
		  //findElement()
		  /*driver.get("https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=AddSession");
		  driver.findElement(By.id("identifierId")).sendKeys("pravalika.magham");
		  */
		  
		  
		  //sendKeys
		 /* driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		  driver.findElement(By.id("identifierId")).sendKeys("pravalika.magham");
		  driver.close();  //It closes all the opened browsers which are launched by webdriver
*/		
		  
		
		//clear()
		
		  /*driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		  driver.findElement(By.id("identifierId")).sendKeys("pravalika.magham");
		  Thread.sleep(5000);
		  driver.findElement(By.id("identifierId")).clear();
*/
		
		
		   //isEnabled():
		
		  /* driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		   driver.findElement(By.id("identifierId")).sendKeys("pravalika.magham");
		   boolean a=driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).isEnabled();
		   System.out.println(a);
	}   */
	
	     //isDisplayed():
	/*
	    driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	    driver.findElement(By.id("identifierId")).sendKeys("pravalika.magham");
	    boolean a=driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).isDisplayed();
	   System.out.println(a);*/
		
		
		//isSelected():
			
			/*driver.get("https://www.amazon.com/s/?ie=UTF8&keywords=website&tag=geminimobiles-20&index=stripbooks&hvadid=32310441195&hvqmt=p&hvbmt=b&hvdev=c&ref=pd_sl_4ha3c5qa3_b");
		    boolean a=driver.findElement(By.xpath(".//*[@id='leftNavContainer']/ul[2]/div/li/span/span/div/label/input")).isSelected();
		    System.out.println(a);
		    driver.findElement(By.xpath(".//*[@id='leftNavContainer']/ul[2]/div/li/span/span/div/label/input")).click();
		    a=driver.findElement(By.xpath(".//*[@id='leftNavContainer']/ul[2]/div/li/span/span/div/label/input")).isSelected();
		    System.out.println(a);*/
		
		//manage().window().maximize():
			
/*
	        driver.get("https://www.amazon.com/s/?ie=UTF8&keywords=website&tag=geminimobiles-20&index=stripbooks&hvadid=32310441195&hvqmt=p&hvbmt=b&hvdev=c&ref=pd_sl_4ha3c5qa3_b");
			Thread.sleep(5000);
		    driver.manage().window().maximize();
            */
		
	}
}
