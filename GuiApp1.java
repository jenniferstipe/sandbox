
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.JComboBox; 
import javax.swing.JButton; 
import javax.swing.JLabel; 
import javax.swing.JList; 
import java.awt.BorderLayout; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;

//class to create the gui
public class GuiApp1 
   {  

    private static void createGui() 
      {     
   
         //the first layer of the GUI is a application window made from a JFrame.
         JFrame guiFrame = new JFrame();
        
         //Make sure the that when the user closes the window the application closes. 
         //If you don't make sure this happens then the application will be running in 
         //the background and the user will be unaware that it's still hanging around doing nothing. 
         guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         //Set a title for the window. It's always nice to let the user now the name of the application. 
         //If you don't set the the title the window will have a blank title bar. Add this line:
         guiFrame.setTitle("Example GUI");

         //Set the window size. This is important otherwise the window will be too small for the graphical 
         //components you place into it. To do so call the setSize method:
         //An alternative option for setting the size of the window is to call the pack() method of the JFrame class. 
         //It calculates the size the window needs to be for the graphical components it contains. This application 
         //doesn't need to change its window size so we might as well just set how big the window needs to be by using the setSize() method.
         guiFrame.setSize(300,250);
 
         //Center the window to appear in the middle of the computer screen. It's just a nicer place for it to be for 
         //the user. If you don't add the following line, the window will appear in the top left hand corner of the screen:
         guiFrame.setLocationRelativeTo(null);

         //The next two lines are to create some values for the JComboBox and JList objects we'll be creating shortly. 
		 //They create two String arrays which make it easier to populate some example entries for those components 
		 String[] fruitOptions = {"Apple", "Apricot", "Banana" ,"Cherry", "Date", "Kiwi", "Orange", "Pear", "Strawberry"};  
		 String[] vegOptions = {"Asparagus", "Beans", "Broccoli", "Cabbage" , "Carrot", "Celery", "Cucumber", "Leek", "Mushroom" , "Pepper", "Radish", "Shallot", "Spinach", "Swede" , "Turnip"};
		 
         //Now it's time to create the first JPanel object. It will contain a JLabel and a JComboBox. 
		 //All three are created by calling their constructor methods:
		 
		 //the JPanel variable has been declared to be final. This means that the variable can only ever 
		 //hold the JPanel that's created in this line. It means that in the future we can use the variable 
		 //in an inner class. It will become apparent why we want to later on in the code
		 final JPanel comboPanel = new JPanel(); 

		 //the JLabel and JComboBox have values passed to them to set their graphical properties. The label 
		 //will appear as "Fruits:" and the combobox will now have the values contained within the fruitOptions 
		 //array declared earlier.
		 //Note the <String> after JComboBox is required to avoid a compiler warning
		 JLabel comboLbl = new JLabel("Fruits:"); 
		 JComboBox<String> fruits = new JComboBox<String>(fruitOptions);
		 		 
		 //The add() method of the JPanel is used to place graphical components into it. 
		 //A JPanel uses the FlowLayout as its default layout manager. This is fine for this application 
		 //as we want the label to sit next to the combobox. As long as we add the JLabel first it will look fine:
		 comboPanel.add(comboLbl); 
		 comboPanel.add(fruits);

         //The second JPanel follows the same pattern. We'll add a JLabel and a JList and set the values of those 
		 //components to be "Vegetables:" and the second String array vegOptions. The only other difference is 
		 //the use of the setVisible method to make the JPanel not visible. Don't forget there will be a JButton 
		 //controlling the visibility of the two JPanels. For this to work one of them needs to be not visible at 
		 //the start. Add these lines to set up the second JPanel: 
		 final JPanel listPanel = new JPanel(); 
		 //listPanel.setVisible(false); 
		 JLabel listLbl = new JLabel("Vegetables:"); 
		 JList<String> vegs = new JList<String>(vegOptions); 
		 vegs.setLayoutOrientation(JList.HORIZONTAL_WRAP);  

		 listPanel.add(listLbl); 
		 listPanel.add(vegs);                                                                                                                                                 

		 guiFrame.add(comboPanel, BorderLayout.NORTH);
		 guiFrame.add(listPanel, BorderLayout.CENTER);
         guiFrame.setVisible(true);

		 }
   
   //main entry point for application   
   public static void main(String[] args) 
	   {  
          //make a new object out of the GuiApp1 class
	      GuiApp1 guiApp = new GuiApp1();
		  //invoke the createGui method
		  guiApp.createGui();
		  
	   }
   }