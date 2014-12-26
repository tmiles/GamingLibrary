package map;

import java.awt.Dimension;
import java.awt.Point;
import java.io.Serializable;
import java.util.HashMap;

/**
 * Basic map structure
 * 
 * @author Timmy Miles
 * @version GameLibrary v1.0
 * 
 */
public class Map implements Serializable {
	private static final long serialVersionUID = -3271376398746872724L;

	private Dimension dimension, bDim;
	private HashMap<Point, Block> blocks;

	/**
	 * Accessor method
	 * 
	 * @param dimension of map
	 * @param dimension of the block
	 */
	public Map(Dimension dim, Dimension bDim) {
		this.dimension = dim; 
	
		this.blocks = new HashMap<Point, Block>();
		/* TODO Create map here */
	}

	/* Getters & setters */
	/**
	 * @return the dimension
	 */
	public Dimension getDimension() {
		return dimension;
	}

	/**
	 * @param dimension
	 *            the dimension to set
	 */
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	/**
	 * @return the blocks
	 */
	public HashMap<Point, Block> getBlocks() {
		return blocks;
	}
}