package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSweetAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		//Maximize the Browser window:
		driver.manage().window().maximize();
		//02) Load https://www.amazon.in/
		//driver.get("https://www.buythevalue.in");
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Handling Sweet Alert:
		//Sweet Alert (Simple Dialog)
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Simple Dialog)']/following::span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		System.out.println("Sweet Alert (Simple Dialog) Handled");
		

	}

}
