package week3.day1.Abstraction;

public abstract class Reporter implements Browser 
{

	public abstract void takeSnap();   //Abstract method of Abstract class 
	
	public void startReport() 
	{
		
		System.out.println("Report Started");

	}
	
	//Implemented method of interface
	@Override
	public void quit() 
	{
		
		
	}
	
}
