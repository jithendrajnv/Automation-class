package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartShoes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/jithendra.r/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();         //to maximise to full screen
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8106245845");
		                                   														driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ragini@123");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("shoe");
		
		
		                                   									
	}

}
