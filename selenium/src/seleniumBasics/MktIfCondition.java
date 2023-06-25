package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MktIfCondition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/jithendra.r/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/jithendra.r/Downloads/grotechminds.html");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='name1']")).click();
		WebElement w= driver.findElement(By.xpath("//input[@name='name2']"));
		
		boolean a=w.isSelected();
		System.out.println(a);
		
		Thread.sleep(2000);

		if (a=true)   //check box is unchecked and isSelected value is false hence condition matches
		{
			System.out.println();
			w.click();
			System.out.println("checkbox clicked");
		}
		else {
			System.out.println("Do not do anything");
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
