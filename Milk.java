package variables.com.xworkz.programs.boot;

public class Milk {
	public static String name;
	public String brand;
	public int price;
	public double quantity=100.2;
	public int expiryInDays;
	
	
	static {
		Milk.name ="nandini";
	}

	
	
	public Milk(String brand)
	{
		this.brand=brand;
		
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public void display()
	{
		System.out.println(Milk.name);
		System.out.println(this.brand);
		System.out.println(this.quantity);
		System.out.println(this.price);
		System.out.println(this.expiryInDays);
		
	}
	
	
	


}
