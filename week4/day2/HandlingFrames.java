package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames 
{

	public static void main(String[] args) 
	{

		ChromeDriver driver = new ChromeDriver();
		//Maximize the Browser window:
		driver.manage().window().maximize();
		//02) Load https://www.amazon.in/
		driver.get("https://www.buythevalue.in");
		//driver.get("https://leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.switchTo().frame("dummy-chat-button-iframe");
		
		driver.findElement(By.id("dummy-chat-button")).click();

		driver.findElement(By.xpath("//iframe[@id='ShopifyChat']")).click();
		
				
		
	}

}
