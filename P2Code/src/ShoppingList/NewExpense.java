package ShoppingList;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class NewExpense extends JFrame implements ActionListener {
    private JTextField itemNameField;
    private JTextField itemCategoryField;
    private JTextField itemPriceField;
    private JButton doneBTN;
    private JButton cancelBTN;
    private String itemName;
    private String itemCategory;
    private Double itemPrice;
        
        public NewExpense() {            
            //Set up the main window frame
            setTitle("Overview");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(300, 500);
            
            //Initialize the components
            itemNameField = new JTextField("Name..");
            itemCategoryField = new JTextField("Category..");
            itemPriceField = new JTextField("0.0");
            doneBTN = new JButton("Done");
            cancelBTN = new JButton("Cancel");
            itemName = "Empty String";
            itemCategory = "Empty String";
            itemPrice = 0.0;
            
            //Set up the layout of the components
            GroupLayout layout = new GroupLayout(getContentPane());
            Color rbgcolor = new Color(25,125,175);
            getContentPane().setLayout(layout);
            getContentPane().setBackground(rbgcolor);
            layout.setAutoCreateContainerGaps(true);
            layout.setAutoCreateGaps(true);
            
            layout.setHorizontalGroup(
                    layout.createSequentialGroup()
                        .addGroup(
                                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(itemNameField)
                                .addComponent(itemCategoryField)
                                .addComponent(itemPriceField)
                                .addComponent(doneBTN)
                                )
                        .addGroup(
                                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(cancelBTN)
                                )
                        );
            
            layout.setVerticalGroup(
                    layout.createSequentialGroup()
                        .addGroup(
                                layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(itemNameField)
                                )
                        .addGroup(
                                layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(itemCategoryField)
                                )
                        .addGroup(
                                layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(itemPriceField)
                                )
                        .addGroup(
                                layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(doneBTN)
                                .addComponent(cancelBTN)
                                )
                        );
            
            //Register ActionListeners for the button and labels
            doneBTN.addActionListener(this);
            cancelBTN.addActionListener(this);
            
            itemNameField.addActionListener(new ActionListener()
            {
                
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    itemName = itemNameField.getText();
                }
            }
                    );
            
            itemCategoryField.addActionListener(new ActionListener()
            {
                
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    itemCategory = itemCategoryField.getText();
                }
            }
                    );
            
            itemPriceField.addActionListener(new ActionListener()
            {
                
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    itemPrice = (Double.parseDouble(itemPriceField.getText()));
                }
            }
                    );
            
            pack();
            setVisible(true);

        }
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            System.out.println("You pressed: " + btn.getText());
            
            if(btn == doneBTN)
            {
                new Item(itemName, itemCategory, itemPrice);
                this.dispose();
            }
            else if (btn == cancelBTN)
                this.dispose();
        }
    }
