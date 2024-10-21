package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Equipment {
	private List<Equipment> equipments = new ArrayList<>();

	public Composite(String name) {
		super(name, 0);
	}

	public Composite add(Equipment equipment) {
		equipments.add(equipment);
		return this;
	}

	@Override
	public int getPrice() {
		int sum = 0;
		for (Equipment e : equipments) {
			sum += e.getPrice();
		}
		return sum;
	}
}
