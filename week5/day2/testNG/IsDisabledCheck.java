package week5.day2.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisabledCheck {

	public static void main(String[] args) {

		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Checking if the Checkbox is disabled:
		boolean isEnabled = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isEnabled();
		
		if(isEnabled==true) 
		{
			System.out.println("Checkbox is Enabled");
		}else
		{
			System.out.println("Checkbox is Disabled");
		}
		
		

	}

}
