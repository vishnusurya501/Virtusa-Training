package TestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	@Test(priority=1,groups="extends")
	public void Test1()
	{
		System.out.println("test 1");
	}
	
	@Test(priority=3,groups="extends")
	public void Test2()
	{
		System.out.println("test 2");
		Assert.assertTrue(false);
	}
	
	@Test(priority=2,groups="extends")
	public void Test3()
	{
		System.out.println("test 3");
	}
	

}
