package SeleniumPractice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.msgedge.driver", "C:\\Users\\gerik\\OneDrive\\Desktop\\seleniumtutorial\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);

		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.amazon.com");
		
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("Amazon.com. Spend less. Smile more."))
		{
			System.out.println("title matches");
		}else {
			System.out.println(title);
		}
		
		System.out.println(title);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.quit();
		
		
		
		
		
	}

}
