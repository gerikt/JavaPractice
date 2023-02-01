package SeleniumHandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpForm {

	public static void main(String[] args) {


		System.setProperty("webdriver.msgedge.driver", "C:\\Users\\gerik\\OneDrive\\Desktop\\seleniumtutorial\\drivers\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
	//	driver.findElement(By.name("RESULT_TextField-1")).sendKeys("John");
	//	driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Procer");
	//	driver.findElement(By.id("RESULT_TextField-3")).sendKeys("8131111111");
	//	driver.findElement(By.id("RESULT_TextField-4")).sendKeys("US");
	//	driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Naples");
	//	driver.findElement(By.id("RESULT_TextField-6")).sendKeys("test123@gmail.com");

		
		//dropdownBox
		WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]"));
		
		Select se = new Select(dropDown);
		se.selectByIndex(1);
		
		//or i can use
		se.selectByVisibleText("Morning");
		
		//or i can use
		se.selectByValue("Radio-1");
		
		

	}

}
