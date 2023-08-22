package week1.Assignment;

public class CheckNumber {

	public static void main(String[] args) {
		//  Check if the number is positive or negative
		
		System.out.println("Check if the number is positive or negative");
		int num = -10;
		
		if(num>0)
			System.out.println("Given number " +num+  " is Positive");
		else if (num < 0) 
		{
			
			System.out.println("Given number " +num+  " is Negative");
			
		} else 
		{
			System.out.println("Given number " +num+  " is Neither Positive Nor Negative");
		}

	}

}
