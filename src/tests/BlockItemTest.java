package tests;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

import map.BlockItem;

/**
 * Block item junit test
 * @author Timmy Miles
 * @version Gaming Library v1.0
 *
 */
public class BlockItemTest {

	@Test
	public void blockItemTest() {
		BlockItem bi = new BlockItem(new Point(), "", true);
		assertEquals(new Point(), bi.getLocation());
		assertEquals("", bi.getName());
		assertEquals(true, bi.isUnique());
	}

}
