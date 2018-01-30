package seleniumPkg;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.ie.driver", "C:\\SW\\Selenium Drivers\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		
	}

}
