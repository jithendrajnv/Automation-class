package source1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home 
{
	ChromeDriver driver;
	
	public Home(ChromeDriver driver)
	{				
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	//Account & List 
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement SIGNIN;
	
	public void signIn()
	{
		Actions a=new Actions(driver);
		a.moveToElement(SIGNIN).perform();
	}
	
	//Sign in button under Account and List
	@FindBy(linkText="Sign in")
	WebElement SIGNINBUTTON;
	
	public void signInButton() 
	{
		SIGNINBUTTON.click();
	}
	
	//Search bar in home page
	@FindBy(xpath="//div[@class='nav-search-field ']/input[@id='twotabsearchtextbox']")
	WebElement SEARCH;
	
	public void searchBar()
	{
		SEARCH.click();
	}
	public void shoes()
	{
		SEARCH.sendKeys("shoes");
	}
	
	//Shoes for men from auto suggestion
	@FindBy (xpath="//div[@class='autocomplete-results-container']")
	WebElement SHOESFORMEN;
	
	public void shoesForMen()
	{
		SHOESFORMEN.click();
	}
	
	


}
