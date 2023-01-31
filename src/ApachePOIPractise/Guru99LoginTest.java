package ApachePOIPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Guru99LoginTest {
	//Credentials valid for 20 days
	
	EdgeDriver  driver;
	
	String url = "https://demo.guru99.com/V4/";
	
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.msgedge.driver", "C:\\Users\\gerik\\OneDrive\\Desktop\\seleniumtutorial\\drivers\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get(url);
	}
	
	public void Login()
	{
		//driver.findElement(By.name("uid")).sendKeys("mngr474770");
		//driver.findElement(By.name("password")).sendKeys("rudAbYz");
		
		
		//Define username element
		WebElement usernameElement = driver.findElement(By.name("uid"));
		//Type username
		usernameElement.sendKeys("mngr474770");
		
		//Define password element
		WebElement passwordElement = driver.findElement(By.name("password"));
		//Type password
		passwordElement.sendKeys("rudAbYz");
		
		WebElement loginButton = driver.findElement(By.name("btnLogin"));
		
		loginButton.click();
		
	}
	

	public static void main(String[] args) {

		
	
	}

}
