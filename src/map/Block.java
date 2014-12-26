package map;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Represents the basic block (structure of the map)
 * 
 * @author Timmy Miles
 * @version GamingLibrary v1.0
 */
public class Block {
	private Point location;
	private Dimension dimension;
	/* Insert objects here */
	private HashMap<String, ArrayList<? extends BlockItem>> blockItems;

	// basic structure with all the objects

	/**
	 * Constructor
	 * 
	 * @param block
	 *            's locatino
	 * @param dimension
	 *            of block
	 */
	public Block(Point p, Dimension d) {
		this.blockItems = new HashMap<String, ArrayList<? extends BlockItem>>();
		this.location = p;
		this.dimension = d;
	}

	/* Getter Methods */

	/**
	 * Gets the location of the block
	 * 
	 * @return the block's location
	 */
	public Point getLocation() {
		return this.location;
	}

	/**
	 * Getter method for dimension
	 * 
	 * @return the dimension
	 */
	public Dimension getDimension() {
		return this.dimension;
	}

	/**
	 * Gets all of the block items
	 * 
	 * @return hashmap structure involved in storing all story blocks
	 */
	public HashMap<String, ArrayList<? extends BlockItem>> getBlockItems() {
		return this.blockItems;
	}

	/**
	 * Gets all of the same block item type
	 * 
	 * @param string
	 *            for item type
	 * @return an arraylist of all the block elements
	 */
	public ArrayList<? extends BlockItem> getBlockItem(String s) {
		return this.blockItems.get(s);
	}

	/* Adders */
	public <T extends BlockItem> boolean addBlockItem(String s, T o) {
		// Type doesn't exists (initialize array list)
		if (!this.blockItems.containsKey(s)) {
			ArrayList<T> objects = new ArrayList<T>();
			objects.add(o);
			this.blockItems.put(s, objects);
			return true;
		} else { // contains the string
			if (this.blockItems.get(s).get(0).isUnique()) {// check if item can
				return false; // can't add because is unique
			} else { // not unique, add to arraylist
				@SuppressWarnings("unchecked")
				ArrayList<T> objects = (ArrayList<T>) this.blockItems.get(s);
				objects.add(o); // adds to list
				this.blockItems.put(s, objects);
				return true;
			}
		}

	}
}
