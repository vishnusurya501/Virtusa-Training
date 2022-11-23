package edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		//driver.findElement(By.tagName("select")).click();
		driver.findElement(By.linkText("Policies")).click();
	    
		
		
	//	driver.quit();
		

	}

}
