package week3.day2.classroomActivity;

public class BrowserExecution 
{

	public static void main(String[] args) 
	{

		BrowserImplementation bI = new BrowserImplementation();
		bI.startApp();
		bI.quit();
		System.out.println("Closed Browser1 Successfully");
		bI.startApp("Edge");
		bI.quit();
		System.out.println("Closed Browser2 Successfully");
		bI.startApp("FireFox");
		bI.quit();
		System.out.println("Closed Browser3 Successfully");

	}

}
