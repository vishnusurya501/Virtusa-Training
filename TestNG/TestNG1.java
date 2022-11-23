package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class TestNG1 {
  @Test(priority = 1)
  public void testmethod1() 
  {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String url="https://www.amazon.com/";
		driver.get(url);
		String title = "Smile more";
		String ogtitle = driver.getTitle();
		Assert.assertTrue(ogtitle.contains(title));
  }
  @Test(priority = 2, dataProvider = "data-provider")
  
	  public void testmethod2(String data)
	  {
		  System.out.println("Data = "+data);
	  }
  @DataProvider(name = "data-provider")
  public Object[][] dataprovidermethod()
  {
	  return new Object[][] {{"one"},{"two"},{"three"}};
  }
  
  @BeforeMethod
  public void beforemethod() 
  {
	  System.out.println("Starting test on browser");
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("Finishing test on browser");
  }
  
  @BeforeClass
  public void beforeclass()
  {
	  System.out.println("Excute before the class");
  }
  @AfterClass
  public void afterclass()
  {
	  System.out.println("Excute after the class");
  }
  
  @BeforeTest
  public void beforetest()
  {
	  System.out.println("Excute before the test");
  } 
  @AfterTest
  public void aftertest()
  {
	  System.out.println("Excute after the test");
  }
  
  @BeforeSuite
  public void beforesuite()
  {
	  System.out.println("Excute before the suite");
  }
  @AfterSuite
  public void aftersuite()
  {
	  System.out.println("Excute after the suite");
  }
}
