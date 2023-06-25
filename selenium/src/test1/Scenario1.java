package test1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import source1.Home;
import source1.SignIn;

public class Scenario1 extends LnQ
{


	Home h1;   //working fine
	SignIn s1;
	
	@Test
	public void shoeShopping() throws InterruptedException
	{
		h1=new Home(driver);
		s1=new SignIn(driver);

		h1.signIn();
		h1.signInButton();
		
		s1.enterEmail();
		s1.continue1();
		s1.password();
		s1.signIn();
		h1.searchBar();
		h1.shoes();
		h1.shoesForMen();
		
		
	}

}
