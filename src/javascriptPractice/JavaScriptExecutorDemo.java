package javascriptPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws IOException {

		//Flashing an element
		
		System.setProperty("webdriver.msgedge.driver", "C:\\Users\\gerik\\OneDrive\\Desktop\\seleniumtutorial\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.twoplugs.com/");
		
		WebElement joinfree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a/span"));
	
		JavaScriptUtil.flash(joinfree, driver);
		
		
		//drawing border 
		
		JavaScriptUtil.drawBorder(joinfree, driver);
		
		//take a screenshot
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("C://screenshot/twoplugs.png"));
		
		//get the title of the page
		//System.out.println(driver.getTitle());
		
		//or i can use javascript
		
		
	
	
	}

}
