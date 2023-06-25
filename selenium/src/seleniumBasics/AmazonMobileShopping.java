package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobileShopping {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/jithendra.r/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Mobiles")).click();                             // click on mobile menu
//		driver.findElement(By.xpath("//a/img[@alt='Header']")).click();                 // click on the banner
//		driver.findElement(By.xpath("(//a/img[@alt='Bank offer'])[2]")).click();        // click on continue shopping
		
		driver.findElement(By.xpath("(//div[@class='DealGridItem-module__dealItemContent_1vFddcq1F8pUxM8dd9FW32'])[1]")).click(); // Selecting first product from grid
		driver.findElement(By.xpath("(//input[@name='submit.buy-now'])[2]")).click();                    // Click on buy now
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jithendra.jnv@gmail.com");      // Enter email id
		driver.findElement(By.xpath("//input[@id='continue']")).click();                                 // Click on continue button
		/* Entering Password*/                                                                                                                         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Jeet@1234");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();                             //Click on sign in button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='radio'])[5]")).click();                             //Click on Other UPI apps as payment method
		Thread.sleep(6000);
		
		driver.close();                                                                  // Closing the browser

	}

}
