package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FormSignUp {
	
	public static void main (String [] args)
	{
		System.setProperty("webdriver.msgedge.driver", "C:\\Users\\gerik\\OneDrive\\Desktop\\seleniumtutorial\\drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://signup.com/Register");
		
		driver.manage().window().maximize();
		
		//first name
		driver.findElement(By.cssSelector("#register-fname")).sendKeys("Geri");
		//last name
		driver.findElement(By.cssSelector("#register-lname")).sendKeys("Kote");
		//email
		driver.findElement(By.cssSelector("#register-email")).sendKeys("gerikote@outlook.com");
		//password
		driver.findElement(By.cssSelector("#register-password")).sendKeys("123456789");
		//checkbox
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")).click();
		
		

	}

}
