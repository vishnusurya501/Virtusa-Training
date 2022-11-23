package Stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class examples 
{
	ChromeDriver driver;
	@Given("user is on the  login page of hrm")
	public void user_is_on_the_login_page_of_hrm() 
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enters the credentials values {string} and {string}.")
	public void user_enters_the_credentials_values_and(String string, String string2)
	{
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(string);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(string2);

	}

	@And("clicks  login button in hrm")
	public void clicks_login_button_in_hrm() 
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();	
	}

	@Then("the user should directed home page of hrm")
	public void the_user_should_directed_home_page_of_hrm() {
		System.out.println("Success1");	
	}


}
