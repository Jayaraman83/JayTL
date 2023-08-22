package week1.Assignment;

public class NumberConversion {

	public static void main(String[] args) {
		// Convert a negative number to positive number
		
		System.out.println("Convert a negative number to positive number");
		
		int num = 100;
		
		if(num < 0)
		{
			
			int convToNeg = num*(-1);
			System.out.println("Conversion of the given " +num+ "number is: " +convToNeg);
			
		}else if(num > 0) 
		{
			
			int convToPos = num*(-1);
			System.out.println("Conversion of the given " +num+ " number is: " +convToPos);
			
		}
		

	}

}
