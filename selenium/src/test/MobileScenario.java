package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import source.HomePage;
import source.Login;


public class MobileScenario extends LaunchQuit
{	
	ChromeDriver driver;


	
	@Test
	void mobileShopping() throws InterruptedException 
	{
		HomePage h1=new HomePage(driver);
		Login l1=new Login(driver);


//		h1.account();
//		h1.helloSignIn();
//		l1.email();
//		l1.continue1();
//		l1.password();
//		l1.submit();
//		
//		h1.search();
//		h1.mobile();

		h1.mobilesec();

	}
	
	

}
