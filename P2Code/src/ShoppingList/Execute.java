package ShoppingList;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.management.loading.PrivateClassLoader;
import javax.swing.*;

@SuppressWarnings("serial")
public class Execute extends JFrame implements ActionListener {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    
    private JButton overviewBTN;
    private JButton xpenseBTN;
    private JButton shpnlistBTN;
    private JButton menuBTN;
    private JDesktopPane menuPanel;
    
    JPanel panel1;
    JPanel panel2;
    JPanel centerPanel;
    public Execute() {
        //Set up the main window frame
        setTitle("Execute");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 500);
//        setResizable(false);
        
        //Initialize the components
        menuPanel = new JDesktopPane();
        menuBTN = new JButton("Menu");
        panel1 = new JPanel();
        panel2 = new JPanel();
        centerPanel = new JPanel();
        overviewBTN = new JButton("Overview");
        xpenseBTN   = new JButton("New Expense");
        shpnlistBTN = new JButton("Shopping List");
        
        //Set up the layout of the components
        Color rbgcolor = new Color(25,125,175);
        getContentPane().add(centerPanel);
        centerPanel.setBackground(rbgcolor);
        centerPanel.setLayout(new GridBagLayout());
        GridBagConstraints myConstraints = new GridBagConstraints();
        
        if (shouldWeightX) {
            myConstraints.weightx = 0.5;
        }
        //Grid {0,0}
        myConstraints.fill = GridBagConstraints.BOTH;
        myConstraints.weightx = 0.5;
        myConstraints.ipady = 10;
        myConstraints.anchor = GridBagConstraints.NORTHWEST;
        myConstraints.gridx = 0;
        myConstraints.gridy = 0;
        centerPanel.add(menuBTN, myConstraints);
        
      //Grid {1,0}
        myConstraints.fill = GridBagConstraints.BOTH;
        myConstraints.weightx = 0.5;
        myConstraints.gridx = 1;
        myConstraints.gridy = 0;
        
      //Grid {2,0}
        myConstraints.fill = GridBagConstraints.BOTH;
        myConstraints.weightx = 0.5;
        myConstraints.gridx = 2;
        myConstraints.gridy = 0;
        
      //Grid {0,1}
        myConstraints.fill = GridBagConstraints.BOTH;
        myConstraints.weightx = 0.5;
        myConstraints.gridx = 0;
        myConstraints.gridy = 1;
        centerPanel.add(overviewBTN, myConstraints);
        
      //Grid {1,1}
        myConstraints.fill = GridBagConstraints.BOTH;
        myConstraints.weightx = 0.5;
        myConstraints.ipady = 0;
        myConstraints.gridx = 1;
        myConstraints.gridy = 1;
        centerPanel.add(xpenseBTN, myConstraints);
        
      //Grid {2,1}
        myConstraints.fill = GridBagConstraints.BOTH;
        myConstraints.weightx = 0.5;
        myConstraints.gridx = 2;
        myConstraints.gridy = 1;
        
      //Grid {0,2}
        myConstraints.fill = GridBagConstraints.BOTH;
        myConstraints.weightx = 0.5;
        myConstraints.gridx = 0;
        myConstraints.gridy = 2;
        
      //Grid {1,2}
        myConstraints.fill = GridBagConstraints.BOTH;
        myConstraints.weightx = 0.5;
        myConstraints.gridx = 1;
        myConstraints.gridy = 2;
        centerPanel.add(shpnlistBTN, myConstraints);
        
      //Grid {2,2}
        myConstraints.fill = GridBagConstraints.BOTH;
        myConstraints.weightx = 0.5;
        myConstraints.gridx = 2;
        myConstraints.gridy = 2;
        
        //Register ActionListeners for the buttons
        menuBTN.addActionListener(this);
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
           
           System.out.println("You pressed: " + btn.getText());
           
           if (btn == menuBTN)
           {
               menuPanel.setVisible(true);
           }
           else if (btn == overviewBTN)
           {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        new Overview();
                    }
                });
           }
           else if (btn == xpenseBTN)
            {
               SwingUtilities.invokeLater(new Runnable() {
                   public void run() {
                       new NewExpense();
                   }
               });
            }
           else if (btn == shpnlistBTN)
           {
               SwingUtilities.invokeLater(new Runnable() {
                   public void run() {
                       new ShoppingList();
                   }
               });
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
         ArrayList<String> categoryList   = new ArrayList<String>();
         ArrayList<String> itemList       = new ArrayList<String>();
         ArrayList<String> shoppingList   = new ArrayList<String>();
         
         File file             = new File("test1.txt");
         File categoryFile     = new File("categories.txt");
         File itemFile         = new File("items.txt");
         File shoppingListFile = new File("shoppinglist.txt");
         
//         String hi = "I'm not a category :i";
         
         names.add("Potato");
         names.add("Onion");
         names.add("Rice");
         names.add("Shoes");
         
         
         try {
              new Save(names);
              new Save(categoryList, categoryFile);
              new Save (shoppingList, shoppingListFile);
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