package DropdownTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSortedOptions {
	
	public static void main (String [] args)
	{
		System.setProperty("webdriver.msgedge.driver", "C:\\Users\\gerik\\OneDrive\\Desktop\\seleniumtutorial\\drivers\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("animals"));
		
		Select se = new Select (element);
		
		List originalList = new ArrayList();
		List <WebElement> options = se.getOptions();
		
	
		
		System.out.println(originalList);
		
		List tempList = new ArrayList();

		//tempList=originalList;
		//when i assign like this and sort the temporary list both of them are going to get sorted
		
		
		for(WebElement e:options)
		{
			originalList.add(e.getText());
			tempList.add(e.getText());

		}
		
		System.out.println("Before sorting templist " + tempList);
		
		Collections.sort(tempList);
		
		System.out.println("After sorting tempList : " + tempList);
		
		if(originalList == tempList)
		{
			System.out.println("Dropdown is sorted");
			
		}
		else
		{
			System.out.println("Dropdown is not sorted");
		}
		
		driver.close();
	}

}
