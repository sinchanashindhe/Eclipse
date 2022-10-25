package variables.com.xworkz.programs.boot;

public class Saloon {
	public static String shopName;
	public int shopNo;
	public long contactNo=789654790;
	public String ownerName;
	public boolean good;
	
	static {
		Saloon.shopName="sushanth Saloon";
	}

	public Saloon(int shopNo) {
		this.shopNo = shopNo;

	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;

	}

	public void display() {
		System.out.println(Saloon.shopName);
		System.out.println(this.contactNo);
		System.out.println(this.shopNo);
		System.out.println(this.ownerName);
		System.out.println(this.good);

	}

}

