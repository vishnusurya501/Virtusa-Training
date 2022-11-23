package ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class excelwebsite {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2F&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		
		//File f = new File(System.getProperty("D:\\eclipse-java-2022-09-R-win32-x86_64\\eclipse workspace\\SeleniumTraining\\src\\test\\resources\\Selenium.xlsx");
		FileInputStream fs = new FileInputStream("D:\\eclipse-java-2022-09-R-win32-x86_64\\eclipse workspace\\SeleniumTraining\\src\\test\\resources\\Sele.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(fs);
		XSSFSheet sheet = w.getSheet("SIGNUP");
		
		
		int row=sheet.getLastRowNum();
		WebElement firstname=driver.findElement(By.id("firstName"));
		WebElement lastname=driver.findElement(By.id("lastName"));
		WebElement uname=driver.findElement(By.id("username"));
		WebElement pwd=driver.findElement(By.name("Passwd"));
		WebElement cpwd=driver.findElement(By.name("ConfirmPasswd"));
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span"));
		
	
		
		
		for(int i=1; i<=row; i++)
		{
			XSSFRow data=sheet.getRow(i);
			firstname.sendKeys(data.getCell(0).getStringCellValue());
			lastname.sendKeys(data.getCell(1).getStringCellValue());
			uname.sendKeys(data.getCell(2).getStringCellValue());
			pwd.sendKeys(data.getCell(3).getStringCellValue());
			cpwd.sendKeys(data.getCell(4).getStringCellValue());
			submit.click();
			
			if(driver.getPageSource().contains("<iframe src=\"/_/bscframe\" style=\"display: none;\"></iframe>"))
			{
				System.out.println("paas");
			}
			else
			{
				System.out.println("fail");
			}
			
			firstname.clear();
			lastname.clear();
			uname.clear();
			pwd.clear();
			cpwd.clear();
			
		}
		
		

	}

}
