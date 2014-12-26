package tests;

import static org.junit.Assert.assertEquals;

import java.awt.Dimension;
import java.awt.Point;

import map.*;

import org.junit.Test;
/**
 * Block junit test
 * @author Timmy Miles
 * @version Gaming Library v1.0
 *
 */
public class BlockTest {

	@Test
	public void testInitializationTest() {
		Block b = new Block(new Point(), new Dimension());
		assertEquals(new Point(), b.getLocation());
		assertEquals(new Dimension(), b.getDimension());
		assertEquals(true, b.getBlockItems().isEmpty());
		assertEquals(null, b.getBlockItem(""));
	}

	@Test
	public void testAdderTest(){
		Block b = new Block(new Point(), new Dimension());

		// adding unique items
		Terrain t = new Terrain(new Point());
		assertEquals(null, b.getBlockItem(t.getName()));
		assertEquals(true, b.addBlockItem(t.getName(), t));
		assertEquals(1, b.getBlockItem(t.getName()).size());
		assertEquals("Terrain", b.getBlockItem(t.getName()).get(0).getName());
		Terrain t1 = new Terrain(new Point());
		assertEquals(false, b.addBlockItem(t1.getName(), t1)); // can't add because it's unique
		assertEquals(1, b.getBlockItem(t.getName()).size()); // because second block isn't added
		// adding non - unique block items
		Citizen c = new Citizen(new Point());
		assertEquals(true, b.addBlockItem(c.getName(), c));
		Citizen c1 = new Citizen(new Point());
		assertEquals(true, b.addBlockItem(c.getName(), c1));
		assertEquals(2, b.getBlockItem(c.getName()).size());
	}
}
