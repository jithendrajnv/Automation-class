package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MktAbsolutePath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/jithendra.r/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/jithendra.r/Downloads/grotechminds.html");
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("JithendraKumar");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Your name");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Pass@123");
		driver.findElement(By.xpath("/html/body/form[1]/input[1]")).sendKeys("Jithendra");
		driver.findElement(By.xpath("/html/body/form[1]/input[2]")).sendKeys("Kumar"); //not taking input
		
		driver.findElement(By.xpath("/html/body/form[2]/input[1]")).click();
		driver.findElement(By.xpath("/html/body/form[2]/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form[2]/input[3]")).click();
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		driver.findElement(By.xpath("/html/body/input[5]")).click();
		driver.findElement(By.xpath("/html/body/input[6]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/a")).click();
		
		Thread.sleep(5000);
		driver.close();
		
		Actions a1= new Actions(driver);



		


		
		
		
		
		

		

		


		
	}

}
