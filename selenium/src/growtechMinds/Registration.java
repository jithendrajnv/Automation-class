package growtechMinds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Registration {

	@Test
	public void register() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/jithendra.r/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");                        //Launch Google 
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());                        //Get title of the page
		driver.findElement(By.id("1")).sendKeys("Jithendra12");
		driver.findElement(By.id("2")).sendKeys("myname");
		driver.findElement(By.id("3")).sendKeys("Jithendra@1234567890");
		driver.findElement(By.id("4")).sendKeys("Jithendra");
		driver.findElement(By.id("5")).sendKeys("Kumar R");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click(); 
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("/Users/jithendra.r/Downloads/SampleResume.pdf");
		
	}
}
