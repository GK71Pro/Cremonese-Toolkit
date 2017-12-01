package com.gkaraffa.ctk.control;

import java.awt.EventQueue;

import com.gkaraffa.ctk.view.MasterFrame;

public class Main {

  public Main() {
    // TODO Auto-generated constructor stub
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
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

}
