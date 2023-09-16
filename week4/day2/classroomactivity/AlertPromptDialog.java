package week4.day2.classroomactivity;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPromptDialog 
{
	
	/*
	 * 
	 Classroom:
   - Load leafground.com(https://www.leafground.com/alert.xhtml)
   - click show button under Alert(Prompt Dialog)
   - pass an input message in the alert text box
   - read the alert message
   - accept/dismiss the alert
   - verify 
	 * */
	
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the Browser window:
		driver.manage().window().maximize();
		
		//02) Load https://www.amazon.in/
		//driver.get("https://www.buythevalue.in");
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//clicking on :  Alert(Prompt Dialog)
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span")).click();
		
		Thread.sleep(2000);
		Alert promptAlert = driver.switchTo().alert();
		//Entering Text in the Text box:
		promptAlert.sendKeys("Jay");
		//Clicking on Ok
		promptAlert.accept();
		
		//Capturing the Text after clicking on the button Ok:
		String promptAlertMsgSuccess = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		if(promptAlertMsgSuccess.equals("Jay"))
		{
			System.out.println("Prompt Alert Successfully Clicked");
		}
			
		
driver.close();
		
	}

}
