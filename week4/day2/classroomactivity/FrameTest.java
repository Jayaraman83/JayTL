package week4.day2.classroomactivity;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		//Maximize the Browser window:
		driver.manage().window().maximize();
		//02) Load https://www.amazon.in/
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//driver.get("https://leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		//Click TryIt button
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
				
		Alert alertbox = driver.switchTo().alert();
		System.out.println(alertbox.getText());
		alertbox.accept();
		
		//verify the output text:
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if(text.contains("OK"))
		{
			System.out.println("Alert Handled");
		}
				
	}

}
