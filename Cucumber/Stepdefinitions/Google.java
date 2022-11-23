package Stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google 
{
	ChromeDriver driver;
	@Given("user is entering the website")
	public void user_is_entering_the_website()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

	@When("user is searching for some keywords")
	public void user_is_searching_for_some_keywords() 
	{
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Keyword");
	   
	}

	@And("enters the return key")
	public void enters_the_return_key() 
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.RETURN);

	}

	@Then("user is directed to next page")
	public void user_is_directed_to_next_page()
	{
		boolean status=driver.findElement(By.partialLinkText("Keyword")).isDisplayed();
		if(status)
		{
			System.out.println("Displayed");
		}

	}

}
