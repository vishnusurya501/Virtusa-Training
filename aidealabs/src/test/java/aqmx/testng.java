package aqmx;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng {

    WebDriver driver;
    WebDriverWait wait;
    ExtentHtmlReporter report;
    ExtentReports extent;
    ExtentTest test;
    @BeforeTest
    public void setup()
    {
        report=new ExtentHtmlReporter("extent.html");
    	extent=new ExtentReports();
    	extent.attachReporter(report);
        test=extent.createTest("Login Page","All login test");
        test.log(Status.INFO, "Starting test case");
    	
    }
	@BeforeMethod
	public void open()
	{
		WebDriverManager.edgedriver().setup();
		driver=new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://kewaunee.aisrv.in/#/login");
		
		
	}
	@Test(priority=1)
	public void validlogin()
	{
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Email\"]")));
		WebElement pwd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Password\"]")));
		WebElement login=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[1]/div/form/button")));
		username.clear();
        pwd.clear();
		username.sendKeys("vishnusurya@aidealabs.com");
		pwd.sendKeys("K123456");
		login.click();
		WebElement dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/nav/div/div[2]/ul/li[1]/a/div/span")));
        Assert.assertTrue(dashboard.isDisplayed(), "Login was not successful");
       test.pass("valid login test");
        
	}
	@Test(priority=2)
	public void invalidpwd()
	{
		Reporter.log("Invalid Login Test");
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Email\"]")));
		WebElement pwd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Password\"]")));
		WebElement login=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[1]/div/form/button")));
		username.clear();
        pwd.clear();
		username.sendKeys("vishnusurya@aidealabs.com");
		pwd.sendKeys("a");
		login.click();
		WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("swal2-title")));
		String s=error.getText();
		System.out.println(s);
        Assert.assertTrue(error.isDisplayed(), "Login was not successful");
        test.pass("invalid password login test");
       
	}
	@Test(priority=3)
	public void invalidusername() throws Exception
	{
		try
		{
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Email\"]")));
		WebElement pwd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Password\"]")));
		WebElement login=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[1]/div/form/button")));
		username.clear();
        pwd.clear();
		username.sendKeys("vishnusurya");
		pwd.sendKeys("K123456");
		login.click();
		WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("swal2-title")));
		String experror="Email or password is incorrect";
        Assert.assertEquals(error.getText(),experror,"The error message text is not valid.");
        test.fail("invalid username test");
		}
		catch (AssertionError e) 
		{
	        // If the test fails, log the failure with details
	        test.fail("Invalid username test failed." );
	        throw e; // Re-throw the exception to let TestNG handle it as a failure
		}
		/*catch (Exception e) 
		{
	        // If there is any other exception, log it as a failure
	        test.fail("Invalid username test encountered an unexpected error: " );
	        throw e; // Re-throw the exception to let TestNG handle it
	    }*/
       
	}
	@Test(priority=4)
	public void emptyfields()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Email\"]")));
		WebElement pwd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Password\"]")));
		WebElement login=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[1]/div/form/button")));
		username.clear();
        pwd.clear();
		login.click();
		WebElement usernameerror = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[1]/div/form/div[1]/div[2]")));
		WebElement pwdeerror = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[1]/div/form/div[2]/div[2]")));
		String usertext="Please enter email";
		String pwdtext="Please enter password";
		Assert.assertEquals(usernameerror.getText(),usertext, "The error message text is not valid .");
		Assert.assertEquals(pwdeerror.getText(),pwdtext, "The error message text is not valid .");
        //Assert.assertTrue(error.isDisplayed(), "Login was not successful");
		test.pass("Login when the username and password fields are empty");
       
	}

	@AfterMethod
	public void close()
	{
		driver.close();
	}
	@AfterTest
	public void reportclose()
	{
		test.info("Test completed");
		extent.flush();
	}

}
