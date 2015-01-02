package states;

/**
 * Game states
 * 
 * @author Timmy Miles
 * @version Game Library V1.0
 *
 */
public enum GameState {
	ImageLoading(0, "Loading Images"), NewGame(1, "New Game"), LoadingGame(2,
			"Loading Game"), SavingGame(3, "Saving Game"), PlayingGame(4,
			"Playing Game"), GameLost(5, "Game Loss"), GameWin(6, "Game Win");
	private int value;
	private String name;

	/**
	 * Constructor for enumerated type
	 * 
	 * @param value
	 * @param description
	 */
	private GameState(int i, String s) {
		this.value = i;
		this.name = s;
	}

	/**
	 * Gets the value of the type
	 * 
	 * @return value
	 */
	public int getValue() {
		return this.value;
	}

	/**
	 * Gets the description of the enumerated type
	 * 
	 * @return description of the state
	 */
	public String getName() {
		return this.name;
	}
}
