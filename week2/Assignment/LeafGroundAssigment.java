package week2.Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundAssigment {

	public static void main(String[] args) throws AWTException {

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/input.xhtml");
		
		//1. Type your name
		driver.findElement(By.id("j_idt88:name")).sendKeys("Micheal");
//		2. Append Country to this City
		driver.findElement(By.xpath("//h5[text()='Append Country to this City.']/following::input")).sendKeys("London");
		//3. Verify if text box is disabled
		boolean isEnableTextBox = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		if(isEnableTextBox==false) 
		{
			System.out.println("Text Box is Disabled - Cant Enter any Text here");
		}
		
		//4. Clear the typed text
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		
		//5. Retrieve the typed text
		String getText = driver.findElement(By.id("j_idt88:j_idt97")).getText();
		System.out.println(getText);
		
		//6. Type email and Tab. Confirm control moved to next element
		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("halo3@gmail.com");
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
		
		String displayText = driver.findElement(By.id("j_idt88:j_idt101")).getText();
		System.out.println("Checking the value in About your self Textbox:"+displayText);
		//7. Type about yourself
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("I Love Playing Cricket!!! ");
		
		//8. Text Editor
		driver.findElement(By.xpath("//p")).sendKeys("My favourite Bowler is Anil Kumble & Favourite Batsman is MSD");
		
		//9. Just Press Enter and confirm error message*
		driver.findElement(By.id("j_idt106:thisform:age")).click();
		robo.keyPress(KeyEvent.VK_ENTER);
		
		String errorText = driver.findElement(By.xpath("//h1/following::div")).getText();
		System.out.println(errorText);
		
		driver.navigate().back();
		
		//10. Click and Confirm Label Position Changes
		driver.findElement(By.xpath("(//i[@class='pi pi-cog'])[2]")).click();
		
		//11. Type your name and choose the third option
				
		//12. Click and Confirm Keyboard appears

		//13. Custom Toolbar

	}

}
