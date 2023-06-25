package assignment_62;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealMensFashion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/jithendra.r/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();         //to maximise to full screen
		System.out.println(driver.getTitle());
		WebElement men=driver.findElement(By.xpath("//span[@class='catText' and contains(text(),'Men')]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(men).perform();
		driver.findElement(By.xpath("(//span[@class='linkTest' and text()='T-Shirts & Polos'])[2]")).click();
		Thread.sleep(2000);
		driver.quit();
		}

}
