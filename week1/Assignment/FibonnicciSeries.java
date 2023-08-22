package week1.Assignment;

public class FibonnicciSeries {

	public static void main(String[] args) {
		// Writing Program to
		/*
		 Home Assignment 1: Print Fibbinocci series for first 11 numbers

		 0  1  1  2  3  5  8  13  21  34  55  89  144
 
		 */
		int firstNum = 0, secNum = 1, sum = 0;
		
		System.out.println("Print Fibbinocci series for first 11 numbers");
		
		System.out.print(sum + " " +secNum);
				
		//Writing the logic here
		for(int i = 0; i<= 11-1; i++)
		{
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.print(" " +sum);
						
		}

	}

}
