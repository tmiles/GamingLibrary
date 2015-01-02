package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import states.GameState;

public class GameStateTest {

	@Test
	public void gameStateTest() {
		GameState[] states = GameState.values();
		assertEquals(7, states.length);
		assertEquals(0, GameState.ImageLoading.getValue());
		assertEquals("Loading Images", GameState.ImageLoading.getName());
		assertEquals(GameState.ImageLoading, GameState.valueOf(GameState.ImageLoading.toString()));
	} 

}
