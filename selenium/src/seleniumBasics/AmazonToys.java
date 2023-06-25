package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonToys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/jithendra.r/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();                                             //to maximise to full screen
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		WebElement w1=driver.findElement(By.id("searchDropdownBox"));                    //drop down path
		w1.click();
		Select s=new Select(w1);
		s.selectByVisibleText("Toys & Games");                                           //Selecting Books from the drop down
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ironman");       //Enter text in search bar
		driver.findElement(By.xpath("(//div[@class='nav-right'])[1]")).click();          //click on search button
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 AdHolder sg-col s-widget-spacing-small sg-col-4-of-20'])[1]")).click(); // Selecting first product from grid
		Thread.sleep(6000);
		/* Product opening in another tab */
		System.out.println(driver.getWindowHandles());
		driver.quit();
	}

}
