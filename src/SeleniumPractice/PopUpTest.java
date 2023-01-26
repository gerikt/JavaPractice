package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpTest {

	public static void main (String [] args)
	{
		System.setProperty("webdriver.msgedge.driver", "C:\\Users\\gerik\\OneDrive\\Desktop\\seleniumtutorial\\drivers\\msedgedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dummysoftware.com/popupdummy_testpage.html");
		driver.manage().window().maximize();
		
		
	
	}
}
