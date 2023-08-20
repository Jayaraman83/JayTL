package week1.day2;

public class LearnForLoops 
{

	public static void main(String[] args) 
	{
		
		//Printing 10 numbers --> When you have to do certain task in multiple iterations - For Loop
		//type for --> ctrl + space  --> Enter --> click on 2nd options --> Enter
		//datatype variable = starting point; variable operator  terminating point; increment / decrement 
		for (int i = 0; i < 7; ++i) 
		{
			
			System.out.println(i);
			
		}
		
		
		for (int j = 20; j >= 3; j--) 
		{
			
			System.out.println(j);
			
		}
		
		//if i find i ==3 ; stop the iteration
		for (int i = 0; i < 10; i++) 
		{
			
			if(i==3)
			{
				
				System.out.println("Reached Three");
				//break;
				continue;
			}
			
			System.out.println(i);
		
		}
		
		System.out.println("Out of the For Loop	");
		
			
	}
			

}

