package week3.day2.classroomActivity;

import java.util.Arrays;

import org.checkerframework.checker.units.qual.Length;

public class PrintReverseOrder 
{

	public static void main(String[] args) 
	{

		//Print all values in an Array in reverse order
		int numArray[] = {98,97,76,87,90};
		
		Arrays.sort(numArray);
				
		System.out.println("Printing the values of Array in Reverse Order:");
		
		for(int i = numArray.length-1; i>=0; i-- )
		{
			System.out.println(numArray[i]);
		}

	}

}
