import javax.swing.JFrame;

public class MyMain
{
	public static void main(String[] args) throws InterruptedException
	{
		JFrame frame = new JFrame();//Creates the window
		
		MyComponent theComponent = new MyComponent();//Creates theComponent of type MyComponent
		
		frame.setSize(300, 400);//Sets window size
		frame.setTitle("Random car");//Obvious
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//What happens when we close
		frame.setVisible(true);//Makes the window visible
		frame.add(theComponent);//Obvious
		
		while(true) {//Creates an infinite loop that sleeps every 50 milliseconds
			frame.repaint();
			Thread.sleep(500);
		}
	}
}
