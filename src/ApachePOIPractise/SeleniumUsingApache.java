package ApachePOIPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumUsingApache {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.msgedge.driver", "C:\\Users\\gerik\\OneDrive\\Desktop\\seleniumtutorial\\drivers\\msedgedriver.exe");
	
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//Getting data from Excel Sheet
		
		FileInputStream file = new FileInputStream("C://Users//gerik//OneDrive//Desktop//Book1.xlsx");
	
		//Get the workbook instance
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//Get the first Sheet of the workbook
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//Get the first row of the sheet
		int noOfRows =  sheet.getLastRowNum();
		
		System.out.println(" No of records in the Excel Sheet : " + noOfRows);
		
		for ( int i = 0; i<=noOfRows ; i ++)
		{
			
		}
		
	}

}
