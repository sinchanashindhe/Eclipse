package variables.com.xworkz.programs.boot;
import variables.com.xworkz.programs.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate Details= new Chocolate();
		System.out.println("Printing The Default Values");
		System.out.println(Details.Name);
		System.out.println(Details.Brand);
		System.out.println(Details.price);
		System.out.println(Details.Flavour);
		
		Details.Name="Cadbury";
		Details.Brand="Dairy Milk";
		Details.price=120;
		Details.Flavour="Caramel";
		
		System.out.println("Printing All Instance values");
		System.out.println(Details.Name);
		System.out.println(Details.Brand);
		System.out.println(Details.price);
		System.out.println(Details.Flavour);

	}

}