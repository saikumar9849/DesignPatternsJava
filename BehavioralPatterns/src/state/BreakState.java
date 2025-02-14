package state;

public class BreakState extends State {

	public BreakState(Game game) {
		super(game);
		System.out.println("-- Game in Break state --");
	}

	@Override
	public void onWelcomeScreen() {
		System.out.println("Not allowed.");
	}

	@Override
	public void onPlaying() {
		game.changeState(new EndGameState(game));
	}

	@Override
	public void onBreak() {
		System.out.println("Currently on Break state");
	}

	@Override
	public void onEndGame() {
		System.out.println("Not allowed.");
	}

}
