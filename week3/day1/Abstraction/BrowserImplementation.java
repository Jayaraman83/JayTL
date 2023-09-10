package week3.day1.Abstraction;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserImplementation extends Reporter implements Browser,Element 
{

	public ChromeDriver driver;
	
	@Override
	public void startApp() 
	{
		
		driver = new ChromeDriver();
		
	}

	@Override
	public void loadUrl(String url) 
	{	
		
		driver.get(url);
		
	}


	
	
	public void close() 
	{
		
		driver.close();
		
	}

	@Override
	public void quit() 
	{

		driver.quit();
		
	}
	
	public static void main(String[] args) 
	{

		BrowserImplementation bi = new BrowserImplementation();
		bi.startApp();
		bi.loadUrl("https://www.google.com");
		bi.close();
			
				
	}


	@Override
	public void takeSnap() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void locateElement() {
		// TODO Auto-generated method stub
		
	}	
	

}
