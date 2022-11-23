package edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("7598410501");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Surya@2001");
		//driver.findElement(By.xpath("//button[@type='submit' and @name='login']")).click();
		//driver.findElement(By.xpath("//a[starts-with(text(),'Create')]")).click();

	}

}
