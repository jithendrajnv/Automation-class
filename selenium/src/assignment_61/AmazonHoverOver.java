package assignment_61;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/jithendra.r/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();         //to maximise to full screen
		System.out.println(driver.getTitle());
		
		//Hoverover on Account & Lists on home page using action class
		WebElement w1=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(w1).perform();
		
		//Sign in using login credentials
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("ap_email")).sendKeys("jithendra.jnv@gmail.com");
		driver.findElement(By.id("continue")).click();
 																												driver.findElement(By.id("ap_password")).sendKeys("Jeet@1234");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		driver.quit();
		
		}

}
