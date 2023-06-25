package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
  ChromeDriver driver;
	
	public HomePage(ChromeDriver driver) 
	{
		this.driver=driver;    //only used incase of action class
		PageFactory.initElements(this.driver, this);
	}	
	
	@FindBy(id="nav-link-accountList")
	WebElement ACCOUNT;
	
	public void account()
	{
		Actions a1= new Actions(driver);
		a1.moveToElement(ACCOUNT).perform();
	}
	
	@FindBy(className="nav-action-inner")
	WebElement SIGNIN;
	
	public void helloSignIn() {
		SIGNIN.click();
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement SEARCHBOX;
	
	public void search() 
	{
		SEARCHBOX.click();
		SEARCHBOX.sendKeys("mobile");
	}
	
	@FindBy(linkText="mobile")
	
	WebElement MOBILE;
	
	public void mobile() 
	{
		SEARCHBOX.click();
	}	
	
	@FindBy(xpath="//div[@id='nav-xshop']/a[text()='Mobiles']")
	WebElement MOBILESEC;
	
	public void mobilesec() 
	{
		MOBILESEC.click();
	}
	
}