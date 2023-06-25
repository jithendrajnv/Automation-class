package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MktrelativePath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/jithendra.r/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/jithendra.r/Downloads/grotechminds.html");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='1']")).sendKeys("Jithendra12");
		driver.findElement(By.xpath("//input[@id='2']")).sendKeys("Your name with date");
		
		driver.findElement(By.xpath("//input[@id='3']")).sendKeys("Jithendra@123");
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Jithendra");
//		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Kumar R");    //Your Last name not accepting input
		
		driver.findElement(By.xpath("//input[@name='name1']")).click();
		driver.findElement(By.xpath("//input[@name='name2']")).click();
		driver.findElement(By.xpath("//input[@name='name3']")).click();
		
		driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
		driver.findElement(By.xpath("//input[@type='radio'][2]")).click();
		
//		driver.findElement(By.xpath("//input[@type='checkbox'][4]")).click();     //Are you ready to relocate to bangalore?
		//driver.findElement(By.xpath("//a")).click();
	
		//Thread.sleep(2000);
		//driver.close();
	}

}
