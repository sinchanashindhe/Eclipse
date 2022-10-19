package variables.com.xworkz.programs.Eclipse;
import variables.com.xworkz.programs.boot.TextTile;


public class TextileShopRunner {

	public static void main(String[] args) {
		
		TextTile textileShop=new TextTile("Raghavendra");
		System.out.println(textileShop.OwnerName);

		TextTile textileShop1=new TextTile("Raghavendra", "Ramya");
		System.out.println(textileShop1.OwnerName);
		System.out.println(textileShop1.OwnerWifeName);
		
		TextTile textileShop2=new TextTile("Raghavendra", "Ramya", "Vanitha");
		System.out.println(textileShop2.OwnerName);
		System.out.println(textileShop2.OwnerWifeName);
		System.out.println(textileShop2.OwnerDaughterName);
		
		TextTile textileShop3=new TextTile("Raghavendra", "Ramya", "Vanitha", 9723435637L);
		System.out.println(textileShop3.OwnerName);
		System.out.println(textileShop3.OwnerWifeName);
		System.out.println(textileShop3.OwnerDaughterName);
		System.out.println(textileShop3.OwnerDaughterNumber);
		
		TextTile textileShop4=new TextTile("Raghavendra", "Ramya", "Vanitha", 9723435637L,3);
		System.out.println(textileShop4.OwnerName);
		System.out.println(textileShop4.OwnerWifeName);
		System.out.println(textileShop4.OwnerDaughterName);
		System.out.println(textileShop4.OwnerDaughterNumber);
		System.out.println(textileShop4.OwnersNoofWifes);
		
		TextTile textileShop5=new TextTile("Raghavendra", "Ramya", "Vanitha", 9723435637L ,3 ,45);
		System.out.println(textileShop5.OwnerName);
		System.out.println(textileShop5.OwnerWifeName);
		System.out.println(textileShop5.OwnerDaughterName);
		System.out.println(textileShop5.OwnerDaughterNumber);
		System.out.println(textileShop5.OwnersNoofWifes);
		System.out.println(textileShop5.ShopNo);
		
		TextTile textileShop6=new TextTile("Raghavendra", "Ramya", "Vanitha", 9723435637L ,3 ,45,6362456312L);
		System.out.println(textileShop6.OwnerName);
		System.out.println(textileShop6.OwnerWifeName);
		System.out.println(textileShop6.OwnerDaughterName);
		System.out.println(textileShop6.OwnerDaughterNumber);
		System.out.println(textileShop6.OwnersNoofWifes);
		System.out.println(textileShop6.ShopNo);
		System.out.println(textileShop6.ContactNo);
		
		TextTile textileShop7=new TextTile("Raghavendra", "Ramya", 3);
		System.out.println(textileShop7.OwnerName);
		System.out.println(textileShop7.OwnerWifeName);
		System.out.println(textileShop7.OwnersNoofWifes);
		
	
	}

}
