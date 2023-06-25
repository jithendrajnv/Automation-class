package seleniumBasics;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Growtechminds {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/jithendra.r/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");                        //Launch Google 
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());                        //Get title of the page
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("growtech minds"); 	          //Enter Growtechminds
		Thread.sleep(2000);
		List<WebElement> auto =driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));                 //assigning the list path to auto
		int count=auto.size();                                                     //Gives the size of the auto suggestion
		System.out.println(count);
		Thread.sleep(2000);
		auto.get(count-3).click();	
		driver.findElement(By.xpath("(//div[@class='yuRUbf']/a/h3)[1]")).click();           //click on 1st search result
		driver.findElement(By.linkText("Automate me")).click();                             //Click on automate me
		System.out.println(driver.getTitle());                                              //Get title of the page		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Registration']")).click();
		Thread.sleep(2000);

		driver.close();
	}		

}
