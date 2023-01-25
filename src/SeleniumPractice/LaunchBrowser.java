package SeleniumPractice;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser   {

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gerik\\OneDrive\\Desktop\\seleniumtutorial\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
	}

}
