package week1.day2;

public class LearnOperators 
{

	public static void main(String[] args) 
	{

		//Arithmetic operators:
		int a = 97;
		int b = 2;
		
		System.out.println("Addition    of two given numbers is " + (a+b) );
		System.out.println("Subtraction of two given numbers is " + (a-b) );
		System.out.println("Remainder   of two given numbers is " + (a%b) ); //Remainder
		System.out.println("Quotient    of two given numbers is " + (a/b) ); //Quotient
		System.out.println("========================================");
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		System.out.println(a>=b); //true
		System.out.println(a<=b); //false
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
		
		
		System.out.println(a>b && a<b); //true
		System.out.println(a<b || a>b); //false
		
		
	}

}
