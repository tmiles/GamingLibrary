package resourceLoader;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.imageio.ImageIO;

/**
 * Basic image loading code to load all images before the beginning of the
 * program TODO create a progress bar when this runs
 * 
 * @author Timmy Miles
 * @version GameLibrary V1.0
 *
 */
public class ImageLoader {
	public static HashMap<String, ArrayList<BufferedImage>> images;
	private static final String directory = "res/images/";

	public ImageLoader() {
		ImageLoader.images = new HashMap<String, ArrayList<BufferedImage>>();
		try {
			loadSprites("citizen.png", new Dimension(16, 22));
		} catch (IOException e) {
			System.out.println("Couldn't read file");
			System.exit(1);
		}
	}

	/**
	 * Takes in the dimensions of all the images
	 * 
	 * @param fn
	 * @param dimension
	 *            of the sub image
	 */
	public static void loadSprites(String fn, Dimension d) throws IOException {
		BufferedImage img = ImageIO.read(new File(directory + fn));
		ArrayList<BufferedImage> images = new ArrayList<BufferedImage>();
		for (int i = 0; i <= img.getHeight(null) - d.height; i += d.height) {// height
			for (int j = 0; j <= img.getWidth(null) - d.width; j += d.width) { // width
				images.add(img.getSubimage(j, i, d.width, d.height));
			}
		}
		ImageLoader.images.put(fn.substring(0, fn.length() - 4), images);
	}

}
