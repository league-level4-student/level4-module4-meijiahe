package _03_polymorphs;

import java.awt.Graphics;

public class CirclePolymorph extends Polymorph{
	int angle = 0;

	CirclePolymorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		angle++;
		g.drawRect((int) (x+Math.sin(angle)),(int) (y+Math.cos(angle)), 60, 60);
		//this int will be casting the later values into int //
		//tell the program that value wants to be treat as a int//
	}

}
