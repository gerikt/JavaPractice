package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindBy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.msgedge.driver", "C:\\Users\\gerik\\OneDrive\\Desktop\\seleniumtutorial\\drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		//locate a web element
		String tagname = " ";
		tagname = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(6)")).getText();
		System.out.println(tagname);
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		//dropdown
		WebElement prime = driver.findElement(By.cssSelector("#menu-item-7128 > a"));
		Actions action = new Actions(driver);
		action.moveToElement(prime).perform();
		Thread.sleep(2000);
		
		WebElement books =driver.findElement(By.linkText("Free Machine Learning Ebooks"));
		books.click();
		
	}

}
