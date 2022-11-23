package ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		excel r=new excel();
		r.Data("login");

	}
	public String[][] Data(String excelSheetName) throws EncryptedDocumentException, IOException
	{
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Selenium.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook w = WorkbookFactory.create(fs);
		Sheet sheetname = w.getSheet(excelSheetName);
		
		int rows = sheetname.getLastRowNum();
		System.out.println(rows);
		Row cells = sheetname.getRow(0);
		//System.out.println(cells);
		int colm = cells.getLastCellNum();
		System.out.println(colm);
		
		DataFormatter format = new DataFormatter();
		String data[][] = new String[rows][colm];
		for(int i=1; i<=rows; i++)
		{
			for(int j=0; j<colm; j++)
			{
				data[i-1][j] = format.formatCellValue(sheetname.getRow(i).getCell(j));
				System.out.println(data[i-1][j]);
			}
		}
		return data;
		
		
		
	}  
	

}
