package Stepdefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Datawithoutheader 
{
	ChromeDriver driver;
	@Given("user is on the login page")
	public void user_is_on_the_login_page()
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("user enters the credentials")
	public void user_enters_the_credentials(io.cucumber.datatable.DataTable dataTable) 
	{
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		List<String> ls = dataTable.asList();
		String a = ls.get(0);
		String b = ls.get(1);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(a);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(b);
		
	}

	@And("clicks the login button")
	public void clicks_the_login_button() 
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
      
	    
	}

	@Then("the user should see the home page")
	public void the_user_should_see_the_home_page() 
	{
		System.out.println("Success displayed");
	}


}
