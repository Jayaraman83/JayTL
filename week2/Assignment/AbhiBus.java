package week2.Assignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus 
{

	public static void main(String[] args) 
	{

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Maximize the Browser window:
		driver.manage().window().maximize();
		
		//load the URL:
		driver.get("https://www.abhibus.com/");

		//03. Click on Bus
		driver.findElement(By.linkText("Bus")).click();
		
		//04) Type "Chennai" in the FROM text box
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
		
		//05) Click the first option from the pop up box
		driver.findElement(By.xpath("//li[contains(text(),'Chennai')]")).click();
		//06) Type "Bangalore" in the TO text box
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
		//07) Click the first option from the pop up box
		driver.findElement(By.xpath("//li[contains(text(),'Bangalore')]")).click();
		//08) Select tomorrow s date in the Date field
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
		//09) Click Search Buses
		driver.findElement(By.linkText("Search")).click();
		//09) Print the name of the first resulting bus (use .getText())
		String firstResult = driver.findElement(By.xpath("(//h2[@class='TravelAgntNm ng-binding'])[1]")).getText();
		System.out.println(firstResult);
		
		//10) Choose SLEEPER in the left menu from Bus Type
		driver.findElement(By.xpath("//li[@id='bustypeSLEEPER']")).click();
		//11) Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
		driver.findElement(By.xpath("(//p[@class='noseats AvailSts ng-binding'])[1]")).getText();
		//12) Click SelectSeat
		driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
		//13) Choose any one Available seat
		boolean isAvail = driver.findElement(By.xpath("//a[@id='UO3-9ZZ']")).isEnabled();
		if(isAvail==true)
		{
			driver.findElement(By.xpath("//a[@id='UO3-9ZZ']")).click();
		}
		//14) Print Seats Selected ,Total Fare
		String seatSelected = driver.findElement(By.xpath("//span[@id='seatnos']")).getText();
		String tcktFare = driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();
		System.out.println("Seat Selected is : " +seatSelected );
		System.out.println("Total Fare is: " +tcktFare );
		
		
		//15) Select Boarding Point  and Dropping Point (Select class)
		Select boardPoint = new Select(driver.findElement(By.xpath("//select[@id='boardingpoint_id']")));
		boardPoint.selectByVisibleText("Sirsuri-22:00");
		
		Select dropPoint = new Select(driver.findElement(By.xpath("//select[@id='droppingpoint_id']")));
		dropPoint.selectByIndex(7);
				
		//16) Get the Title of the page(use .getTitle())
		System.out.println(driver.getTitle());
		//17) Close the browser (driver.close())
		driver.close();




		


		
		
		

	}

}
