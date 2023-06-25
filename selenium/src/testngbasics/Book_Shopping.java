package testngbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Book_Shopping extends Launch_Quit
{
	
	@Test
	void book() throws InterruptedException {
		
		WebElement w1=driver.findElement(By.id("searchDropdownBox"));        //drop down path
		w1.click();
		Select s=new Select(w1);
		s.selectByVisibleText("Books");                    //Selecting Books from the drop down
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Software testing"); //Enter text in search bar
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='nav-right'])[1]")).click(); //click on search button
		
	}
	
	

}
