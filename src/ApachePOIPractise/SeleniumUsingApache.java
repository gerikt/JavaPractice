package ApachePOIPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.collect.Table.Cell;

public class SeleniumUsingApache {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.msgedge.driver", "C:\\Users\\gerik\\OneDrive\\Desktop\\seleniumtutorial\\drivers\\msedgedriver.exe");
	
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//Getting data from Excel Sheet
		
		FileInputStream file = new FileInputStream("C:/Users/gerik/OneDrive/Desktop/FacebookInputs.xlsx");
	
		//Get the workbook instance
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//Get the first Sheet of the workbook
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//Get the first row of the sheet
		int noOfRows =  sheet.getLastRowNum();
		
		System.out.println(" No of records in the Excel Sheet : " + noOfRows);
		

		//Data Formatter from stackOverflow to change a numeric cell to String Format
		DataFormatter formatter = new DataFormatter();
		XSSFCell cell = sheet .getRow(1).getCell(2);
		String Phone =formatter.formatCellValue(cell);
		
		for ( int i = 1; i<=noOfRows ; i ++)
		{
			XSSFRow currentRow = sheet.getRow(i);
			
			String FirstName = currentRow.getCell(0).getStringCellValue();
			String LastName = currentRow.getCell(1).getStringCellValue();
			
			//I cant use this one here because the cell is numeric and the compiler won't let me put it in a string
			//String Phone = currentRow.getCell(2).getStringCellValue();
			
			String Password = currentRow.getCell(3).getStringCellValue();
			
			//Registration process
			driver.findElement(By.partialLinkText("Create new account")).click();
			
			//Entering contact information
			
			driver.findElement(By.name("firstname")).sendKeys("llll");
			driver.findElement(By.cssSelector("#u_12_a_di > i._5dbc.img.sp_98fCI7IVTTz.sx_54513f")).sendKeys(LastName);
			driver.findElement(By.cssSelector("#u_12_g_FJ")).sendKeys(Phone);
			driver.findElement(By.cssSelector("#password_step_input")).sendKeys(Password);

			
		
		}
		
	
	}

}
