import java.awt.*;
import javax.swing.*; 
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/*private class window{
	

}*/

public class UserInterface extends JFrame{
	
	public UserInterface(){
		super("Behold, our new frame");
	}
		public static void main(String args[]){
		UserInterface myFrame = new UserInterface();
		myFrame.setSize(500,500);
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		}

	
	/*public static void main(String[] args)
	{
		JFrame myFrame = new JFrame("This is my frame");
		myFrame.setSize(300,400);
		myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		myFrame.setVisible(true);

		System.out.println("New Project!");
	}*/
}
