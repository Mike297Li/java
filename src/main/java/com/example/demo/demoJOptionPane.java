package main.java.com.example.demo;

import javax.swing.*;

public class demoJOptionPane {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "This is an information dialog.", "Information", JOptionPane.INFORMATION_MESSAGE);

        // Display an input dialog and capture the user's input
        String userInput = JOptionPane.showInputDialog("Enter your name:");
        if (userInput != null) {
            JOptionPane.showMessageDialog(null, "Hello, " + userInput + "!", "Greetings", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No name entered.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }