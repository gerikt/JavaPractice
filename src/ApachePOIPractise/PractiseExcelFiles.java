package ApachePOIPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class PractiseExcelFiles {
	public static void main(String[] args) throws IOException {
		
	
		
		FileInputStream file = new FileInputStream("C://Users//gerik//OneDrive//Desktop//Book1.xlsx");
		
		//creates a new workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
	//	XSSFSheet sheet = workbook.getSheet("Sheet1");  //Specifies the name of the sheet
		
		//or i can use
		
		
		XSSFSheet sheet = workbook.getSheetAt(0);  // get sheet provided at index 0 
		
		int rowcount = sheet.getLastRowNum(); //returns the row count
		
		int colcount = sheet.getRow(0).getLastCellNum(); // returns column/cell count
		
		System.out.println("Row count is : " + rowcount + " , coloumn count is : " + colcount);
		
		
		for ( int i =0; i<rowcount; i++)
		{
		  XSSFRow  currentrow = 	sheet.getRow(i);  //focused on current row
		  
		  for ( int j =0 ; j<colcount ; j++)
		  {
			  String value =  currentrow.getCell(j).toString();
			  
			  System.out.print(value + "  ");
		  }
		  System.out.println();
		}
		
	}
}
