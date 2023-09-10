package week2.marathon;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.record.chart.AxisOptionsRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Testcase 3 (PVR cinemas)
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//01) Launch the Url  https://www.pvrcinemas.com/
		driver.get("https://www.pvrcinemas.com/");

		//02) Click  on Movie Library
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		//03) Select the City -->chennai
		Thread.sleep(5000);
		Select citySelect = new Select(driver.findElement(By.name("city")));
		citySelect.selectByValue("Chennai");
		//04) Select the Genre-->Animation
		Select GenreSelect = new Select(driver.findElement(By.name("genre")));
		GenreSelect.selectByVisibleText("ANIMATION");
		//05) Select the Language-->english
		Select langSelect = new Select(driver.findElement(By.name("lang")));
		langSelect.selectByVisibleText("ENGLISH");
		//06) Click on Apply
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(10000);
		//07) Click on first resulting animation movie
		driver.findElement(By.xpath("(//div[@class='info'])[1]")).click();
		//08) Click proceed to book
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Thread.sleep(3000);
		//09) Enter  all  the fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
		Select cinemaSelect = new Select(driver.findElement(By.name("cinemaName")));
		cinemaSelect.selectByIndex(4);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Jayaraman B");
		driver.findElement(By.xpath("//div[@class='pvr-datepicker']")).click();
		driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']")).click();
		Select prefTimingSelect = new Select(driver.findElement(By.name("timings")));
		prefTimingSelect.selectByIndex(3);
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jayaraman83@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9884088348");
		
		Select foodSelect = new Select(driver.findElement(By.name("food")));
		foodSelect.selectByVisibleText("Yes");
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("Scotch");

		//10) Click on copy to self
		driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
 		//11) Click on  Send Request
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
//		12) Click cancel
		Thread.sleep(10000);
		boolean isOtpPopupDisplayed = driver.findElement(By.xpath("//button[text()='CANCEL']")).isDisplayed();
		if(isOtpPopupDisplayed==true)
		{
			driver.findElement(By.xpath("//button[text()='CANCEL']")).click();
		}else
		//13) Close the OTP dialog
		{
			driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
		}
		//14) Verify the title of the page
		System.out.println("Title of the Page is: "+driver.getTitle());
	}
}
