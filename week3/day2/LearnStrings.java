package week3.day2;

import java.util.Iterator;

public class LearnStrings 
{

	public static void main(String[] args) 
	{

		//String is a class in Java / sequence of characters / 
		//Syntax: String name = "Value";
		//This way of declaration is called Literal Declaration --> It will check if the string exist already in memory if yes then it will just point it to that value
		String name = "TestLeaf";
		String name1 = "testleaf";
		//String Instantiation - String Objects  --Always it will create a new Memory 
		String str = new String("TestLeaf");
		
		//to compare two String values
		//differences between == and .equal
		//== will check only the references  and it will not check  the content inside a string
		//.equals will compare the content in both the strings
		
		System.out.println(name==str); //false because it checks the memory reference address and not the value
		System.out.println(name.equals(str));
		
		//Length
		System.out.println(name.length());
		
		//EqualsIgnoreCase: --> To Ignore case sensitivity
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		
		//contains(); Check if a character is preset in a string
		System.out.println(name.contains("Test"));
		if(name.contains("Test"))
		{
			System.out.println("String name contains the value: Test");
		}
		else 
		{
		System.out.println("String name Does not contains the value: Test");
		}
		
		//Upper Case to Lower Case:
		String convertedName = name.toLowerCase();
		System.out.println(convertedName);
		System.out.println("Given name is: "+name);
		System.out.println("Converted name is: "+convertedName);
		
	
		//toCharArray()
		char[] splitName =  name.toCharArray();
		System.out.println(splitName[2]);
		
		
		for(int i = 0; i<splitName.length ;i++)
		{
			System.out.println(splitName[i]);
		}
		
		//toCharIndex()
		//To Print the Substring
		String subString = name.substring(5);
		System.out.println(subString); //eaf
		
		String subString2 = name.substring(3, 6);  //end will always be index-1 --> Till 5th Char will be printed
		System.out.println(subString2);  //tLe
	}
		
}


