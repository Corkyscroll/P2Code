package ShoppingList;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ShoppingList extends JFrame {
    static int counter = 0;
    static int windowssize=350;
    static int basketcounter = 0;
    
    private JButton save;
    private JButton load;
    private JButton done;
    
    File file = new File("shoppinglist.txt");
    
    ArrayList<String> shoppingList = new ArrayList<String>();
    ArrayList<String> shoppingqty = new ArrayList<String>();
    
    public ShoppingList() {
        OldCode();
    }
    public void OldCode() {            
                JFrame frame = new JFrame("Shopping List");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                shoppingList.add("M�lk");
                shoppingList.add("Br�d");
                shoppingList.add("Oksek�d");
                shoppingList.add("Sm�r");
                shoppingList.add("Sukker");
//
//                shoppingqty.add("1");
//                shoppingqty.add("1");
//                shoppingqty.add("4");
//                shoppingqty.add("20");
//                shoppingqty.add("4");
                
                Container contentPane = frame.getContentPane();
                Color rbgcolor = new Color(25,125,175);
                GroupLayout layout = new GroupLayout(contentPane);
                
                frame.getContentPane().setBackground(rbgcolor);
                contentPane.setLayout(layout);

                layout.setAutoCreateGaps(true);
                layout.setAutoCreateContainerGaps(true);
                Color textcolor = new Color(215,215,255);
                JLabel c1 = new JLabel("<html><u>Item</u></html>"); 
                Font font = c1.getFont();
                c1.setFont(new Font(font.getFontName(), Font.BOLD, 16));
                c1.setForeground(textcolor);
                JLabel c2 = new JLabel("<html><u>QTY</u></html>");
                c2.setFont(new Font(font.getFontName(), Font.BOLD, 16));
                c2.setForeground(textcolor);
                JLabel c3 = new JLabel("<html><u>Bought</u></html>");
                c3.setFont(new Font(font.getFontName(), Font.BOLD, 16));
                c3.setForeground(textcolor);
                JButton c4 = new JButton("+");
                c4.setFont(new Font(font.getFontName(), Font.BOLD, 24));
                
                JButton clear = new JButton("Clear List");
                clear.setFont(new Font(font.getFontName(), Font.BOLD, 10));
                
                save = new JButton("Save List");
                save.setFont(new Font(font.getFontName(), Font.BOLD, 10));
                
                load = new JButton("Load List");
                load.setFont(new Font(font.getFontName(), Font.BOLD, 10));
                
                done = new JButton("Done");
                done.setFont(new Font(font.getFontName(), Font.BOLD, 10));
                
                
                
                JCheckBox c9 = new JCheckBox("");
                JCheckBox c10 = new JCheckBox("");
                JCheckBox c11 = new JCheckBox("");
                JCheckBox c12 = new JCheckBox("");
                JCheckBox c13 = new JCheckBox("");
                JCheckBox c14 = new JCheckBox("");
                
                
                JButton checkOut = new JButton(new ImageIcon(((new ImageIcon(ShoppingList.class.getResource("/resources2/cart.png"))).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
                JButton del1 = new JButton(new ImageIcon(((new ImageIcon(ShoppingList.class.getResource("/resources2/trash.png"))).getImage()).getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH)));
                del1.setBorder(null);
                JButton del2 = new JButton(new ImageIcon(((new ImageIcon(ShoppingList.class.getResource("/resources2/trash.png"))).getImage()).getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH)));
                del2.setBorder(null);
                JButton del3 = new JButton(new ImageIcon(((new ImageIcon(ShoppingList.class.getResource("/resources2/trash.png"))).getImage()).getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH)));
                del3.setBorder(null);
                JButton del4 = new JButton(new ImageIcon(((new ImageIcon(ShoppingList.class.getResource("/resources2/trash.png"))).getImage()).getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH)));
                del4.setBorder(null);
                JButton del5 = new JButton(new ImageIcon(((new ImageIcon(ShoppingList.class.getResource("/resources2/trash.png"))).getImage()).getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH)));
                del5.setBorder(null);
                JButton del6 = new JButton(new ImageIcon(((new ImageIcon(ShoppingList.class.getResource("/resources2/trash.png"))).getImage()).getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH)));
                del6.setBorder(null);
                JButton del7 = new JButton(new ImageIcon(((new ImageIcon(ShoppingList.class.getResource("/resources2/trash.png"))).getImage()).getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH)));
                del7.setBorder(null);
                checkOut.setBorder(null);
                del1.setVisible(false);
                del2.setVisible(false);
                del3.setVisible(false);
                del4.setVisible(false);
                del5.setVisible(false);
                del6.setVisible(false);
                del7.setVisible(false);
                
                /*
                JLabel holder;
                ArrayList<JLabel> labels = new ArrayList<JLabel>();
                for (int i = 0; i < 20; i++){
                    holder = new JLabel();
                    if(i>=shoppingList.size()){
                        holder.setText("");
                    }
                    else if(shoppingList.get(i)!=null){
                        holder.setText(shoppingList.get(i));  // assuming order's objects are Strings, otherwise .toString() on there somewhere 
                    }
                    else{
                        holder.setText("empty");  // assuming order's objects are Strings, otherwise .toString() on there somewhere
                    }
                    labels.add(holder); //adds holder to the ArrayList of JLabels
                } */
                JLabel c05 = new JLabel ("");
                JLabel c06 = new JLabel ("");
                JLabel c07 = new JLabel ("");
                JLabel c08 = new JLabel ("");
                JLabel c09 = new JLabel ("");
                JLabel c010 = new JLabel ("");
                JLabel c011 = new JLabel ("");

                
                ArrayList<JLabel> labels = new ArrayList<JLabel>();
                labels.add(c05);
                labels.add(c06);
                labels.add(c07);
                labels.add(c08);
                labels.add(c09);
                labels.add(c010);
                labels.add(c011);
                
                JLabel cc05 = new JLabel ("");
                JLabel cc06 = new JLabel ("");
                JLabel cc07 = new JLabel ("");
                JLabel cc08 = new JLabel ("");
                JLabel cc09 = new JLabel ("");
                JLabel cc010 = new JLabel ("");
                JLabel cc011 = new JLabel ("");
                ArrayList<JLabel> labels2 = new ArrayList<JLabel>();
                labels2.add(cc05);
                labels2.add(cc06);
                labels2.add(cc07);
                labels2.add(cc08);
                labels2.add(cc09);
                labels2.add(cc010);
                labels2.add(cc011);
                labels2.get(0).setVisible(false);
                labels2.get(1).setVisible(false);
                labels2.get(2).setVisible(false);
                labels2.get(3).setVisible(false);
                labels2.get(4).setVisible(false);
                labels2.get(5).setVisible(false);
                labels2.get(6).setVisible(false);
            
                
                if(labels.get(0).getText()!=""){
                    labels2.get(0).setVisible(true);
                }
                if(labels.get(1).getText()!=""){
                    labels2.get(1).setVisible(true);
                }
                if(labels.get(2).getText()!=""){
                    labels2.get(2).setVisible(true);
                }
                if(labels.get(3).getText()!=""){
                    labels2.get(3).setVisible(true);
                }
                if(labels.get(4).getText()!=""){
                    labels2.get(4).setVisible(true);
                }
                if(labels.get(5).getText()!=""){
                    labels2.get(5).setVisible(true);
                }
                if(labels.get(6).getText()!=""){
                    labels2.get(6).setVisible(true);
                }
                
                /*JLabel holder2;
                ArrayList<JLabel> labels2 = new ArrayList<JLabel>();
                for (int i = 0; i < 20; i++){
                    holder2 = new JLabel();
                    if(i>=shoppingqty.size()){
                        holder2.setText("");
                    }
                    else if(shoppingqty.get(i)!=null){
                        holder2.setText(shoppingqty.get(i));  // assuming order's objects are Strings, otherwise .toString() on there somewhere 
                    }
                    else{
                        holder2.setText("empty");  // assuming order's objects are Strings, otherwise .toString() on there somewhere
                    }
                    labels2.add(holder2); //adds holder to the ArrayList of JLabels
                }
                */
                JCheckBox c8 = new JCheckBox("");
                if(labels2.get(0).getText()==""){
                    c8.setVisible(false);
                }
           
                
                
                JLabel add = new JLabel();
                add.setText("item name");
                add.setVisible(false);
                JTextField newqty = new JTextField();
                JTextField newitem = new JTextField();
                newitem.addActionListener(new ActionListener(){

                
                    public void actionPerformed(ActionEvent e) {
                        
//                         String text = newitem.getText();
                         
                            shoppingList.add(newitem.getText());
                            System.out.println(shoppingList.size());
                            
                            System.out.println(c011.getText());
//                            JLabel potato = new JLabel();
                            if(counter==0){
                                c05.setText(newitem.getText());
                                counter++;
                            }
                            else if(counter==1){
                                c06.setText(newitem.getText());
                                counter++;
                            }
                            else if(counter==2){
                                c07.setText(newitem.getText());
                                counter++;
                            }
                            else if(counter==3){
                                c08.setText(newitem.getText());
                                counter++;
                            }
                            else if(counter==4){
                                c09.setText(newitem.getText());
                                counter++;
                            }
                            else if(counter==5){
                                c010.setText(newitem.getText());
                                counter++;
                            }
                            else if(counter==6){
                                c011.setText(newitem.getText());
                                counter++;
                            }
                            
                      
                            labels.clear();
                            //c011.setText(newitem.getText());
                            if(c05.getText()!=""){
                                c05.setVisible(true);
                            }
                            if(c011.getText()!=""){
                                c011.setVisible(true);
                            }
                            if(c06.getText()!=""){
                                c06.setVisible(true);
                            }
                            if(c07.getText()!=""){
                                c07.setVisible(true);
                            }
                            if(c08.getText()!=""){
                                c08.setVisible(true);
                            }
                            if(c09.getText()!=""){
                                c09.setVisible(true);
                            }
                            if(c010.getText()!=""){
                                c010.setVisible(true);
                            }
                            labels.add(c05);
                            labels.add(c06);
                            labels.add(c07);
                            labels.add(c08);
                            labels.add(c09);
                            labels.add(c010);
                            labels.add(c011);
                                                    
                            if(labels.get(0).getText()!=""){
                                labels2.get(0).setVisible(true);
                                del1.setVisible(true);
                            }
                            if(labels.get(1).getText()!=""){
                                labels2.get(1).setVisible(true);
                                del2.setVisible(true);
                            }
                            if(labels.get(2).getText()!=""){
                                labels2.get(2).setVisible(true);
                                del3.setVisible(true);
                            }
                            if(labels.get(3).getText()!=""){
                                labels2.get(3).setVisible(true);
                                del4.setVisible(true);
                            }
                            if(labels.get(4).getText()!=""){
                                labels2.get(4).setVisible(true);
                                del5.setVisible(true);
                            }
                            if(labels.get(5).getText()!=""){
                                labels2.get(5).setVisible(true);
                                del6.setVisible(true);
                            }
                            if(labels.get(6).getText()!=""){
                                labels2.get(6).setVisible(true);
                                del7.setVisible(true);
                            }
                            System.out.println(labels.get(0).getText());
                            
                            
                            //add.setText(newitem.getText());
                            //labels.get(0).repaint();
                            //SwingUtilities.updateComponentTreeUI(frame);
                            add.setText("QTY");
                            
                            c8.setVisible(true);
                            if(labels.get(0).getText()==""){
                                c8.setVisible(false);
                            }
                            c9.setVisible(true);
                            if(labels.get(1).getText()==""){
                                c9.setVisible(false);
                            }
                        
                            c10.setVisible(true);
                            if(labels.get(2).getText()==""){
                                c10.setVisible(false);
                            }
                            
                            
                            c11.setVisible(true);
                            if(labels.get(3).getText()==""){
                                c11.setVisible(false);
                            }
                            
                      
                            c12.setVisible(true);
                            if(labels.get(4).getText()==""){
                                c12.setVisible(false);
                            }
                            
                            
                            c13.setVisible(true);
                            if(labels.get(5).getText()==""){
                                c13.setVisible(false);
                            }
                            
                            
                            c14.setVisible(true);
                            if(labels.get(6).getText()==""){
                                c14.setVisible(false);
                            }
                            
                            
                            windowssize=windowssize+10;
                            newitem.setVisible(false);
                            newqty.setVisible(true);
                            frame.repaint();
                            
                            
                            
                    }
                    
                    
                }
                );
                
                newqty.addActionListener(new ActionListener()
                         {
                            
                    public void actionPerformed(ActionEvent e){
//                        String text2 = newqty.getText();
                        labels2.clear();
                        if(counter==1){
                            cc05.setText(newqty.getText());
                        
                        }
                        else if(counter==2){
                            cc06.setText(newqty.getText());
                        
                        }
                        else if(counter==3){
                            cc07.setText(newqty.getText());
                        
                        }
                        else if(counter==4){
                            cc08.setText(newqty.getText());
                            
                        }
                        else if(counter==5){
                            cc09.setText(newqty.getText());
                            
                        }
                        else if(counter==6){
                            cc010.setText(newqty.getText());
                            
                        }
                        else if(counter==7){
                            cc011.setText(newqty.getText());
                            
                        }
                        
                        labels2.add(cc05);
                        labels2.add(cc06);
                        labels2.add(cc07);
                        labels2.add(cc08);
                        labels2.add(cc09);
                        labels2.add(cc010);
                        labels2.add(cc011);
                        frame.repaint();
                    
                         }
                
                        });
                
                
                class checkboxchecker{
                    void check(){
                        
                    
                    
                        
                    
                        c8.setVisible(true);
                        if(labels.get(0).getText()==""){
                            del1.setVisible(false);
                            c8.setVisible(false);
                        }
                        c9.setVisible(true);
                        if(labels.get(1).getText()==""){
                            del2.setVisible(false);
                            c9.setVisible(false);
                        }
                    
                        c10.setVisible(true);
                        if(labels.get(2).getText()==""){
                            del3.setVisible(false);
                            c10.setVisible(false);
                        }
                        
                        
                        c11.setVisible(true);
                        if(labels.get(3).getText()==""){
                            del4.setVisible(false);
                            c11.setVisible(false);
                        }
                        
                  
                        c12.setVisible(true);
                        if(labels.get(4).getText()==""){
                            del5.setVisible(false);
                            
                            c12.setVisible(false);
                        }
                        
                        
                        c13.setVisible(true);
                        if(labels.get(5).getText()==""){
                            del6.setVisible(false);
                            
                            c13.setVisible(false);
                        }
                        
                        
                        c14.setVisible(true);
                        if(labels.get(6).getText()==""){
                            del7.setVisible(false);
                            c14.setVisible(false);
                        }
                        System.out.println("i checked");
                        frame.repaint();
                    }
                
                };
                
                del1.addActionListener(new ActionListener()
             {
                
        public void actionPerformed(ActionEvent e){
            labels.clear();
            labels2.clear();
            
                c05.setText(c06.getText());
                c06.setText(c07.getText());
                c07.setText(c08.getText());
                c08.setText(c09.getText());
                c09.setText(c010.getText());
                c010.setText(c011.getText());
                c011.setText("");
                cc05.setText(cc06.getText());
                cc06.setText(cc07.getText());
                cc07.setText(cc08.getText());
                cc08.setText(cc09.getText());
                cc09.setText(cc010.getText());
                cc010.setText(cc011.getText());
                cc011.setText("");
                labels2.add(cc05);
                labels2.add(cc06);
                labels2.add(cc07);
                labels2.add(cc08);
                labels2.add(cc09);
                labels2.add(cc010);
                labels2.add(cc011);
                labels.add(c05);
                labels.add(c06);
                labels.add(c07);
                labels.add(c08);
                labels.add(c09);
                labels.add(c010);
                labels.add(c011);
                counter=counter-1;
                frame.repaint();
                checkboxchecker duck= new checkboxchecker();
                duck.check();
            
            
        }
             }
                );
                del2.addActionListener(new ActionListener()
                 {
                    
            public void actionPerformed(ActionEvent e){
                labels.clear();
                labels2.clear();
                
                
                    c06.setText(c07.getText());
                    c07.setText(c08.getText());
                    c08.setText(c09.getText());
                    c09.setText(c010.getText());
                    c010.setText(c011.getText());
                    c011.setText("");
                
                    cc06.setText(cc07.getText());
                    cc07.setText(cc08.getText());
                    cc08.setText(cc09.getText());
                    cc09.setText(cc010.getText());
                    cc010.setText(cc011.getText());
                    cc011.setText("");
                    labels2.add(cc05);
                labels2.add(cc06);
                labels2.add(cc07);
                labels2.add(cc08);
                labels2.add(cc09);
                labels2.add(cc010);
                labels2.add(cc011);
                labels.add(c05);
                labels.add(c06);
                labels.add(c07);
                labels.add(c08);
                labels.add(c09);
                labels.add(c010);
                labels.add(c011);
                counter=counter-1;
                frame.repaint();
                checkboxchecker duck= new checkboxchecker();
                duck.check();
                
            }
                 }
                );
                del3.addActionListener(new ActionListener()
                 {
                    
            public void actionPerformed(ActionEvent e){
                labels.clear();
                labels2.clear();
                
                
                
                    c07.setText(c08.getText());
                    c08.setText(c09.getText());
                    c09.setText(c010.getText());
                    c010.setText(c011.getText());
                    c011.setText("");
                
                
                    cc07.setText(cc08.getText());
                    cc08.setText(cc09.getText());
                    cc09.setText(cc010.getText());
                    cc010.setText(cc011.getText());
                    cc011.setText("");
                    labels2.add(cc05);
                labels2.add(cc06);
                labels2.add(cc07);
                labels2.add(cc08);
                labels2.add(cc09);
                labels2.add(cc010);
                labels2.add(cc011);
                labels.add(c05);
                labels.add(c06);
                labels.add(c07);
                labels.add(c08);
                labels.add(c09);
                labels.add(c010);
                labels.add(c011);
                counter=counter-1;
                frame.repaint();
                checkboxchecker duck= new checkboxchecker();
                duck.check();
                
            }
                 }
                );
                del4.addActionListener(new ActionListener()
                 {
                    
            public void actionPerformed(ActionEvent e){
                labels.clear();
                labels2.clear();
                
                
                
        
                    c08.setText(c09.getText());
                    c09.setText(c010.getText());
                    c010.setText(c011.getText());
                    c011.setText("");
                
                
                    
                    cc08.setText(cc09.getText());
                    cc09.setText(cc010.getText());
                    cc010.setText(cc011.getText());
                    cc011.setText("");
                    labels2.add(cc05);
                labels2.add(cc06);
                labels2.add(cc07);
                labels2.add(cc08);
                labels2.add(cc09);
                labels2.add(cc010);
                labels2.add(cc011);
                labels.add(c05);
                labels.add(c06);
                labels.add(c07);
                labels.add(c08);
                labels.add(c09);
                labels.add(c010);
                labels.add(c011);
                counter=counter-1;
                frame.repaint();
                checkboxchecker duck= new checkboxchecker();
                duck.check();
                
            }
                 }
                );
                del5.addActionListener(new ActionListener()
             {
                
        public void actionPerformed(ActionEvent e){
            labels.clear();
            labels2.clear();
            
            
            
    
            
                c09.setText(c010.getText());
                c010.setText(c011.getText());
                c011.setText("");
            
            
                
            
                cc09.setText(cc010.getText());
                cc010.setText(cc011.getText());
                cc011.setText("");
                labels2.add(cc05);
                labels2.add(cc06);
                labels2.add(cc07);
                labels2.add(cc08);
                labels2.add(cc09);
                labels2.add(cc010);
                labels2.add(cc011);
                labels.add(c05);
                labels.add(c06);
                labels.add(c07);
                labels.add(c08);
                labels.add(c09);
                labels.add(c010);
                labels.add(c011);
                counter=counter-1;
                frame.repaint();
                checkboxchecker duck= new checkboxchecker();
                duck.check();
            
        }
             }
                );

                del6.addActionListener(new ActionListener()
             {
                
        public void actionPerformed(ActionEvent e){
            labels.clear();
            labels2.clear();
            
            
            
    
            
                
                c010.setText(c011.getText());
                c011.setText("");
            
            
                
            
            
                cc010.setText(cc011.getText());
                cc011.setText("");
                labels2.add(cc05);
                labels2.add(cc06);
                labels2.add(cc07);
                labels2.add(cc08);
                labels2.add(cc09);
                labels2.add(cc010);
                labels2.add(cc011);
                labels.add(c05);
                labels.add(c06);
                labels.add(c07);
                labels.add(c08);
                labels.add(c09);
                labels.add(c010);
                labels.add(c011);
                counter=counter-1;
                frame.repaint();
                checkboxchecker duck= new checkboxchecker();
                duck.check();
            
        }
             }
                );
                del7.addActionListener(new ActionListener()
                 {
                    
            public void actionPerformed(ActionEvent e){
                labels.clear();
                labels2.clear();
                
                    c011.setText("");
                    cc011.setText("");
                    labels2.add(cc05);
                labels2.add(cc06);
                labels2.add(cc07);
                labels2.add(cc08);
                labels2.add(cc09);
                labels2.add(cc010);
                labels2.add(cc011);
                labels.add(c05);
                labels.add(c06);
                labels.add(c07);
                labels.add(c08);
                labels.add(c09);
                labels.add(c010);
                labels.add(c011);
                counter=counter-1;
                frame.repaint();
                
                checkboxchecker duck= new checkboxchecker();
                duck.check();
            }
                 }
                );
                
                
                newitem.setVisible(false);
                
                newqty.setVisible(false);
                
                c4.addActionListener(new ActionListener() {
                     
                    public void actionPerformed(ActionEvent e)
                    {
                        add.setVisible(true);
                        add.setText("Item Name");
                        newitem.setText("");
                        newqty.setText("");
                        newqty.setVisible(false);
                        newitem.setVisible(true);
                        
                    }
                }); 
                
                
                
                clear.addActionListener(new ActionListener(){

                    
                    public void actionPerformed(ActionEvent e) {
                        counter=0;
                        labels2.clear();
                        labels.clear();
                        c05.setText("");
                        c06.setText("");
                        c07.setText("");
                        c08.setText("");
                        c09.setText("");
                        c010.setText("");
                        c011.setText("");
                        cc05.setText("");
                        cc06.setText("");
                        cc07.setText("");
                        cc08.setText("");
                        cc09.setText("");
                        cc010.setText("");
                        cc011.setText("");
                        
                        labels.add(c05);
                        labels.add(c06);
                        labels.add(c07);
                        labels.add(c08);
                        labels.add(c09);
                        labels.add(c010);
                        labels.add(c011);
                        labels2.add(cc05);
                        labels2.add(cc06);
                        labels2.add(cc07);
                        labels2.add(cc08);
                        labels2.add(cc09);
                        labels2.add(cc010);
                        labels2.add(cc011);

                        labels.get(0).setVisible(false);
                        labels.get(1).setVisible(false);
                        labels.get(2).setVisible(false);
                        labels.get(3).setVisible(false);
                        labels.get(4).setVisible(false);
                        labels.get(5).setVisible(false);
                        labels.get(6).setVisible(false);
                        labels2.get(0).setVisible(false);
                        labels2.get(1).setVisible(false);
                        labels2.get(2).setVisible(false);
                        labels2.get(3).setVisible(false);
                        labels2.get(4).setVisible(false);
                        labels2.get(5).setVisible(false);
                        labels2.get(6).setVisible(false);
                        c8.setVisible(false);
                            c9.setVisible(false);
                        
                        
                            c10.setVisible(false);
                        
                        
                        
                            c11.setVisible(false);
                        
                        
                        
                            c12.setVisible(false);
                        
                        
                        
                            c13.setVisible(false);
                        
                    
                            c14.setVisible(false);
                        
                        frame.repaint();
                        checkboxchecker duck= new checkboxchecker();
                        duck.check();
                    }
                    
                    
                });
                
                checkOut.addActionListener(new ActionListener(){

                
                    public void actionPerformed(ActionEvent arg0) {
                        if(c14.isSelected()==true){
                            c011.setText("");
                            cc011.setText("");
                            basketcounter++;
                            System.out.println("item 7 rekt");
                        }
                        if(c13.isSelected()==true){
                            c010.setText(c011.getText());
                            cc010.setText(cc011.getText());
                            c011.setText("");
                            cc011.setText("");
                            basketcounter++;
                            System.out.println("item 6 rekt");
                        }
                        if(c12.isSelected()==true){
                            c09.setText(c010.getText());
                            cc09.setText(cc010.getText());
                            c010.setText(c011.getText());
                            cc010.setText(cc011.getText());
                            c011.setText("");
                            cc011.setText("");
                            basketcounter++;
                            System.out.println("item 5 rekt");
                        }
                        
                        if(c11.isSelected()==true){
                            c08.setText(c09.getText());
                            cc08.setText(cc09.getText());
                            c09.setText(c010.getText());
                            cc09.setText(cc010.getText());
                            c010.setText(c011.getText());
                            cc010.setText(cc011.getText());
                            c011.setText("");
                            cc011.setText("");
                            basketcounter++;
                            System.out.println("item 4 rekt");
                        }
                        if(c10.isSelected()==true){
                            c07.setText(c08.getText());
                            cc07.setText(cc08.getText());
                            c08.setText(c09.getText());
                            cc08.setText(cc09.getText());
                            c09.setText(c010.getText());
                            cc09.setText(cc010.getText());
                            c010.setText(c011.getText());
                            cc010.setText(cc011.getText());
                            c011.setText("");
                            cc011.setText("");
                            basketcounter++;
                            System.out.println("item 3 rekt");
                        }
                        if(c9.isSelected()==true){
                            c06.setText(c07.getText());
                            cc06.setText(cc07.getText());
                            c07.setText(c08.getText());
                            cc07.setText(cc08.getText());
                            c08.setText(c09.getText());
                            cc08.setText(cc09.getText());
                            c09.setText(c010.getText());
                            cc09.setText(cc010.getText());
                            c010.setText(c011.getText());
                            cc010.setText(cc011.getText());
                            c011.setText("");
                            cc011.setText("");
                            basketcounter++;
                            System.out.println("item 2 rekt");
                        }
                        if(c8.isSelected()==true){
                            c05.setText(c06.getText());
                            cc05.setText(cc06.getText());
                            basketcounter++;
                            System.out.println("item 1 rekt");
                        }
                    
                    
                        add.setText("You checked out " +basketcounter+ " items");
                        System.out.println(basketcounter);
                        counter=counter-basketcounter;
                        basketcounter=0;
                        
                        c8.setSelected(false);
                        c9.setSelected(false);
                        c10.setSelected(false);
                        c11.setSelected(false);
                        c12.setSelected(false);
                        c13.setSelected(false);
                        c14.setSelected(false);
                    
                        
                        
                        
                        
                        
                        
                        frame.repaint();
                        checkboxchecker duck= new checkboxchecker();
                        duck.check();
                        System.out.println(counter);
                        System.out.println(basketcounter);
                        newitem.setText("");
                        newqty.setText("");
                        newitem.setVisible(false);
                        newqty.setVisible(false);
                        
                        
                        
                    }
                    
                    
                    
                });
                
                

                
                
                c9.setVisible(true);
                if(labels.get(1).getText()==""){
                    c9.setVisible(false);
                }
                
                c10.setVisible(true);
                if(labels.get(2).getText()==""){
                    c10.setVisible(false);
                }
                
                c11.setVisible(true);
                if(labels.get(3).getText()==""){
                    c11.setVisible(false);
                }
                
                c12.setVisible(true);
                if(labels.get(4).getText()==""){
                    c12.setVisible(false);
                }
                
                c13.setVisible(true);
                if(labels.get(5).getText()==""){
                    c13.setVisible(false);
                }
            
                c14.setVisible(true);
                if(labels.get(6).getText()==""){
                    c14.setVisible(false);
                }
                /*
                JCheckBox c15 = new JCheckBox("");
                c15.setVisible(true);
                if(labels.get(7).getText()==""){
                    c15.setVisible(false);
                }
                
                JCheckBox c16 = new JCheckBox("");
                c16.setVisible(true);
                if(labels.get(8).getText()==""){
                    c16.setVisible(false);
                }
                
                JCheckBox c17 = new JCheckBox("");
                c17.setVisible(true);
                if(labels.get(9).getText()==""){
                    c17.setVisible(false);
                }
                
                
                

                */
            

                save.addActionListener(new ActionListener()
                		{
                        public void actionPerformed (ActionEvent e) {
                        	new Save(shoppingList, file);	
                        }}
                		);
                load.addActionListener(new ActionListener()
                		{
                	public void actionPerformed (ActionEvent e) {
                        try {
                            loadList();
                            System.out.println(shoppingList);
                            

                            if (shoppingList.size() == 1)
                            	c05.setText(shoppingList.get(0));
                            else if (shoppingList.size() == 2)
                            {
                            	c05.setText(shoppingList.get(0));
                            	c06.setText(shoppingList.get(1));
                            }
                            else if (shoppingList.size() == 3)
                            {
                            	c05.setText(shoppingList.get(0));
                            	c06.setText(shoppingList.get(1));
                            	c07.setText(shoppingList.get(2));
                            }
                            else if (shoppingList.size() == 4)
                            {
                            	c05.setText(shoppingList.get(0));
                            	c06.setText(shoppingList.get(1));
                            	c07.setText(shoppingList.get(2));
                            	c08.setText(shoppingList.get(3));
                            }
                            else if (shoppingList.size() == 5)
                            {
                            	c05.setText(shoppingList.get(0));
                            	c06.setText(shoppingList.get(1));
                            	c07.setText(shoppingList.get(2));
                            	c08.setText(shoppingList.get(3));
                            	c09.setText(shoppingList.get(4));
                            }
                            else if (shoppingList.size() == 6)
                            {
                            	c05.setText(shoppingList.get(0));
                            	c06.setText(shoppingList.get(1));
                            	c07.setText(shoppingList.get(2));
                            	c08.setText(shoppingList.get(3));
                            	c09.setText(shoppingList.get(4));
                            	c010.setText(shoppingList.get(5));
                            }
                            else if (shoppingList.size() == 7)
                            {
                            	c05.setText(shoppingList.get(0));
                            	c06.setText(shoppingList.get(1));
                            	c07.setText(shoppingList.get(2));
                            	c08.setText(shoppingList.get(3));
                            	c09.setText(shoppingList.get(4));
                            	c010.setText(shoppingList.get(5));
                            	c011.setText(shoppingList.get(6));
                            }
                            
                            labels.clear();
                            //c011.setText(newitem.getText());
                            if(c05.getText()!=""){
                                c05.setVisible(true);
                            }
                            if(c011.getText()!=""){
                                c011.setVisible(true);
                            }
                            if(c06.getText()!=""){
                                c06.setVisible(true);
                            }
                            if(c07.getText()!=""){
                                c07.setVisible(true);
                            }
                            if(c08.getText()!=""){
                                c08.setVisible(true);
                            }
                            if(c09.getText()!=""){
                                c09.setVisible(true);
                            }
                            if(c010.getText()!=""){
                                c010.setVisible(true);
                            }
                            labels.add(c05);
                            labels.add(c06);
                            labels.add(c07);
                            labels.add(c08);
                            labels.add(c09);
                            labels.add(c010);
                            labels.add(c011);
                            
                            frame.repaint();
                            
                            } catch (FileNotFoundException ex)
                        {
                            ex.printStackTrace();
                        }
                	}
                		}
                );
                done.addActionListener(new ActionListener()
                		{
                	public void actionPerformed(ActionEvent e)
                	{
                	    frame.dispose();
                	}
                		}
                		);
                                
                
                layout.setHorizontalGroup(
                        layout.createSequentialGroup()
                    
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            
                                .addComponent(del1)
                                .addComponent(del2)
                                .addComponent(del3)
                                .addComponent(del4)
                                .addComponent(del5)
                                .addComponent(del6)
                                .addComponent(del7)
                                )
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(c1, 75,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    
                                    .addComponent(labels.get(0))
                                    .addComponent(labels.get(1))
                                    .addComponent(labels.get(2))
                                    .addComponent(labels.get(3))
                                    .addComponent(labels.get(4))
                                    .addComponent(labels.get(5))
                                    .addComponent(labels.get(6))
                                    //.addComponent(labels.get(7))
                                    /*.addComponent(labels.get(8))
                                    .addComponent(labels.get(9))
                                    .addComponent(labels.get(10))
                                    .addComponent(labels.get(11))
                                    .addComponent(labels.get(12))
                                    .addComponent(labels.get(13))
                                    .addComponent(labels.get(14))
                                    .addComponent(labels.get(15))
                                    */

                                    .addComponent(checkOut)
                                    .addComponent(save)
                                    .addComponent(load)
                                    
                                    )
                        
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)         
                                    .addComponent(c2,50,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labels2.get(0))
                                    .addComponent(labels2.get(1))
                                    .addComponent(labels2.get(2))
                                    .addComponent(labels2.get(3))
                                    .addComponent(labels2.get(4))
                                    .addComponent(labels2.get(5))
                                    .addComponent(labels2.get(6))
                                    /*.addComponent(labels2.get(7))
                                    .addComponent(labels2.get(8))
                                    .addComponent(labels2.get(9))
                                    .addComponent(labels2.get(10))
                                    .addComponent(labels2.get(11))
                                    .addComponent(labels2.get(12))
                                    .addComponent(labels2.get(13))
                                    .addComponent(labels2.get(14))
                                    .addComponent(labels2.get(15))
                                    */
                                    .addComponent(add)
                                    .addComponent(newitem)
                                    .addComponent(newqty)
                                    .addComponent(clear)
                                    

                                    )
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(c3,80,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(c4)
                                    .addComponent(c8)
                                    .addComponent(c9)
                                    .addComponent(c10)
                                    .addComponent(c11)
                                    .addComponent(c12)
                                    .addComponent(c13)
                                    .addComponent(c14)
                                    //.addComponent(c15)
                                    //.addComponent(c16)
                                    .addComponent(done)
                                    )
                            
                            
                        );
                
                layout.setVerticalGroup(
                        layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(c1)
                                    .addComponent(c2)
                                    .addComponent(c3))
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    )
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(labels.get(0))
                                    .addComponent(labels2.get(0))
                                    .addComponent(c8)
                                    .addComponent(del1))
                                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                    .addComponent(labels.get(1))
                                                    .addComponent(labels2.get(1))
                                                    .addComponent(c9)
                                                    .addComponent(del2))
                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(labels.get(2))
                                                            .addComponent(labels2.get(2))
                                                            .addComponent(c10)
                                                            .addComponent(del3))
                                                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                    .addComponent(labels.get(3))
                                                                    .addComponent(labels2.get(3))
                                                                    .addComponent(c11)
                                                                    .addComponent(del4))
                                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                            .addComponent(labels.get(4))
                                                                            .addComponent(labels2.get(4))
                                                                            .addComponent(c12)
                                                                            .addComponent(del5))
                                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                            .addComponent(labels.get(5))
                                                                            .addComponent(labels2.get(5))
                                                                            .addComponent(c13)
                                                                            .addComponent(del6))
                                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                            .addComponent(labels.get(6))
                                                                            .addComponent(labels2.get(6))
                                                                            .addComponent(c14)
                                                                            .addComponent(del7))
                                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        //  .addComponent(labels.get(7))
                                                                        //  .addComponent(labels2.get(7))
                                                                    //      .addComponent(c15)
                                                                            
                                                                        )
                                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                            //.addComponent(labels.get(8))
                                                                        //  .addComponent(labels2.get(8))
                                                                        //  .addComponent(c16)
                                                                            )
                                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                            //.addComponent(labels.get(9))
                                                                        //  .addComponent(labels2.get(9)))
                                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                            //.addComponent(labels.get(10))
                                                                        //  .addComponent(labels2.get(10))
                                                                            )
                                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                            //.addComponent(labels.get(11))
                                                                        //  .addComponent(labels2.get(11))
                                                                            )
                                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        //  .addComponent(labels.get(12))
                                                                            //.addComponent(labels2.get(12))
                                                                            )
                                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                            //.addComponent(labels.get(13))
                                                                            //.addComponent(labels2.get(13))
                                                                            )
                                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                            //.addComponent(labels.get(14))
                                                                            //.addComponent(labels2.get(14)
                                                                            )
)
                                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        //  .addComponent(labels.get(15))
                                                                            //.addComponent(labels2.get(15))
                                                                            .addComponent(add))
                                                                                    
                            
                            
                            
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(c4)
                            
                            .addComponent(newitem)
                            .addComponent(newqty)
                    
                            .addComponent(checkOut)
                        
                            )
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(save)
                                    .addComponent(clear)
                                    )
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(load)
                                    .addComponent(done)
                                    )
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, windowssize, windowssize)
                            );
                
                frame.pack();
                frame.setVisible(true);
                
                //contentPane.add(c2);
    }
    
    public void loadList() throws FileNotFoundException {
        try {
            new Load(file, shoppingList);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
    }
}