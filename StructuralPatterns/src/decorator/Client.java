package decorator;

public class Client {
	public static void main(String[] args) {
		NormalCoffeeMachine normal = new NormalCoffeeMachine();
		EnhancedCoffeeMachine enhance = new EnhancedCoffeeMachine(normal);

		normal.makeSmallCoffee();
		normal.makeLargeCoffee();
		enhance.makeSmallCoffee();
		enhance.makeLargeCoffee();
		enhance.makeMilkCoffee();
	}
}
