package week3.day1.Inheritance;

public class Audi  extends Car 
{

	public void sunRoof() 
	{

		System.out.println("Sunroon from Audi Class");
	}
	
	public static void main(String[] args) 
	{
	
		Audi au = new Audi();
		au.applyBreak();
		au.applyGear();
		au.sunRoof();
		au.soundHorn();
		
	}
	
}
