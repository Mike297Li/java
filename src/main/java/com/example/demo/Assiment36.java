package main.java.com.example.demo;
public class Assiment36 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // Inner loop to print * in each row
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
}}
