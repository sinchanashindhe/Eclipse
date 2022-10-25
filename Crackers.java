package variables.com.xworkz.programs.boot;

public class Crackers {
	public static String brand;
	public int price;
	public String name="saraPataki";
	public int noOfPieces;
	public boolean makeSound;


	static {
		Crackers.brand = "generic";
    	}

	public  Crackers(int price)
	{
		this.price=price;
	}
	
	public void SetNoOfPrice(int noOfPieces )
	{
		this.noOfPieces=noOfPieces;
	}
	
	public void display()
	{
	System.out.println(Crackers.brand);	
	System.out.println(this.price);	
	System.out.println(this.noOfPieces);	
	System.out.println(this.name);	
	System.out.println(this.makeSound);	
		
	}
}

