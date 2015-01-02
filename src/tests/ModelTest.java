package tests;

import static org.junit.Assert.assertEquals;

import java.awt.Dimension;

import model.Model;

import org.junit.Test;
/**
 * Model junit test
 * @author Timmy Miles
 * @version Gaming Library v1.0
 *
 */
public class ModelTest {

	@Test
	public void modelTest() {
		Model m = Model.getInstance();
		assertEquals(new Dimension(), m.getBlockDimension());
		assertEquals(new Dimension(), m.getGridDimension());
		assertEquals(null, m.getMap());
		m.setupMap(); // creates a map
		m.setMap(null);
		assertEquals(null, m.getMap());
		
	}
	

}
