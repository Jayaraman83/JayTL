package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		//Maximize the Browser window:
		driver.manage().window().maximize();
		//02) Load https://www.amazon.in/
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//get the title of the window:
		String windowTitle = driver.getTitle();
		System.out.println(windowTitle); //Should be "Window"
		
		//Now Switching to the next Window:
		
		
		
		
		
		
		

	}

}
