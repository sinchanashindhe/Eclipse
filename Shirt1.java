package variables.com.xworkz.programs.boot;

public class Shirt1 {
	public static String name;
	public String brand;
	public int price;
	public String colors="black";
	public boolean fit;
	
	
	static {
		Shirt1.name ="printed";
	}

	
	
	public Shirt1 (String brand)
	{
		this.brand=brand;
		
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public void display()
	{
		System.out.println(Shirt1.name);
		System.out.println(this.brand);
		System.out.println(this.colors);
		System.out.println(this.price);
		System.out.println(this.fit);
		
	}
	
	
	


}

