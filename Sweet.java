package variables.com.xworkz.programs.boot;

public class Sweet {
	public static String shopName;
	public String type;
	public int price;
	public String shape="round";
	public boolean tasty;
	
	static {
		Sweet.shopName="savi bekary";
	}	
				
	public Sweet(String type) {
		this.type=type;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	
 public void display()
 {
	System.out .println(Sweet.shopName);
	System.out .println(this.type);
	System.out .println(this.price);
	System.out .println(this.shape);
	System.out .println(this.tasty);
	 
 }
 
}

