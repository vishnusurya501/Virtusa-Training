package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class priority {
	WebDriver driver ;

	@Test(priority = 1)
	public void cetup() 
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		String url = "https://www.amazon.com/";
		//String url = "https://www.amazon.com/";
		driver.get(url);
	}

	@Test(priority = 2)
	public void heckTitle() {
		String title = "Amazon.com. Spend less. Smile more.";
		String ogtitle = driver.getTitle();
		Assert.assertEquals(ogtitle, title);
	}

}
