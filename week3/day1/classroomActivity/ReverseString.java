package week3.day1.classroomActivity;

public class ReverseString {

	/*

		Reverse the String
		==================
		String  input=“TestLeaf";
		Goal: To understand the String,loop
		a)Convert the String to character array (use toCharArray)
		b)Use for loop to iterate through each character (from end to go to the first)
		c)Print the Characters continuously
	 	Hint  Use  system.out.print() 
	 */
	
	public static void main(String[] args) 
	{
	
		String str = "TestLeaf";
		//using ToCharArray to convert the String 
		char convertStr[] = str.toCharArray();

		System.out.println("Given String is: "+str);
		
		System.out.print("Reversed String is: ");
		//b)Use for loop to iterate through each character (from end to go to the first)
		for(int i = convertStr.length-1; i >=0 ; i--)
		{
			System.out.print(convertStr[i]);
		}
				
	}

}
