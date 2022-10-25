package variables.com.xworkz.programs.boot;

public class Flower {
	public static String name;
	public String colors;
	public String types="china rose";
	public int price;
	public boolean goodSmell;
	
	static {
		
	Flower.name="Rose";	
	}
	
	public Flower(String colors)
	{
		this.colors=colors;
		
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public void display()
	{
		System.out.println(Flower.name);
		System.out.println(this.types);
		System.out.println(this.colors);
		System.out.println(this.price);
		System.out.println(this.goodSmell);
		
	}
	
}

