package com.gkaraffa.ctk.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class MasterFrame extends JFrame {

  /**
   * 
   */
  private static final long serialVersionUID = 1402347607879401036L;
  private JPanel contentPane;

  /**
   * Launch the application.
   
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          MasterFrame frame = new MasterFrame();
          frame.setVisible(true);
        }
        catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }
  */

  /**
   * Create the frame.
   */
  @SuppressWarnings("rawtypes")
  public MasterFrame() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 675);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JComboBox comboBox = new JComboBox();
    comboBox.setBounds(106, 27, 104, 27);
    contentPane.add(comboBox);
    
    JComboBox comboBox_1 = new JComboBox();
    comboBox_1.setBounds(301, 27, 117, 27);
    contentPane.add(comboBox_1);
    
    JLabel lblNewLabel = new JLabel("New label");
    lblNewLabel.setBounds(33, 31, 61, 16);
    contentPane.add(lblNewLabel);
    
    JLabel lblNewLabel_1 = new JLabel("New label");
    lblNewLabel_1.setBounds(228, 31, 61, 16);
    contentPane.add(lblNewLabel_1);
    
    JTextArea textArea = new JTextArea();
    textArea.setBounds(33, 83, 385, 493);
    contentPane.add(textArea);
  }
}
