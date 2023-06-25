package testngbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Shoe_shopping extends Launch_Quit
{
	
	@Test
	
	void shoe() throws InterruptedException {

	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoe"); //Enter shoe in search bar
	Thread.sleep(2000);
	List<WebElement> auto=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));    //
	System.out.println(auto.size());
	auto.get(auto.size()-1).click();
	driver.findElement(By.xpath("//div[@class='_bGlmZ_itemImage_2uzWz'][1]")).click();     //clicking on the first product
	Thread.sleep(2000);
	WebElement a1=driver.findElement(By.xpath("//select[@name='dropdown_selected_size_name']"));    //dropdown path
	a1.click();																					//clicking on the dropdown to select shoe size
	Select s1=new Select(a1);
	s1.selectByIndex(1);                           //selecting size present on index 1
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();       //click on add to cart
	}
}
