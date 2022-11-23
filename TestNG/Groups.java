package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Groups
{
	WebDriver driver;
	@Test(priority = 1,groups = {"extend","bvt"})
	public void setup()
	{
		System.out.println("SetUp");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Launching");
		String url = "https://www.amazon.com/";		
		driver.get(url);
	}
	@Test(priority = 2, groups = {"extend"})
	public void testTitle()
	{
		System.out.println("Title");
		String title = "Amazon.com. Spend less. Smile more.";
		String ogtitle = driver.getTitle();
		Assert.assertEquals(ogtitle, title);
	}
	@Test(priority = 3, groups = {"bvt"})
	public void testdropdown()
	{
		System.out.println("dropdown operation");
		Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
		dropdown.selectByIndex(5);
	}
	
	@Test(priority = 4)
	public void end()
	{
		System.out.println("Test has been ended");
	}
	

}
