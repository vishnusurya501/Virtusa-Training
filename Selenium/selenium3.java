package edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/selenium-tutorials/click-element-using-javascriptexecutor");
		//driver.findElement(By.cssSelector("input#edit-search-block-form--2")).sendKeys("surya");
		driver.findElement(By.cssSelector("input.edit-search-block-form--2")).sendKeys("sgdh");

	}

}
