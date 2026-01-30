package polymorphism;

public class Juice implements Drinkable{
	
	@Override
	public void drink() {
		System.out.println("put straw");
		System.out.println("Now Enjoy the juice...");
	}

}