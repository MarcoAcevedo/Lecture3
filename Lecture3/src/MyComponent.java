import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class MyComponent extends JComponent {
	
	private static final long serialVersionUID = 1L;
	
	static int counter = 0;
	
	//Actually draws theCar by using MutableCar class
	public void paintComponent (Graphics g) {
		
		MutableCar theCar = new MutableCar(getWidth()-60,getHeight()-30, Color.CYAN);//Creates theCar of type MutableCar
		
		
		//Instructions for drawing the car and setting position, actual instructions come from the class MutableCar
		theCar.setColor(Color.GREEN);
		theCar.draw(g);
		theCar.setPosition(0,getHeight()-30);
		theCar.setColor(Color.BLUE);
		theCar.draw(g);
		theCar.setPosition(getWidth()-60,0);
		theCar.setColor(Color.RED);
		theCar.draw(g);
		theCar.setPosition(0,0);
		theCar.setColor(Color.ORANGE);
		theCar.draw(g);
		
		Random r = new Random();//Makes the magenta car appear in random places
		theCar.setPosition(r.nextInt(getWidth()-60), r.nextInt(getHeight()-30));
		theCar.setColor(Color.MAGENTA);
		theCar.draw(g);
		
		
		System.out.println(counter++);
	}
}
