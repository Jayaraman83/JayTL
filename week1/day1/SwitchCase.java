package week1.day1;

public class SwitchCase 
{

	public static void main(String[] args) 
	{

		String browser = "Mozilla";
		
		switch (browser)
		{ 
		
		case "Chrome": 
			
			System.out.println("Open Chrome Browser");
			break;
			
		case "IE":
			System.out.println("Open Internet Explorer Browser");
			break;
			
		case "FireFox":
			System.out.println("Open FireFox Browser");
			break;
			
		default:
			System.out.println("Invalid Browser");
			break;
		}
		

	}

}
