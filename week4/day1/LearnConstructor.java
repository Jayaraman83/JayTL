package week4.day1;

public class LearnConstructor 
{

	int empId;
	String empName;
	boolean empStatus;

	
	public LearnConstructor()
	{
		System.out.println("In Constructor");
	}

	public static void main(String[] args) 
	{		
		LearnConstructor lc = new LearnConstructor();
		System.out.println(lc.empId + "  " + lc.empName +" " + lc.empStatus);
		
		
	}
	
}
