package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonNavigationPractise {

	public static void main(String[] args) {

		System.setProperty("webdriver.msgedge.driver", "C:\\Users\\gerik\\OneDrive\\Desktop\\seleniumtutorial\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.cssSelector("#nav-hamburger-menu > i")).click();
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[11]/a")).click();
		driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(6) > a")).click();
	}

}
