package testngbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mobile_Shopping  extends Launch_Quit
{
	@Test
	void mobile() throws InterruptedException {

	driver.findElement(By.linkText("Mobiles")).click();                             // click on mobile menu
	driver.findElement(By.xpath("//div[@class='a-section a-spacing-medium _octopus-search-result-card_style_apbSearchResultsContainer__bCqjb']/div[1]")).click();               
	}

}
