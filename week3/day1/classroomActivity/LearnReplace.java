package week3.day1.classroomActivity;

public class LearnReplace {

	public static void main(String[] args) 
	{
		String str = "Chennai 60064";
		//Output should be only the numbers:
		String replaceStr = str.replaceAll("[^0-9]", "");
		System.out.println(replaceStr);  //600064
		int parseInt = Integer.parseInt(replaceStr);
		System.out.println(parseInt);
		
		//Output shoudl be only String without numbers:
		String replaceString = str.replaceAll("[^a-zA-Z]", "");  //Symbol ^ is like Not equal to
		System.out.println(replaceString); //Chennai
		
		String name = "Test-123";
		String newName = name.replaceAll("-", "#");
		System.out.println("Given Name: " +name);
		System.out.println("New String: "+newName);
	
		String number = "9,107";
		String number2 = number.replaceAll(",", "");
		int parseInt2 = Integer.parseInt(number2);
		System.out.println(parseInt2);
		
	}

}
