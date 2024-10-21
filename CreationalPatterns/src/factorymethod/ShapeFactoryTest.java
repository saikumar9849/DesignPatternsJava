package factorymethod;

public class ShapeFactoryTest {
	static ShapeFactory factory = new ShapeFactory();
	static Shape roundFood = factory.getFood("Round");
	static Shape cylinderFood = factory.getFood("Cylinder");

	public static void main(String args[]) {
		System.out.println("Round".equals(roundFood.getShape()));
		System.out.println("Cylinder".equals(cylinderFood.getShape()));
	}
}
