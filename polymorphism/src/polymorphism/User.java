package polymorphism;

public class User {
	public static void main(String[] args) {
		VendingMachine vm=new VendingMachine();
		Drinkable d=vm.pressButton();
		d.drink();
	}

}