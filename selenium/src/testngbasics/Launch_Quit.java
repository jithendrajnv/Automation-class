package testngbasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit {
	static ChromeDriver driver;
	

	@BeforeMethod
	static void browserLaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/jithendra.r/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();                     //to maximise to full screen
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
	}
	
	@AfterMethod
	void browserClose() {
		driver.quit();
	}
	

}
