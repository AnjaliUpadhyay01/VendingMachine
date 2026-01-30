package polymorphism;

import java.util.Scanner;

public class VendingMachine {
	public   Drinkable     pressButton() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1==> For Coffee");
		System.out.println("Press 2==> For Juice");
		System.out.println("Press 3==> For Coke");
		System.out.println("Press 4==> For Wine");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected Coffee..");
			System.out.println("It is being prepared...");
			Coffee c=new Coffee();
		return c;
		}else if(choice==2) {
			System.out.println("You have selected Juice..");
			System.out.println("It is being prepared...");
		return new Juice();
			
		}else if(choice==3) {
			System.out.println("You have selected Coke..");
			System.out.println("Coke is being provided...");
		return new Coke();
			
		}else if(choice==4) {
			System.out.println("You have selected Wine..");
			System.out.println("It is being prepared...");
		return new Wine();	
		}else {
			System.out.println("Invalid Option pressed!");
			return pressButton();
		}
	}

}
