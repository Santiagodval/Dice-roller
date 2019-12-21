package dados;


import java.awt.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;

public class Dice {
	
	/*public int topSide;
	
	public int getTopSide() {
		return topSide;
	}*/
	
	/////////////////////////////////////////////////////
	//												   //
	//  Every instance has a image, a number of sides  //
	//  and the capacity to be rolled                  //
	//												   //
	/////////////////////////////////////////////////////
	
	public static BufferedImage getImage() {
		
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("D6.png")); //método simple, obtiene la imagen respectiva al dado
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
		return 1;
	}

	public static int roll() {
		// TODO Auto-generated method stub
		return (int)(Math.random() * getSides() + 1);
	}
}
