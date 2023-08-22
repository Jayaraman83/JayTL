package week1.Assignment;

public class IsPrime {

	public static void main(String[] args) {
		// Home Assignment 2: Print if the given number is prime
		int n = 90;
		System.out.println("Print if the given number is prime : " +n);
		
		//Writing the logic to find if the given number is prime or not
		for (int i = 2; i <= n-1; i++)
		{
		
			if(n%i==0)
			{
				
				System.out.println("The Given number is Not a Prime");
				break;
			}
			else 
			{
				System.out.println("The Given number is a Prime");
				break;
			}
			
			
		}

	}

}
