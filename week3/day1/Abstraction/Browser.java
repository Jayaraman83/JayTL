package week3.day1.Abstraction;

public interface Browser 
{
	/*This method should launch the Chrome browser
	 * */
	
	public void startApp();
	
	/*
	 * This method will load the Application in specific browser
	 * */
	
	public void loadUrl(String url);

	/*
	 * This method will close the browser 
	 * */
	
	public void quit();
	
}
