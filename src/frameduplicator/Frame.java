package frameduplicator;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mrjaffesclass.apcs.messenger.*;
import java.util.ArrayList;
import java.awt.Dimension;
import java.awt.Toolkit;
/**
 *
 * @author drewa
 */
public class Frame extends javax.swing.JFrame implements MessageHandler {
    //variables
    private final Messenger mvcMessaging;
    
    //JFrame components
    javax.swing.JButton duplicateBtn;
    
    public Frame(Messenger messenger) {
        this.mvcMessaging = messenger;
        this.initComponents();
    }
    
    public void duplicate(java.awt.event.ActionEvent evt) {
        for (int i = 0; i < 2; i++) {
            Frame newFrame = new Frame(this.mvcMessaging);
            newFrame.setVisible(true);
        }
        this.setVisible(false);
        this.dispose();
    }
    
    private void initComponents() {
        this.duplicateBtn = new javax.swing.JButton("Duplicate");
        this.duplicateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duplicate(evt);
            }
        });
        this.add(duplicateBtn);
        
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//causes entire program to exit when X is clicked on any one of the frames
        this.setMaximumSize(new java.awt.Dimension(200, 200));
        this.setMinimumSize(new java.awt.Dimension(200, 200));
        this.setResizable(false);
        this.pack();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((int)(Math.random()*(dim.width-this.getSize().width)), (int)(Math.random()*(dim.height-this.getSize().height)));
    }
    
    @Override
    public void messageHandler(String messageName, Object messagePayload) {
        
    }
}
