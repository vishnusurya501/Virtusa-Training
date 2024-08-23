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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng {

    WebDriver driver;
    WebDriverWait wait;
	@BeforeTest
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
		Reporter.log("Login Test");
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Email\"]")));
		WebElement pwd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Password\"]")));
		WebElement login=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[1]/div/form/button")));
		username.sendKeys("vishnusurya@aidealabs.com");
		pwd.sendKeys("K123456");
		login.click();
		WebElement dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/nav/div/div[2]/ul/li[1]/a/div/span")));
        Assert.assertTrue(dashboard.isDisplayed(), "Login was not successful");
       
        
	}
	@Test(priority=2)
	public void invalidlogin()
	{
		Reporter.log("Invalid Login Test");
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Email\"]")));
		WebElement pwd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Password\"]")));
		WebElement login=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[1]/div/form/button")));
		username.sendKeys("vishnusurya@aidealabs.com");
		pwd.sendKeys("a");
		login.click();
		WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("swal2-title")));
        Assert.assertTrue(error.isDisplayed(), "Login was not successful");
       
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
