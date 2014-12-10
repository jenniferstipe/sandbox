
import java.awt.*;
import javax.swing.*;

//Create a simple GUI window 
public class TopLevelWindow 
 { 

  //function to create a window - can be reused 
  private static void createWindow() 
    {  

      //Create and set up the window. 
	  JFrame frame = new JFrame("Simple GUI");
  
      //make sure that when the window is closed, the application also stops. 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
	  //A JLabel is a graphical component that can contain an image or text. 
	  //To keep it simple, it's filled with the text "I'm a label in the window.", 
	  //and its size has been set to a width of 300 pixels and height of 100 pixels.
	  JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER); 
	  textLabel.setPreferredSize(new Dimension(300, 100));
	  
	  //Now that we have created the JLabel, it needs to be added to the JFrame:
	  frame.getContentPane().add(textLabel, BorderLayout.CENTER);
	
      //The following lines are involved with displaying the window with the label inside
	  
	  //make sure that the window will appear in the center of the screen.
	  frame.setLocationRelativeTo(null);
	  
	  //The pack() method is a handy way to size the window. It looks at what the JFrame contains, 
	  //and automatically sets the size of the window. In this case, it ensures the window is big 
	  //enough to show the JLabel.
	  frame.pack();

	  //Actually display the window
	  frame.setVisible(true);
	}
 
    //main method (java application entry point)
    public static void main(String[] args) 
	   {  
	      createWindow();  
	   }
 
 }