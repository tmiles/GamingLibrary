package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import map.Block;
import map.Map;
import model.Model;

public class View extends JPanel implements Observer {
	private static final long serialVersionUID = -2357314930943151416L;
	private Model model;
	private Map map; // to speed up

	/**
	 * Constructor
	 * 
	 * @param model
	 */
	public View(Model m) {
		this.model = m;
		this.map = m.getMap(); // might still be null
		/* Creating size of panel as blockDimensions x gridDimensions */
		int panelWidth = m.getBlockDimension().width
				* m.getGridDimension().width;
		int panelHeight = m.getBlockDimension().height
				* m.getGridDimension().height;
		this.setSize(new Dimension(panelWidth, panelHeight));
	}

	/**
	 * Updating the map
	 * 
	 * @param Observable
	 *            (map)
	 * @param object
	 *            passed in
	 */
	@Override
	public void update(Observable obs, Object arg1) {
		this.model = (Model) obs; // update the model
		this.map = model.getMap(); // update the map
		this.repaint(); // repaint
	}

	/**
	 * paint aspect of map
	 * 
	 * @param graphics
	 *            context
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Optimized drawing
		Graphics2D g2 = (Graphics2D) g;
		/*
		 * Draw images and stuff here
		 */
		for(Point p: this.map.getBlocks().keySet()){ // got through all points
			this.drawBlock(g2, this.map.getBlocks().get(p));
		}

	}
	/**
	 * Draws an individual block
	 * @param graphics context
	 * @param block to draw
	 */
	private void drawBlock(Graphics2D g, Block b){
		// goes though array list of blocks to update
		for(String s: b.getBlockItems().keySet()){
			if(s.compareToIgnoreCase("terrain") == 0.0){ // draw special terrain
				
			}else if(s.compareToIgnoreCase("citizen") == 0.0){ // draw special citizen
				
			}else if(s.compareToIgnoreCase("building") == 0.0){
				
			}
		}
	}

}
