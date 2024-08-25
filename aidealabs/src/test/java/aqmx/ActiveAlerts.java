package aqmx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveAlerts 
{

	WebDriver driver;
	WebDriverWait wait;

	@BeforeTest
	public void open() 
	{
		WebDriverManager.edgedriver().setup();
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://aqms.aisrv.in/#/login");
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Email\"]")));
		WebElement pwd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Password\"]")));
		WebElement login=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[1]/div/form/button")));
		username.clear();
        pwd.clear();
		username.sendKeys("vishnusurya@aidealabs.com");
		pwd.sendKeys("123456");
		login.click();
		WebElement dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/nav/div/div[2]/ul/li[1]/a/div/span")));
        Assert.assertTrue(dashboard.isDisplayed(), "Login was not successful");

	}
	@Test(priority=1)
	public void ActiveAlertsSensorPage()
	{
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/div[1]/div/div/table/tbody/tr[4]/td[1]/div"))).click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/div[1]/div/div/table/tbody/tr/td[1]/div"))).click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/div[1]/div/div/table/tbody/tr/td[1]/div"))).click();	
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/div[1]/div/div/table/tbody/tr/td[1]/div"))).click();	
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/div[1]/div/div/table/tbody/tr/td[1]/div"))).click(); 
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/div[1]/div/div/table/tbody/tr[5]/td[1]/div"))).click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div/div/div[1]/div[4]/div[2]"))).click();
	 WebElement popUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"headlessui-dialog-panel-:r3:\"]/div[1]")));
	 Assert.assertTrue(popUp.isDisplayed(), "The pop-up window is not displayed.");
	}
	
	@Test(priority=2)
	public void Trends()
	{
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/nav/div/div[2]/ul/li[4]/a"))).click();
	 
	 //Dropdown yet to be done
	}
	

}
