package task;

public class SwapFirstNameAndLastName {

	 public static void main(String[] args) {
	        String name="Sani Kamal Hasan'";
	        System.out.println("Before Swap:\n"+name);
	        String firstName=name.substring(0,name.indexOf(" "));
	        String lastName=name.substring(name.indexOf(" "));
	        String swapName=lastName+" "+firstName;
	        System.out.println("After Swap:\n"+swapName);

	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


