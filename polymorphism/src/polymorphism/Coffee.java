package polymorphism;

public class Coffee implements Drinkable{
	
	@Override
	public void drink() {
		System.out.println("put some sugar");
		System.out.println("Stir it well");
		System.out.println("Now Enjoy the coffee...");
	}

}