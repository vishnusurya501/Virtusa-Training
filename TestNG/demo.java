package ui;

import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver","D:\\Selinium\\Chrome\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7598410501");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Surya@2001");
		driver.findElement(By.xpath("//button[@type='submit' and @name='login']")).click();
		
		//Thread.sleep(5000);
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[starts-with(text(),'Create')]")).click();
		driver.close();

	}

}
 