package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathAssignment {

	public static void main(String[] args) throws InterruptedException {
		// xPath Class room Assignment 
		/*
		1. Launch http://leaftaps.com/opentaps
		2. Enter username as demoSalesManager (Use : Attribute based)
		3. Enter password as crmsfa (Use : Attribute based)
		4. Click on Login (Use : Attribute based)
		5. Click on CRM/SFA (Use Partial Text based xpath)
		6. Click on Leads(Use Text based)
		 * */
		ChromeDriver driver = new ChromeDriver();
		//		1. Launch http://leaftaps.com/opentaps
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the Browser window:
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Enter username as demoSalesManager (Use : Attribute based)
		WebElement uName = driver.findElement(By.xpath("//input[@id='username']"));
		uName.sendKeys("demosalesmanager");
		//3. Enter password as crmsfa (Use : Attribute based)
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//4. Click on Login (Use : Attribute based)
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		Thread.sleep(5000);
		//5. Click on CRM/SFA (Use Partial Text based xpath)
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//6. Click on Leads(Use Text based)
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}
}
