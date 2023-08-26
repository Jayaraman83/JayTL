package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// How to handle Dropdown Elements:

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

		//Navigating to Leads Tab:
		driver.findElement(By.linkText("Leads")).click();
		
		//clicking on Create Lead in left pane:
		driver.findElement(By.linkText("Create Lead")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayaram");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balasubramanian");
				
		WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//Creating Select class:
		
		Select selSource = new Select(sourceDropdown);
		selSource.selectByIndex(1);
		Thread.sleep(2000);
		
		WebElement MarketCompDropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select selMarketComp = new Select(MarketCompDropdown);
		selMarketComp.selectByValue("CATRQ_CARNDRIVER");
		Thread.sleep(2000);
		
		WebElement industryDropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industrySelect = new Select(industryDropdown);
		industrySelect.selectByVisibleText("Computer Software");
		
		//Clicking on Create button:	
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(5000);
		//Verify if the Lead is created:
		
		boolean isViewLeadDisplayed = driver.findElement(By.id("sectionHeaderTitle_leads")).isDisplayed();
		if(isViewLeadDisplayed==true)
		{
			System.out.println("View Lead is Displayed ");
		}else
		{
			System.out.println("Lead was not created !!!");
		}
		
		//Getting the details of the Lead Created:
		String leadName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Lead Name Created is: " +leadName );
		
		
		//Clicking on logout:
		driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(2000);
		
		boolean isLoginDisplayed = driver.findElement(By.className("loginButton")).isDisplayed();
		if(isLoginDisplayed==true)
		{
		
			System.out.println("User has been logged out successfully");
		}
		
		driver.close();
		System.out.println("Browser has been Closed");

	}

}
