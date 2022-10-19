<<<<<<< HEAD
package variables.com.xworkz.programs.Eclipse;
import variables.com.xworkz.programs.Eclipse.*;
import variables.com.xworkz.programs.boot.Bakery;
public class BakeryRunner {

	public static void main(String[] args) {
		String[] item = { "Chacolate", "Venella", "Strabery", "Butter Skacth" };
		String[] temp = { "Red", "Orange", "yellow", "pink" };
		int[] value = { 500, 300, 433, 550, 600 };
		String[] teast = { "Parlege", "20-20", "Gudde", "Maari", "Britaniya" };
		String[] pupfs = { "Onian", "Tomato", "potato", "chilly" };
		long[] no = { 8861539422l, 9741627422l, 9874563214l, 9638527412l };

		Bakery bakery = new Bakery("Appu bakery", "uday", 10, 900, 8754698745l, item, temp, value, teast, pupfs, no);
		System.out.println(bakery.name);
		System.out.println(bakery.ownerName);
		System.out.println(bakery.stalNumber);
		System.out.println(bakery.cakePrice);
		System.out.println(bakery.mobileNumber);
		System.out.println(bakery.flavor);
		System.out.println(bakery.colour);
		System.out.println(bakery.priceList);
		System.out.println(bakery.biscketName);
		System.out.println(bakery.pupfs);
		System.out.println(bakery.mobileNo);
		bakery.display();

		Bakery bakery2 = new Bakery("AS bekary", "raj", 5, 700, 6544698745l, item, temp, value, teast, pupfs, no);
		bakery2.display();

	}



	}


=======
package variables.com.xworkz.programs.Eclipse;
import variables.com.xworkz.programs.Eclipse.*;
import variables.com.xworkz.programs.boot.Bakery;
public class BakeryRunner {

	public static void main(String[] args) {
		String[] item = { "Chacolate", "Venella", "Strabery", "Butter Skacth" };
		String[] temp = { "Red", "Orange", "yellow", "pink" };
		int[] value = { 500, 300, 433, 550, 600 };
		String[] teast = { "Parlege", "20-20", "Gudde", "Maari", "Britaniya" };
		String[] pupfs = { "Onian", "Tomato", "potato", "chilly" };
		long[] no = { 8861539422l, 9741627422l, 9874563214l, 9638527412l };

		Bakery bakery = new Bakery("Appu bakery", "uday", 10, 900, 8754698745l, item, temp, value, teast, pupfs, no);
		System.out.println(bakery.name);
		System.out.println(bakery.ownerName);
		System.out.println(bakery.stalNumber);
		System.out.println(bakery.cakePrice);
		System.out.println(bakery.mobileNumber);
		System.out.println(bakery.flavor);
		System.out.println(bakery.colour);
		System.out.println(bakery.priceList);
		System.out.println(bakery.biscketName);
		System.out.println(bakery.pupfs);
		System.out.println(bakery.mobileNo);
		bakery.display();

		Bakery bakery2 = new Bakery("AS bekary", "raj", 5, 700, 6544698745l, item, temp, value, teast, pupfs, no);
		bakery2.display();

	}



	}


>>>>>>> fb1a3bb9775bce9f33b682476879b15282785c40
