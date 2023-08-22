package week1.Assignment;

public class TwoWheeler 
{

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 213454397594783L;
	boolean isPunctured = false;
	String bikeName = "Bajaj Pulsar Neon";
	double runningKM = 25668.40;
	
	public static void main(String[] args) 
	{
		// TwoWheeler details
		System.out.println("/****************** Details of my Bike below: ****************/");
		
		TwoWheeler tW = new TwoWheeler();
		System.out.println("Number of wheels in the Bike: " + tW.noOfWheels);
		System.out.println("Number of Mirrors in the Bike: " + tW.noOfMirrors);
		System.out.println("Chasis Number of the Bike: " + tW.chassisNumber);
		System.out.println("Whether the bike is Punctured ? : " + tW.isPunctured);
		System.out.println("What is the Bike Name : " + tW.bikeName);
		System.out.println("How many Kilometers the Bike has ran: " + tW.runningKM);
			

	}

}
