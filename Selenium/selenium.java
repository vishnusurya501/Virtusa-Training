package edu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openga.selenium.By;

public class selenium {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    //driver.findElement(org.openqa.selenium.By.id("email")).sendKeys("7598410501");
	    driver.findElement(org.openqa.selenium.By.className("inputtext _55r1 _6luy")).sendKeys("7598410501");
		driver.findElement(org.openqa.selenium.By.id("pass")).sendKeys("Surya@2001");
		driver.findElement(org.openqa.selenium.By.name("login")).click();
		
		
	//	driver.quit();

	}

}
