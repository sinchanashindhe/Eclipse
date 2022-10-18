package variables.com.xworkz.programs.boot;
public class Bakery {

	public String name;
	public String ownerName;
	public int stalNumber;
	public double cakePrice;
	public long mobileNumber;
	public String[] flavor;
	public String[] colour;
	public int[] priceList;
	public String[] biscketName;
	public String[] pupfs;
	public long[] mobileNo;

	public Bakery(String name, String ownerName, int stalNumber, double cakePrice, long mobileNumber, String[] flavor,
			String[] colour, int[] priceList, String[] biscketName, String[] pups, long[] mobileNo) {
		this.name = name;
		this.ownerName = ownerName;
		this.stalNumber = stalNumber;
		this.cakePrice = cakePrice;
		this.mobileNumber = mobileNumber;
		this.flavor = flavor;
		this.colour = colour;
		this.priceList = priceList;
		this.biscketName = biscketName;
		this.pupfs = pups;
		this.mobileNo = mobileNo;

		
		
	}
	
	public void display(){
	System.out.println(this.name);
	System.out.println(this.ownerName);
	System.out.println(this.stalNumber);
	System.out.println(this.cakePrice);
	System.out.println(this.mobileNumber);
	System.out.println("tasty");
	
	System.out.println("No of Flavors");
	System.out.println("creamy");
	
	for (int i = 0; i < flavor.length; i++) {
		String ref = flavor[i];
		System.out.println(ref);
	}
	System.out.println("");

	System.out.println("No of colour");
	System.out.println("*************");
	for (int i = 0; i < colour.length; i++) {
		String ref = colour[i];
		System.out.println(ref);
	}
	System.out.println("*************");
	System.out.println("price list of cakes");
	System.out.println("*************");
	for (int i = 0; i < priceList.length; i++) {
		int ref = priceList[i];
		System.out.println(ref);
	}
	System.out.println("*************");
	System.out.println("Different type of biscket");
	System.out.println("*************");
	for (int i = 0; i < biscketName.length; i++) {
		String ref = biscketName[i];
		System.out.println(ref);
	}
	System.out.println("*************");
	System.out.println("Different type of pupfs");
	System.out.println("*************");
	for (int i = 0; i < pupfs.length; i++) {
		String ref = pupfs[i];
		System.out.println(ref);
	}
	System.out.println("*************");
	System.out.println("No of mobile number");
	System.out.println("*************");
	for (int i = 0; i < mobileNo.length; i++) {
		long ref = mobileNo[i];
		System.out.println(ref);
	}
	System.out.println("*************");
	System.out.println("print the constructer values");


}
}

