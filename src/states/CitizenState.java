package states;

/**
 * Citzen states
 * 
 * @author Timmy Miles
 * @version Game Library V1.0
 *
 */
public enum CitizenState {
	Idle(0, "Idle"), Working(1, "Working"), Gathering(2, "Gathering"), Moving(3, "Moving"), Recovering(4, "Recovering");
	private int value;
	private String name;

	/**
	 * Constructor for enumerated type
	 * 
	 * @param value
	 * @param description
	 */
	private CitizenState(int i, String s) {
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
