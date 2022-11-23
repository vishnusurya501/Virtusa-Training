package Stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datawithheader
{
	ChromeDriver driver;
	@Given("user is on  login page")
	public void user_is_on_login_page() 
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enters the credentials values")
	public void user_enters_the_credentials_values(io.cucumber.datatable.DataTable dataTable)
	{
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		List<Map<String, String>> ls = dataTable.asMaps(String.class, String.class);
		String a = ls.get(0).get("username");
		String b = ls.get(0).get("password");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(a);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(b);
	}

	@And("clicks  login button")
	public void clicks_login_button()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();	    
	}
	
	@Then("the user should directed home page")
	public void the_user_should_directed_home_page() 
	{
		System.out.println("Success");	 
	}

}
