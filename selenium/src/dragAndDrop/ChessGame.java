package dragAndDrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChessGame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/jithendra.r/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//we can write for text .= ( or text() )
		driver.switchTo().frame(driver.findElement(By.id("h5p-iframe-1")));
	WebElement drag	=driver.findElement(By.xpath("//span[.='Grabbable 17 of 32.']"));//find location of drag element//source 
	WebElement drop =driver.findElement(By.xpath("//span[.='Dropzone 17 of 32.']"));//find location of drop element//target
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		driver.findElement(By.xpath("//button[@title='Check']")).click();
		
		
		
		driver.switchTo().defaultContent();
		System.out.println("1");
	}

}
