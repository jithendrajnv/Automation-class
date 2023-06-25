package source1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn 
{
	public SignIn(ChromeDriver driver)
	{

        PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ap_email")
	WebElement EMAIL;	
	public void enterEmail()
	{
		EMAIL.sendKeys("jithendra.jnv@gmail.com");
	}
	
	@FindBy(id="continue")
	WebElement CONTINUE;
	public void continue1()
	{
		CONTINUE.click();
	}
	
	@FindBy(id="ap_password")
	WebElement PASSWORD;
	public void password()
	{
		PASSWORD.sendKeys("Jithu@1234");
	}
	
	@FindBy(id="signInSubmit")
	WebElement SIGNIN;
	public void signIn()
	{
		SIGNIN.click();
	}
}
