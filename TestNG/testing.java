package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testing {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("19eca61@karpagamtech.ac.in");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Basil");
		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Mathews");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("1050148957");
		driver.findElement(By.xpath("//*[@id=\"days\"]")).sendKeys("3");
		driver.findElement(By.xpath("//*[@id=\"months\"]")).sendKeys("December");
		driver.findElement(By.xpath("//*[@id=\"years\"]")).sendKeys("2001");
		/*driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Basil");
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Mathews");*/
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("City College of San Francisco");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("San Francisco");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("california");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("san francisco");
		driver.findElement(By.xpath("//*[@id=\"id_state\"]")).sendKeys("California");
		driver.findElement(By.xpath("//*[@id=\"authentication\"]")).sendKeys("63720");
		driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("7598410201");
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
		

		
	}
}
