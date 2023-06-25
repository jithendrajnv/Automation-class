package testngbasics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrderOfExecution {
	
	@BeforeSuite
	void bs(){
		System.out.println("before suite");
	}
	
	@BeforeMethod
	void bm(){
		System.out.println("before method");
	}
	
	@Test (enabled=true)
	void test1() {
		System.out.println("Test1");
	}
	
	@Test
	void test2() {
		System.out.println("Test2");
	}
	
	@AfterTest
	void at() {
		System.out.println("after test");
		
		
	}


}
