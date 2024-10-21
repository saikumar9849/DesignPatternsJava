package flyweight;

public class Fighter implements Sprite {
	private FighterRank rank;

	public Fighter(FighterRank rank) {
		this.rank = rank;
	}

	public FighterRank getRank() {
		return rank;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Fighter");
	}

	@Override
	public void move(int x, int y) {
		System.out.println("Moving Fighter to " + x + ", " + y);
	}

}
