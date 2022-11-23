package ui;

import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class test12 {
    
public static void main(String[] args) throws ParseException {
	WebDriverManager.chromedriver().setup();
	WebDriver wd=new ChromeDriver();
	 // System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
	//  wd= new ChromeDriver();
        wd.get("http://demo.guru99.com/test/web-table-element.php");         
        //No.of Columns
        List <WebElement> col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size()); 
        //No.of rows 
        List <WebElement> rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[3]/td")); 
        
        
        
        System.out.println("No of rows are : " + rows.size());
        wd.close();
    }
}