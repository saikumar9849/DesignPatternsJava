package prototype;

public class Car extends Vehicle {
	private String color;

	public Car(int wheels, long price, String color) {
		this.wheels = wheels;
		this.price = price;
		this.color = color;
	}

	public Car(Car target) {
		super(target);
		if (target != null) {
			this.color = target.color;
		}
	}

	@Override
	public Vehicle clone() {
		return new Car(this);
	}

	@Override
	public boolean isClone(Vehicle target) {
		if (target instanceof Car) {
			Car t = (Car) target;
			if (t.color.equals(color) && t.wheels == wheels && t.price == price) {
				System.out.println(this + " and " + t + " are clones");
				return true;
			}
		}
		System.out.println(this + " and " + target + " are NOT clones");
		return false;
	}

}
