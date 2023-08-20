package week1.day1;

public class ConditionalStatements 
{

	public static void main(String[] args) 
	
	{
		//Given a number
		int number = 10000;  
		//Problem statement: Find whether the given number is Positive Or Negtive:
		if (number > 0)  
		{
			System.out.println("The Given number is Positive");
		}
		else if (number==0)   //== is Comparison Operator
		{
			System.out.println("The Given number is Zero");
		}
		else 
		{
			System.out.println("The Given number is Negative");
		}
				
	}

}
