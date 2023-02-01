package SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchingWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.msgedge.driver", "C:\\Users\\gerik\\OneDrive\\Desktop\\seleniumtutorial\\drivers\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		
		
		//this will open a child window
		//for some reason here the tutorial is using the full xpath
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
		
		System.out.println(driver.getTitle());
		//the browser is on the parent window after this
		
		//We want to switch to the child window
		//this method is going to tells us how many windows are open
		Set<String> s= driver.getWindowHandles();
		// s stores all the window id's 
		
		for (String i : s)
		{
			String t =driver.switchTo().window(i).getTitle();
			System.out.println("the window id is :" + i + "and the title is : " + t);
			//this will print the is and the title of the window
			
			
			//if i want to close one of the windows
			if(t.contains("Frames"))
			{
				//it will only close the parent window
				driver.close();
			}
			
			
			
			
		}
		
		

	}

}
