package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce 
{

	public static void main(String[] args) throws InterruptedException 
	{

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//load the URL:
		driver.get("https://login.salesforce.com/");
		
		//Maximize the Browser window:
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//Entering the user id
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		//Entering the Pwd id		
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		//Clicking on Login;
		driver.findElement(By.name("Login")).click();
		Thread.sleep(10000);
		
		//Checking if the user has landed in the home page:
//		boolean isHomedisplayed = driver.findElement(By.linkText("Setup Home")).isDisplayed();
//		System.out.println(isHomedisplayed);

		//Clicking on Logout:
		driver.findElement(By.className("uiImage")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log Out")).click();
		

	}

}
