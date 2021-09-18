package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
     //creating a vraible, but it is not an object//
   
    ArrayList <Polymorph> polymorphs = new ArrayList <Polymorph>();
    //give the list a sub type, told it what type of things is inside the list//
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
   	 
    }
    public void polymor () {
    BluePolymorph bluemorph = new BluePolymorph(50,40);
    polymorphs.add(bluemorph);
    RedMorph redmorph = new RedMorph (60,70);
    polymorphs.add(redmorph);
    CirclePolymorph circlemorph = new CirclePolymorph (80,60);
    polymorphs.add(circlemorph);
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 //this is making object. ANytime you see an keyword new, that meant create an object//
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.MAGENTA);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 //pmhs represent each of the polymorphs as i am going over the list//
   	 //for each loop ask for the type, a name, and the name of the arraylist//
   	for (Polymorph pmhs: polymorphs) {
   		pmhs.draw(g);
   		pmhs.update();
   	}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();

   	 
    }
}
