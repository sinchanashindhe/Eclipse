package com.xworkz.principal;

public class InvitationRunner {

	
		public static void main(String[] args) {
			
			Invitation invitation1=new WeddingInvitation("openType", 50, "greeting");
			System.out.println(invitation1.patterns);
			System.out.println(invitation1.price);
			System.out.println(invitation1.usedfor);
			
			

		
	}

}
