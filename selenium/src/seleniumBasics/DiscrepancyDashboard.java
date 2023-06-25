package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DiscrepancyDashboard {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/jithendra.r/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rfpllms-dev.rupeek.co/login");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("boadmin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234567");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);		
		WebElement loans= driver.findElement(By.xpath("//*[@class='loanhistory']"));
	
		Actions a1= new Actions(driver);
		a1.moveToElement(loans).click().build().perform();

	}

}
