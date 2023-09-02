package week2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the Browser window:
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		//2. Enter UserName and Password Using Id Locator
		WebElement uName = driver.findElement(By.id("username"));
		uName.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		Thread.sleep(5000);
		
		
		//4. Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("SFA")).click();
		//5. Click on Leads Button
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		Thread.sleep(2000);
		
		//clicking on Find Leads:
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//click on the Email 
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		//Entering email address:
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("jayaraman83@gmail.com");
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		
		//Selecting the Found Lead for Deletion:
		driver.findElement(By.xpath("//td[contains(@class,'firstName')]//a[@class='linktext']")).click();
		
		//Clicking on Delete button:
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(3000);
		//Check if the Screen has returned to My Leads:
		if(driver.getTitle().contains("My Leads"))
		{
			System.out.println("We are now back to the My Leads Page:");
			System.out.println("Closing the browser:");
			driver.close();
			
		}
		else
		{
			System.out.println("We are NOT In My Leads Page:");
			
		}
		
		
		
		
	}

}
