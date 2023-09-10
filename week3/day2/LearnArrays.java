package week3.day2;

import java.util.Arrays;

public class LearnArrays 
{

	public static void main(String[] args) 
	{
		
		int scores[] = {98,97,76,87,90};

		//Length of the array
		//For Length --> always the count starts at 1
		//For index --> always the count starts at 0
		
		//To find the length of an array 
		int len = scores.length;
		System.out.println("Total Length of the Array is: " +len);
		
		System.out.println("Printing the values in the Given Array without sorting");
		//To retrieve the single item in a array		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
					

		System.out.println("Printing the values in the Given Array with sorting");
		//To Sort an array:
		Arrays.sort(scores);
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);

		System.out.println("Printing the values in the Given Array after sorting with loop");
		//To print all the items in an array
		for(int i= 0; i < scores.length; i++)
		{
			
			System.out.println(scores[i]);
		}
		
		//Finding the largest value in the array:
		System.out.println("Printing the largest item in the Array: "+scores[scores.length-1]);
		//Finding the Second largest value in the array:
		System.out.println("Printing the 2nd largest item in the Array: "+scores[scores.length-2]);
		
		//2nd Type of using Arrays:
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 22;
		num[2] = 40;
		num[3] = 90;
		num[4] = 89;
		System.out.println(num[0]);
		for(int j = 0; j > num.length;j++)
		{
			System.out.println(num[j]);
		}
		
		
	}

}
