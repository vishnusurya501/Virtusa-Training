package edu;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/"); 
		WebElement e=driver.findElement(By.tagName("a"));
	    //driver.findElement(By.tagName("a"));
		System.out.println("link text"+e.getText());
		List<WebElement> elements=driver.findElements(By.tagName("a"));
		System.out.println("Elements :"+elements.size());
		for(int i=0; i<elements.size(); i++)
		{
			System.out.println(elements.get(i).getText());
		}

	}

}
