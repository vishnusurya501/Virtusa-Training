package Stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenLogin 
{
	ChromeDriver driver;
	
	@Given("^In the customer login page$")
	public void in_the_customer_login_page() throws Throwable
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("User on login page");
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		System.out.println("Enters username and password ");
	}

	@And("^I click on login button$")
	public void i_click_on_login_button() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		System.out.println("Click on login button");
	}

	@Then("^i should redirected to next page$")
	public void i_should_redirected_to_next_page() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		System.out.println("Successful");
	}

}
