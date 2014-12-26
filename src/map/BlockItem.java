package map;

import java.awt.Point;

/**
 * Block item 
 * @author Timmy Miles
 * @version Gaming Library v1.0
 *
 */
public class BlockItem {
	private boolean isUnique;
	private Point location;
	private String name;
	/**
	 * 
	 * @param locatin of block
	 * @param name of the block item
	 * @param if item is unique or not
	 */
	public BlockItem(Point p, String s, boolean i){
		this.location = p;
		this.name = s;
		this.isUnique = i;
	}

	
	// getters
	/**
	 * @return if block is unique or not
	 */
	public boolean isUnique() {
		return isUnique;
	}

	/**
	 * @return the location
	 */
	public Point getLocation() {
		return location;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
	

}
