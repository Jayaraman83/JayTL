package week3.day1.classroomActivity;

public abstract class AndriodTV implements Android
{
	
	public abstract void flashLight();


	@Override
	public void openApp() 
	{
		System.out.println("Only Opening the App here");
		
	}
	
	@Override
	public void playVideo() {
		
		System.out.println("Playing the App here");
		
	}
	
}
