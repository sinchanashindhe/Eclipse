package variables.com.xworkz.programs;

public class FishRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Fish fish=new Fish();
     System.out.println(fish.name);
     System.out.println(fish.type);
     System.out.println(fish.price);
     System.out.println(fish.weight);
     System.out.println(fish.length);
     
    fish=new Fish("gappies");
    System.out.println(fish.name);
    System.out.println(fish.type);
    System.out.println(fish.price);
    System.out.println(fish.weight);
    System.out.println(fish.length);
     
		fish=new Fish(170);
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);
		
		fish=new Fish("30,barb");
     	System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);
		
		fish=new Fish(10);
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);
		
		fish=new Fish("gold fish");
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);
		
		fish=new Fish ("Anchovy,20");
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);
		
		fish=new Fish(22,4);
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);
			
		
	}

}
