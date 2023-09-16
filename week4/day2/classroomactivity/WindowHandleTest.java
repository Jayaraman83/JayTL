package week4.day2.classroomactivity;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleTest {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		//Maximize the Browser window:
		driver.manage().window().maximize();
		//02) Load https://www.amazon.in/
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click Flights
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		//get the title of the window:
		String pTitle = driver.getTitle();
		System.out.println("Parent Title is: "+pTitle); //Should be "IRCTC Next Generation eTicketing System"
		//get the window handle
		String pwindowHandle = driver.getWindowHandle();
		System.out.println(pwindowHandle);
		//to get all window handles
		Set<String> windowHandles = driver.getWindowHandles();
		//to switch to a particular index
		
		
		

	}

}
