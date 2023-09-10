package week3.day2;

public class Polymorphism 
{

	public void add() 
	{
	
		int a = 100;
		int b = 200;
		System.out.println(a+b);
		
	}
	
	public void add(int a, int b, int c) 
	{

		System.out.println(a+b+c);

	}
	
	public void add(int a, int b, float c) 
	{
	
		System.out.println(a+b+c);

	}
	
	public void add(int a, int b, int c, float d) 
	{
	
		System.out.println(a+b+c+d);

	}
	
	public static void main(String[] args) 
	{
	
		Polymorphism polMor = new Polymorphism();
		polMor.add();
		polMor.add(10, 20, 30);
		polMor.add(1, 2, 3.3f);
		polMor.add(10, 20, 30, 40.56f);
		
	}
	
}
