package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		//Launching Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//Maximizing the browser:
		driver.manage().window().maximize();
		//Loading the Facebook URL
		driver.get("http://facebook.com");
		//Getting the title of the page:	
		String title  = driver.getTitle();
		//Printing the title 
		System.out.println("Title of the page is: "+title);
		Thread.sleep(2000);
		//driver.close();
		
		
		
		
	}

}
