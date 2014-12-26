package controller;

import java.awt.Dimension;

import javax.swing.JFrame;

import model.Model;
/**
 * Controller of the game (window)
 * @author Timmy Miles
 * @version Gaming Library v1.0
 *
 */
public class Controller extends JFrame {
	private static final long serialVersionUID = -6483903108494267628L;
	private Model model;

//	public static void main(String[] args) {
//		new Controller(new Dimension(20, 20)).setVisible(true);
//	}

	/**
	 * 
	 * @param Dimension
	 *            of a block
	 * @param
	 */
	public Controller(Dimension dimension) {
		setupModel();
		setupFrame();
		setupPanel();

	}

	/* Setup initialization */

	public void setupModel() {
		model = new Model(new Dimension(40, 40), new Dimension(20, 20));
	}

	/**
	 * 
	 */
	public void setupPanel() {
		
	}

	public void setupFrame() {
		this.setSize(
				this.model.getGridDimension().width
						* this.model.getBlockDimension().width,
				this.model.getGridDimension().height
						* this.model.getBlockDimension().height);
	}

}

