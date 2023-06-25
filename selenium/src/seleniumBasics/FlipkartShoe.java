package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartShoe {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/jithendra.r/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();         //to maximise to full screen
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9611008544");
		                                                                                             driver.findElement(By.xpath("//input[@type='password']")).sendKeys("qdb2ZGC3");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shoe"); //Enter shoe in search bar
		Thread.sleep(2000);
		List<WebElement> auto=driver.findElements(By.xpath("//div[@class='_1cmsER']//ul/li"));
		Thread.sleep(2000);
		System.out.println(auto.size());
		
		auto.get(auto.size()-3).click();

		Thread.sleep(2000);
		driver.close();

		

		
		
		//(//form[@class='_2M8cLY header-form-search']/ul/li)[7]

	}

}
