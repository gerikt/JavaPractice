package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {

	public static void main(String [] args)
	{
		System.setProperty("webdriver.msgedge.driver", "C:\\Users\\gerik\\OneDrive\\Desktop\\seleniumtutorial\\drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		//type username
		driver.findElement(By.cssSelector("#email")).sendKeys("garryanderson@outlook.com");
		
		//type password
		driver.findElement(By.cssSelector("#pass")).sendKeys("G0y676");
		
		//click login
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		
		//actual title
		
		String actualTitle =driver.getTitle();
		
		System.out.println("Actual titlte is :" +actualTitle);
		
		//expected title
		String expectedTitle = "Facebook - log in or sign up";
		
		
		//validate title
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Title matches");
			
		}
		else
		{
			System.out.println("Title does not match");
		}
		
		//close the browser
		driver.close();
		
	}
}
