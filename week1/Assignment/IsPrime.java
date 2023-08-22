package week1.Assignment;

//Prime Numbers : 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31
//Natural Number > 1
//Should be divisible by 1 and itself only (Only 2 factors)

public class IsPrime {

	public static void main(String[] args) {
		// Home Assignment 2: Print if the given number is prime
		
		int num = 29;
		int count=0;
		
		System.out.println("Print if the given number is prime : " +num);
		
		if(num>1) 
		{
		
			for (int i = 1; i <=num; i++)
			{	
			
				if(num%i==0)
				count++;
			}	
				if(count==2)
				{
					System.out.println("The Given number is a Prime");
				}
				else 
				{
					System.out.println("The Given number is Not a Prime");	
				}
			}	
			else 
				{
					System.out.println("The Given number is Not a Prime");
				}
				
		}

}
