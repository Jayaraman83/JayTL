package week3.day2.classroomActivity;

import java.util.Arrays;

public class ArrayReverseOrder 
{

	public static void main(String[] args) 
	{
		int[] values = {98,97,76,87,90};
		Arrays.sort(values);
		System.out.println("Printing the values in an arry in Reverse order");
		for(int i = values.length-1; i>=0; i--)
		{
			System.out.println(+values[i]);
		}
		
	

	}

}
