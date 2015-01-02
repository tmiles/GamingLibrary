package tests;

import java.awt.Dimension;
import java.io.IOException;

import org.junit.Test;

import resourceLoader.ImageLoader;

public class ImageLoaderTest {
	@Test
	public void test() {
		new ImageLoader();
	}

	@Test
	public void exceptionTest() {
		try {
			ImageLoader.loadSprites("null", new Dimension(10, 10));
		} catch (IOException e) {
		}
	}

}
