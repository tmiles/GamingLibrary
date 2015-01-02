package controller;

import java.awt.Dimension;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.*;

import map.Map;
import model.Model;
import states.GameState;
import view.View;

/**
 * Controller of the game (window)
 * 
 * @author Timmy Miles
 * @version Gaming Library v1.0
 *
 */
public class Controller extends JFrame {
	private static final long serialVersionUID = -6483903108494267628L;
	private static Model model;
	private GameState gameState;

	/* Saves */
	private String currentFileName, saveFileName;
	private final static String saveLocation = "res/saves/";
	private final static String saveExtension = ".sav";
	private HashMap<String, GregorianCalendar> saves;
	private static Controller controller;

	/* Panels */
	JPanel mainPanel;
	JPanel menuPanel;
	JMenuBar menuBar;

	public static void main(String[] args) {
		// new ImageLoader();
		new Controller().setVisible(true);
	}

	/**
	 * 
	 * @param Dimension
	 *            of a block
	 */
	public Controller() {
		int answer = JOptionPane.showConfirmDialog(null, "Custom Game?");
		switch (answer) {
		case JOptionPane.YES_OPTION:
		
		case JOptionPane.NO_OPTION:
			
			

		}
		setupModel();
		setupFrame();
		setupPanel();

	}

	/* Setup initialization */

	public void setupModel() {
		this.gameState = GameState.NewGame;
		saves = new HashMap<String, GregorianCalendar>();
		model = Model.getInstance();

	}

	/**
	 * 
	 */
	public void setupPanel() {
		// TODO only add this panel when not loading the game
		this.mainPanel = new JPanel();
		if (this.gameState == GameState.LoadingGame) {
			this.mainPanel.add(new View(Controller.model));
		}
	}

	private void setupFrame() {
		this.setSize(Model.getGridDimension().width
				* Model.getBlockDimension().width,
				Model.getGridDimension().height
						* Model.getBlockDimension().height);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setUpWindowListener();
		this.setUpMouseListener();
		this.setUpKeyListener();
	}

	/**
	 * Sets up the window closing (prompts when closing window)
	 */
	private void setUpWindowListener() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO stop time here
				int answer = JOptionPane.showConfirmDialog(null, "Save?");
				switch (answer) {
				case JOptionPane.YES_OPTION:
					// TODO SAVE DATA here
					Controller.saveFile("");
					break;
				case JOptionPane.CANCEL_OPTION:
					// do nothing
					break;
				case JOptionPane.NO_OPTION:
					System.exit(0); // successfully closed
				}
			}
		});
	}

	private void setUpMouseListener() {

	}

	private void setUpKeyListener() {

	}

	/* Persistence Section */

	/**
	 * Saves the map into the given file name TODO update all the saves
	 * 
	 * @param fn
	 */
	private static void saveFile(String fn) {
		// TODO keep track of all saves i.e. hashmap
		try {
			File f = new File(Controller.saveLocation + fn
					+ Controller.saveExtension);
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(model.getMap());
			/* Closing streams */
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Loads a game's map and puts it into the model
	 * 
	 * @param Filename
	 *            of the save
	 */
	private void loadFile(String fn) {
		try {
			FileInputStream fis = new FileInputStream(new File(
					Controller.saveLocation + fn + Controller.saveExtension));
			ObjectInputStream ois = new ObjectInputStream(fis);
			Controller.model.setMap((Map) ois.readObject());
			this.currentFileName = fn; // assigns the name of the current file
			/* Closing Streams */
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
