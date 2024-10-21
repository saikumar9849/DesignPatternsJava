package decorator;

public class EnhancedCoffeeMachine implements CoffeeeMachine {

	private NormalCoffeeMachine machine;

	public EnhancedCoffeeMachine(NormalCoffeeMachine machine) {
		this.machine = machine;
	}

	// Override behavior
	@Override
	public void makeSmallCoffee() {
		System.out.println("Enhanced Coffee Machine: Making small coffee");
	}

	// unaltered behavior
	@Override
	public void makeLargeCoffee() {
		machine.makeLargeCoffee();
	}

	// Extended Behavior
	public void makeMilkCoffee() {
		System.out.println("Enhanced Coffee Machine: Making milk coffee");
		machine.makeLargeCoffee();
		System.out.println("Enhanced Coffee Machine: Adding sugar");
	}

}
