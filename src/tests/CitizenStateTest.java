package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import states.CitizenState;

public class CitizenStateTest {

	@Test
	public void gameStateTest() {
		CitizenState[] states = CitizenState.values();
		assertEquals(5, states.length);
		assertEquals(0, CitizenState.Idle.getValue());
		assertEquals("Idle", CitizenState.Idle.getName());
		assertEquals(CitizenState.Idle, CitizenState.valueOf(CitizenState.Idle.toString()));
	} 

}
