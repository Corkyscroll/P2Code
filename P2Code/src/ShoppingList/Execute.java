package ShoppingList;

import java.awt.GridLayout;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.*;

@SuppressWarnings("serial")
public class Execute extends JFrame implements ActionListener {
    private JButton overviewBTN;
    private JButton xpenseBTN;
    private JButton shpnlistBTN;
    public Execute() {
        //Set up the main window frame
        setTitle("Execute");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 700);
        
        //Initialize the components
        overviewBTN = new JButton("Overview");
        xpenseBTN   = new JButton("New Expense");
        shpnlistBTN = new JButton("Shopping List");
        
        //Set up the layout of the components
        GridLayout layout = new GridLayout(0, 1);
        getContentPane().setLayout(layout);
        
        //Add the components to the window
        add(overviewBTN);
        add(xpenseBTN);
        add(shpnlistBTN);
        
        //Register ActionListeners for the buttons
        overviewBTN.addActionListener(this);
        xpenseBTN.addActionListener(this);
        shpnlistBTN.addActionListener(this);

        pack();
        setVisible(true);
    }
        @Override
        public void actionPerformed(ActionEvent e)
        {
           JButton btn = (JButton)  e.getSource();
           if (btn == overviewBTN)
           {
               System.out.println("You pressed: " + btn.getText());
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        new Overview();
                    }
                });
           }
           else if (btn == xpenseBTN)
            {
               System.out.println("You pressed: " + btn.getText());
            }
           else if (btn == shpnlistBTN)
           {
               System.out.println("You pressed: " + btn.getText());
           }
        }
    
//    private class XpenseButtonListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e)
//        {
//            SwingUtilities.invokeLater(new Runnable() {
//                public void run() {
//                    new Overview();
//                }
//            });
//        }
//    }       
    
    public static void main(String[] args) {
        // Attributes
         ArrayList<String> names          = new ArrayList<String>();
         ArrayList<String> loadedFile     = new ArrayList<String>();
         ArrayList<String> categoryList = new ArrayList<String>();
         ArrayList<String> itemList       = new ArrayList<String>();
         
         File file           = new File("test1.txt");
         File categoryFile = new File("categories.txt");
         File itemFile       = new File("items.txt");
         
//         String hi = "I'm not a category :i";
         
         names.add("Potato");
         names.add("Onion");
         names.add("Rice");
         names.add("Shoes");
         
         
         try {
              new Save(names);
              new Save(categoryList, categoryFile);
              new Category();
              new Item();
              new Load(file, loadedFile);
              new Load(categoryFile, categoryList);
              new Load(itemFile, itemList);
              
              Item.dropDown = categoryList.toArray(new String[categoryList.size()]);
             
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }
         
         SwingUtilities.invokeLater(new Runnable() {
             public void run() {
                 new Execute();
             }
         });
         
    }
}