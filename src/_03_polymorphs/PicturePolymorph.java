package _03_polymorphs;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import javax.imageio.ImageIO;

public class PicturePolymorph extends Polymorph implements ImageObserver{
	BufferedImage image;
	PicturePolymorph(int x, int y) {
		super(x, y);
		loadImage("Apple.png");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
		g.drawImage(image, x, y, width, height, null);
	}

	void loadImage(String imageFile) {
	    
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		
	        } catch (Exception e) {
	            
	        }
	    }
	
	@Override
	public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		return false;
	}

}
