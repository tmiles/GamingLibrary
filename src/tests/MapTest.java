package tests;

import static org.junit.Assert.assertEquals;

import java.awt.Dimension;
import java.awt.Point;

import map.Map;

import org.junit.Test;
/**
 * Map junit test
 * @author Timmy Miles
 * @version Gaming Library v1.0
 *
 */
public class MapTest {

	@Test
	public void test() {
		Map m = new Map(new Dimension(10,10), new Dimension(10,10));
		assertEquals(new Dimension(10,10), m.getDimension());
		m.setDimension(new Dimension(20,20));
		assertEquals(new Dimension(20,20), m.getDimension());	
		assertEquals(null, m.getBlocks().get(new Point()));
	}
	
}
