package main.java.com.example.demo;

import javax.swing.*;
import java.util.Scanner;

public class demoScanner {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.println("Hello, " + name);
//
//        System.out.print("Enter an integer: ");
//        int num = scanner.nextInt();
//        System.out.println("You entered: " + num);
       double[]  grades={44,55,66,77,88};
        System.out.println(grades.length);
        char x = 100;
        char y = 'd';
        System.out.println(x==y);
        // Display a dialog box to prompt the user for input
        String input = JOptionPane.showInputDialog(null, "Enter a string");

        // Check if the user provided input
        if (input != null) {
            // Display the input using another dialog box
            JOptionPane.showMessageDialog(null, "You entered: " + input);
        } else {
            // The user clicked "Cancel" or closed the dialog
            JOptionPane.showMessageDialog(null, "No input provided.");
        }
        int[] numbers={1,2,3};


    }

    }

