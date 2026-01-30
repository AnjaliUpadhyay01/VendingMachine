package polymorphism;

public class Wine implements Drinkable{
	
	@Override
	public void drink() {
		System.out.println("put some ice cube");
		System.out.println("now cheer it with other members...");
		System.out.println("Now Enjoy the wine...");
	}

}