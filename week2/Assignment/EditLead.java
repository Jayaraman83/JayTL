package week2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 
		                  Assignment 2:Edit Lead
		  1. Launch URL "http://leaftaps.com/opentaps/control/login"
		  2. Enter UserName and Password Using Id Locator
		  3. Click on Login Button using Class Locator
		  4. Click on CRM/SFA Link
		  5. Click on Leads Button
		  6. Click on Create Lead 
		  7. Enter CompanyName Field Using id Locator
		  8. Enter FirstName Field Using id Locator
		  9. Enter LastName Field Using id Locator
		  10. Enter FirstName(Local) Field Using id Locator
		  11. Enter Department Field Using any Locator of Your Choice
		  12. Enter Description Field Using any Locator of your choice 
		  13. Enter your email in the E-mail address Field using the locator of your choice
		  14. Select State/Province as NewYork Using Visible Text
		  15. Click on Create Button
                  16. Click on edit button
                  17. Clear the Description Field using .clear()
		  18. Fill ImportantNote Field with Any text
		  19. Click on update button 
		  20. Get the Title of Resulting Page. refer the video  using driver.getTitle()
 
		  
		 * */
		
		
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
		driver.findElement(By.linkText("Leads")).click();
		
//		  6. Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
//		  7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BA Continuum India Pvt Ltd");
		
//		  8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayaraman");
//		  9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balasubramanian");
//		  10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jayaraman");
//		  11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("Electronics & Instrumentation Engineering");
//		  12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I am a Software Test Engineer working for BA Continuum in Chennai!!");
//		  13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jayaraman83@gmail.com");
//		  14. Select State/Province as NewYork Using Visible Text
		WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateSelect = new Select(stateDropdown);
		stateSelect.selectByValue("NY");
//		  15. Click on Create Button
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(5000);
		//        16. Click on edit button
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
//        17. Clear the Description Field using .clear()
		driver.findElement(By.name("description")).clear();
//		  18. Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("I love CSK & MS!!!");
//		  19. Click on update button
		driver.findElement(By.className("smallSubmit")).click();		
//		  20. Get the Title of Resulting Page. refer the video  using driver.getTitle()
		String resultTitle = driver.getTitle();
		System.out.println(resultTitle);

		

	}

}
