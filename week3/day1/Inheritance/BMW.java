package week3.day1.Inheritance;

public class BMW extends Car
{

	public void airBag() 
	{
		
		System.out.println("Air Bag from BMW Class");

	}
	
	public static void main(String[] args) 
	{
		
		BMW bm = new BMW();
		bm.airBag();
		bm.applyBreak();
		bm.applyGear();
		bm.soundHorn();
				
	}
	
}
