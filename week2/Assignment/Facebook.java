package week2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook 
{

	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//01) Launch the Url  https://www.pvrcinemas.com/
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Sangamithra");
		driver.findElement(By.name("lastname")).sendKeys("K");
		driver.findElement(By.name("reg_email__")).sendKeys("9884088348");
		driver.findElement(By.id("password_step_input")).sendKeys("Test123");
		//Date Select:
		Select dSelect = new Select(driver.findElement(By.id("day")));
		dSelect.selectByIndex(7);
		
		Select mSelect = new Select(driver.findElement(By.id("month")));
		mSelect.selectByVisibleText("Mar");
		
		Select ySelect = new Select(driver.findElement(By.id("year")));
		ySelect.selectByVisibleText("1983");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.close();
		
		

	}

}
