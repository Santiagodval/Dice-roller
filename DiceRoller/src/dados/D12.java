package dados;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class D12 extends Dice{

	public static BufferedImage getImage() {
		
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("D12.png"));
		} catch (IOException e) {
		}
		
		return img;
	}
	
	public static BufferedImage getScaledImage(int w, int h) {
		
		 BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		    Graphics2D g2 = resizedImg.createGraphics();

		    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		    g2.drawImage(getImage(), 0, 0, w, h, null);
		    g2.dispose();

		    return resizedImg;
		
	}
	
	public static int getSides() {
		// TODO Auto-generated method stub
		return 12;
	}	
	
	public static int roll() {
		// TODO Auto-generated method stub
		return (int)(Math.random() * getSides() + 1);
	}

}