package week3.day1.Inheritance;

public class Auto extends Vehicle 
{

	public void applyMeter() 
	{
		System.out.println("Meter applied from Auto Class");

	}
	
	public static void main(String[] args) 
	{
	
		Auto a = new Auto();
		a.applyMeter();
		a.applyMeter();
		a.soundHorn();

	}

}
