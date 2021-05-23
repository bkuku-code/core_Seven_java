package com.bkuku;
import javax.swing.JOptionPane;


public class GUI {
    public static void main(String[] args){
        String name =JOptionPane.showInputDialog("What is your name", "Bkuku");

        String message =
                String.format("welcome,%s, to America" , "Kuku");

        JOptionPane.showMessageDialog(null, "Welcome to America");
    }


}
