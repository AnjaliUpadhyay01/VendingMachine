package polymorphism;

public class Coke implements Drinkable{
	
	@Override
	public void drink() {
		System.out.println("Open the cap");
		System.out.println("Now Enjoy the coke...");
	}

}