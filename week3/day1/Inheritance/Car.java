package week3.day1.Inheritance;

public class Car extends Vehicle
{
	
	public void applyGear() 
	{
		System.out.println("Gear Applied for Car Class");
	}
	
public static void main(String[] args) 
{
		
	Car c = new Car();
	c.applyBreak();
	c.applyGear();
	c.soundHorn();
	
	
}



	
	
}
