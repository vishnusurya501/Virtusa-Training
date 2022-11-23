package edu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.airbnb.co.in/");
	    //driver.findElement(org.openqa.selenium.By.id("email")).sendKeys("7598410501");
	    driver.findElement(By.id("bigsearch-query-location-input")).sendKeys("goa",Keys.ENTER);
	    
		
		
	//	driver.quit();

	}

}
