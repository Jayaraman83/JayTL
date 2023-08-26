package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//load the URL:
		//driver.get("https://www.amazon.in");
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the Browser window:
		driver.manage().window().maximize();
		
		//verify if we have landed in the right page:
		String title = driver.getTitle();
		System.out.println("Title of the browser: " +title);
		
		Thread.sleep(2000);
		
		//Entering the user id:
		WebElement uName = driver.findElement(By.id("username"));
		uName.sendKeys("demosalesmanager");
		//or 
		//driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//Entering the password:
		WebElement uPassword = driver.findElement(By.id("password"));
		uPassword.sendKeys("crmsfa");
		//or
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Clicking on Login button:
		driver.findElement(By.className("decorativeSubmit")).click();
		
		Thread.sleep(5000);
		System.out.println("Logged in Successfully");
		
		
		//Clicking on CRM/SFA link:
		driver.findElement(By.partialLinkText("SFA")).click();
//		
		//Verifying if we have landed into the HomePage:
		boolean isHomeDisplayed = driver.findElement(By.linkText("My Home")).isDisplayed();
		if(isHomeDisplayed==true)
		{
			System.out.println("Landed on the Home Page");
		}	
		
		//Clicking on logout:
		driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(2000);
		
		boolean isLoginDisplayed = driver.findElement(By.className("loginButton")).isDisplayed();
		System.out.println(isLoginDisplayed);
		
		
//		//Clicking on Logout button:
//		driver.findElement(By.className("decorativeSubmit")).click();
//		System.out.println("Logged Out Successfully");
//		
//		//closing the browser
//		driver.close();
//		System.out.println("Browser Closed Successfully");
//		
//		

	}

}
