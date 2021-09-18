package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	//to encapsulate a variable, we need to have a getter method and set it to private. //
	//Restriction is not the key factor of encapsulation. when restriction apply, setter method is needed//
	
    protected int x;
    protected int y;
    public int getX() {
		return x;
	}
    public int getY() {
		return y;
	}
    protected int width=50;
	protected int height=50;
    public int getWidth() {
		return width;
	}
    public int getHeight() {
		return height;
	}
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
