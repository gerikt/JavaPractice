package ApachePOIPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Guru99Project { 
	// Credentials valid for 20 days
	
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
		
		public void addCustomer()
		{
			driver.findElement(By.linkText("New Customer")).click();
			
			driver.findElement(By.name("name")).sendKeys("John");
			
			driver.findElement(By.xpath("//input[@value='m']")).click();
			
			driver.findElement(By.name("dob")).sendKeys("01/01/2001");
			
			driver.findElement(By.name("addr")).sendKeys("1234 US hwy64 ");
			
			driver.findElement(By.name("city")).sendKeys("Naples");
			
			driver.findElement(By.name("state")).sendKeys("Florida");
			
			driver.findElement(By.name("pinno")).sendKeys("123456");
			
			driver.findElement(By.name("telephoneno")).sendKeys("8134584545");
			
			//random email generator
			String emailId = "Test" + System.currentTimeMillis() + "@abc.com" ;
			
			driver.findElement(By.name("emailid")).sendKeys(emailId);
			
			driver.findElement(By.name("password")).sendKeys("Pro@123");
			
			driver.findElement(By.name("sub")).click();
			
			
			
			
			
		}
}