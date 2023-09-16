package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames 
{

	public static void main(String[] args) 
	{

		ChromeDriver driver = new ChromeDriver();
		//Maximize the Browser window:
		driver.manage().window().maximize();
		//02) Load https://www.amazon.in/
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Finding the parent frame:
		WebElement findElement = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following::iframe"));	
		driver.switchTo().frame(findElement);
		
		
		
		
		
		

	}

}
