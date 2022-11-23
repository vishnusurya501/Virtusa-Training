package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	public static WebDriver driver=null;
	@BeforeSuite
	public void launch()
	{
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	@AfterSuite
	public void close()
	{
		driver.close();
	}
}
