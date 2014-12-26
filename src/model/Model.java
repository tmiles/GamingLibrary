package model;

import java.awt.Dimension;
import java.util.Observable;

import map.Map;
/**
 * Model of the game
 * Uses Observerable/Observer model
 * @author Timmy Miles
 * @version Gaming Library v1.0
 *
 */
public class Model extends Observable{
	private Dimension gridDimension, blockDimension;
	private Map map;
	public Model(Dimension d, Dimension d1){
		this.gridDimension = d;
		this.blockDimension = d1;	
	}
	public void setupMap(){
		this.map = new Map(gridDimension, blockDimension); // generate map
	}
	
	/**
	 * returns the map used in the model
	 * @return the map
	 */
	public Map getMap(){
		return this.map;
	}
	
	public Dimension getGridDimension(){
		return this.gridDimension;
	}
	public Dimension getBlockDimension(){
		return this.blockDimension;
	}
}

