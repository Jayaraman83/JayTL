package week3.day1.Inheritance;

public class Bajaj extends Auto 
{

	public void leverStart() 
	{
		
		System.out.println("Lever Start from Bajaj Class");

	}
	
	public static void main(String[] args) 
	{
		
		Bajaj bj = new Bajaj();
		bj.applyBreak();
		bj.applyMeter();
		bj.soundHorn();
		bj.leverStart();
		
	}
	
}
