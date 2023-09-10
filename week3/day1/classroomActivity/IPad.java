package week3.day1.classroomActivity;

public class IPad extends IOS
{
	
	public void watchMovie() 
	{
		
		System.out.println("Watching Movie from IPad Class");

	}
	
	public static void main(String[] args) 
	{
		
		IPad iPad = new IPad();
		iPad.watchMovie();
		iPad.startApp();
		iPad.increaseVol();
		iPad.shutDown();

		
	}

}
