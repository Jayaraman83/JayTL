package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LearnAlerts 
{

	public static void main(String[] args) throws InterruptedException 
	{

		//Alerts are Java script functions and hence cannot use xpath or attributes to interact with them
		
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the Browser window:
		driver.manage().window().maximize();
		
		//02) Load https://www.amazon.in/
		//driver.get("https://www.buythevalue.in");
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Clicking on 1st Show:
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		Thread.sleep(2000);
		//Switching control to alert
		Alert simpleAlert = driver.switchTo().alert();
		
		String alertText = simpleAlert.getText();
		System.out.println("Message displayed in the alert is: " +alertText);
		
		//clicking on Ok button
		simpleAlert.accept();
		
		//Verifying if we have clicked on the Ok button:
		String successMessage = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		if(successMessage.equals("success"))
		{
			System.out.println("Alert has been Handled");
		}
		
		//Checking the next Alert :
		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following::span")).click();
		Thread.sleep(2000);
		simpleAlert.dismiss();
		
		String cancelAlertMsg = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(cancelAlertMsg);
		
		//Handling 3rd Alert with Text Input:
		
		
		
		
	}

}
