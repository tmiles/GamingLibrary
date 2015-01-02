package model;

import java.awt.Dimension;
import java.util.Observable;

import map.Map;
import view.View;
/**
 * Model of the game
 * Uses Observerable/Observer model
 * @author Timmy Miles
 * @version Gaming Library v1.0
 *
 */
public class Model extends Observable{
	private static Dimension gridDimension, blockDimension;
	private static Map map;
	private static Model model = null;
	private static View viewPanel;
	
	/**
	 * @param grid dimension
	 * @param block dimension
	 */
	private Model(Dimension d, Dimension d1){
		Model.gridDimension = d;
		Model.blockDimension = d1;
		this.setupObservers();
	}
	
	/**
	 * Singleton method
	 * @return the single instance of model
	 */
	public static Model getInstance(){
		if(Model.model == null){
			// Creates new model
			Model.model = new Model(new Dimension(), new Dimension());
			setupMap();
		}
		return model;
	}
	public static void setupMap(){
		Model.map = new Map(gridDimension, blockDimension); // generate map
	}
	/**
	 * returns the map used in the model
	 * @return the map
	 */
	public static Map getMap(){
		return Model.map;
	}
	public static void setMap(Map m){
		Model.map = m;
	}
	
	public static Dimension getGridDimension(){
		return Model.gridDimension;
	}
	public static Dimension getBlockDimension(){
		return Model.blockDimension;
	}
	
	/* Observable pattern */
	public void setupObservers(){
		viewPanel = new View(model);
		this.addObserver(viewPanel);
	}
}

