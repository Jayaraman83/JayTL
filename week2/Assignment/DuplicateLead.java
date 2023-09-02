package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead 
{

	public static void main(String[] args) 
	{
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch the Browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//Click on CRM/SFA Link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		//Click Leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		//Enter Email
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("jayaraman83@gmail.com");
		
		//Click on Find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String firstName = driver.findElement(By.xpath("//td[contains(@class,'firstName')]//a[@class='linktext']")).getText();
		System.out.println("Printing the First Lead ID name :" +firstName);
		
		//Click First Resulting lead
		driver.findElement(By.xpath("//td[contains(@class,'firstName')]//a[@class='linktext']")).click();
		
		//Click Duplicate Lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		//Getting the Title of this page:
		String dupTitle = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
		System.out.println("Title of this page is: "+dupTitle);
		
		if(dupTitle.contains("Duplicate"))
		{
			
			System.out.println("We are on Duplicate Leads Page");
		} else
		{
			System.out.println("We are Not on Duplicate Leads Page");
		}
		
		//Click Create Lead
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		//Confirm the duplicated lead name is same as captured name
		String dupNameText = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		if(dupNameText.equals(firstName))
		{
			
			System.out.println("Verified: duplicated lead name is same as captured name");
		}else
		{
			
			System.out.println("Verified: duplicated lead name is Not same as captured name");
		}
		
	}

}
