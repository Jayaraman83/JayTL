package week2.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		// Testcase:2(Amazon)
		
		//01) Launch Chrome
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the Browser window:
		driver.manage().window().maximize();
		
		//02) Load https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//03) Type "Bags" in the Search box
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		Thread.sleep(5000);
		
		//04) Choose the item in the result (bags for boys)
		driver.findElement(By.xpath("//span[contains(text(),'for boys')]")).click();

		Thread.sleep(5000);
		//05) Print the total number of results (like 50000)
		String noofResults = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(noofResults);
		
		//06) Select the first 2 brands in the left menu
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();

		Thread.sleep(5000);
		//07) Choose New Arrivals (Sort)
		Select sortSelect = new Select(driver.findElement(By.id("s-result-sort-select")));
		sortSelect.selectByIndex(4);
			
		Thread.sleep(5000);
		//08) Print the first resulting bag info (name, discounted price)
		String bagName = driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")).getText();
		String bagDiscountPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
			
		System.out.println("First bag Name is: "+bagName);
		System.out.println("First bag Discount Price is: "+bagDiscountPrice);
			
		//09) Get the page title and close the browser(driver.close())
		System.out.println(driver.getTitle());
			  
		driver.close();
	}	
}
