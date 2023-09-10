package week3.day2.classroomActivity;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserImplementation implements Browser
{
	public RemoteWebDriver driver; 
	@Override
	public void startApp() 
	{
	
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().window().maximize();
		 driver.get("https://www.chrome.com");
		 System.out.println("Launched Chrome Browser and loaded Chrome Page");
	}
	@Override
	public void startApp(String browser) 
	{
		switch(browser)
		{
			case  "Chrome" :
				driver = new ChromeDriver();
				driver.get("https://facebook.com");
				 System.out.println("Launched Chrome Browser and loaded FB Page");
				break;
			case "Edge" :
				driver = new EdgeDriver();
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://www.microsoft.com/en-us/edge");
				 System.out.println("Launched Edge Browser and loaded Microsoft Edge Page");
				 
				break;
			case "FireFox" :
				driver = new FirefoxDriver();
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://www.firefox.com");
				 System.out.println("Launched Firefox Browser and loaded Mozilla Fire Fox Page");
			default :
				break;
				
		}
		
	}

	public void quit() 
	{
	
		driver.quit();
		
	}

}
