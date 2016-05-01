package ShoppingList;

import java.awt.Color;

import javax.swing.*;

@SuppressWarnings("serial")
public class Overview extends JFrame {
    
    private int pMIN = 0;
    private int pMAX = 100;
    private JProgressBar firstProgressBar;
    private JProgressBar secondProgressBar;
    private JProgressBar thirdProgressBar;
    private JProgressBar fourthProgressBar;
    private JLabel neccesaryLabel;
    private JLabel unneccesaryLabel;
    private JLabel plannedLabel;
    private JLabel unplannedLabel;

    
    public Overview() {
        
        //Set up the main window frame
        setTitle("Overview");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(200, 400);
        
        //Initialize the components
        firstProgressBar  = new JProgressBar(pMIN, pMAX);
        secondProgressBar = new JProgressBar(pMIN, pMAX);
        thirdProgressBar  = new JProgressBar(pMIN, pMAX);
        fourthProgressBar = new JProgressBar(pMIN, pMAX);
        neccesaryLabel    = new JLabel("Neccesary");
        unneccesaryLabel  = new JLabel("Unneccesary");
        plannedLabel      = new JLabel("Planned");
        unplannedLabel    = new JLabel("Unplanned");
        
        //Set up the layout of the components
        GroupLayout layout = new GroupLayout(getContentPane());
        Color rbgcolor = new Color(25,125,175);
        getContentPane().setLayout(layout);
        getContentPane().setBackground(rbgcolor);
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);
        firstProgressBar.setStringPainted(true);
        secondProgressBar.setStringPainted(true);
        thirdProgressBar.setStringPainted(true);
        fourthProgressBar.setStringPainted(true);
        
        firstProgressBar.setValue(58);
        secondProgressBar.setValue(32);
        thirdProgressBar.setValue(73);
        fourthProgressBar.setValue(27);
        
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                    .addGroup(
                            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(firstProgressBar)
                                .addComponent(secondProgressBar)
                                .addComponent(thirdProgressBar)
                                .addComponent(fourthProgressBar))
                    .addGroup(
                            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(neccesaryLabel)
                            .addComponent(unneccesaryLabel)
                            .addComponent(plannedLabel)
                            .addComponent(unplannedLabel))
                    );
        
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                    .addGroup(
                            layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(firstProgressBar)
                            .addComponent(neccesaryLabel))
                    .addGroup(
                            layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(secondProgressBar)
                            .addComponent(unneccesaryLabel))
                    .addGroup(
                            layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(thirdProgressBar)
                            .addComponent(plannedLabel))
                    .addGroup(
                            layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(fourthProgressBar)
                            .addComponent(unplannedLabel))
                            );
        
        pack();
        setVisible(true);

    }
}