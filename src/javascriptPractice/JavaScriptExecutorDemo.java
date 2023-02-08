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
		String title = JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);
		
		
		//Clicking on element using js
		
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a/span"));
		//loginBtn.click();
	
		JavaScriptUtil.clickElementByJS(driver, loginBtn);
		
		
		//alert
		
		JavaScriptUtil.generateAlert(driver, "You clicked on login button");
	
		
		//refreshing page
		JavaScriptUtil.refreshBrowserByJS(driver);
		
		driver.get("https://www.twoplugs.com/");

		//scroll till element is visible
		WebElement image =driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
		JavaScriptUtil.scrollIntoView(image, driver);
		
	}

}
