package variables.com.xworkz.programs.boot.Eclipse;

public class Furniture {
	public static void main(String[] args) {
		 String  [] shoplocations= {"Banglore","Chitradurga","Hosadurga","Mysore","Chikkamagaluru"};
		 String [] shopeWorkerName= {"nagaraj","Bhuvanesh","Rajanna","Bhadrinath","Manjunath"};
		 int [] shopeWorkerId= {100,200,3001,4001,5001};
		 String []  furniturs= {"Chair","Table","Beer","Cobod"};
		 String []  accerices= {"Iron Sheet","Welding machine","Current","Gascutter","lath"};
		
		 Furniture furniture=new Furniture("MANJUNATH", shopeWorkerName, "nagaraj", shopeWorkerId, "1k1568", "Banglore", furniturs, 50, accerices, true, shoplocations);
		
		 furniture.display();
	}
}
