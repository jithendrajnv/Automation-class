package test1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LnQ 
{
	ChromeDriver driver;
	
	@BeforeMethod
	public void Launch() 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/jithendra.r/Desktop/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	

}
