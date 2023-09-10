	package week3.day1.Abstraction;

	public class SBIBank implements RBI 
	{

		@Override
		public void knowYourCustomer() 
		{
			
			System.out.println("ADHAAR is Mandatory");
		}

		@Override
		public void withDrawalLimit() 
		{
			
			System.out.println("500000");
			
		}
		
		//This SBIBank can have their own methods other than the methods from RBI Interface 
		public void goldLoan() 
		{
			System.out.println("5% is the Interest Rate");

		}

		

	}


