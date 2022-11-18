package task;

public class stringpalindrome {

	public static void main(String[] args) {
		
		String str = "aba" , reversestr ="";

		

	    for (int i =str.length()-1; i >=0; i--) {
	    	char ch=str.charAt(i);
	    
	      reversestr = reversestr + ch;
	    }
		System.out.println(reversestr);
	    if (str.equals(reversestr)) {
	      System.out.print( " is a Palindrome String.");
	    }
	    else {
	      System.out.println(  " is not a Palindrome String.");
	    }
	  }
	}
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	

