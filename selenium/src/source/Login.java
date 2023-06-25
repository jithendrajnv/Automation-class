package source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	 static ChromeDriver driver;
	
	public Login(ChromeDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="ap_email")
	WebElement UNSERNAME;
	
	
	@FindBy(id="continue")
	WebElement CONTINUE;
	
	@FindBy(id="ap_password")
	WebElement PASSWORD;
	
	@FindBy(id="signInSubmit")
	WebElement SIGNIN;

public void email() {
	UNSERNAME.sendKeys("jithendra.jnv@gmail.com");
}

public void continue1() {
	CONTINUE.click();
}

public void password() {
	PASSWORD.sendKeys("Jeet@1234");
}

public void submit() {
	SIGNIN.click();
}


}