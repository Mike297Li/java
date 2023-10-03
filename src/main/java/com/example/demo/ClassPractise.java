package main.java.com.example.demo;

import java.util.Random;
import java.util.Scanner;

public class ClassPractise {
    public static void main(String[] args) {
        // to generate random number
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        // to receive number from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        int guessNum = scanner.nextInt();
        while (guessNum != randomNum) {
            if (guessNum > randomNum) {
                System.out.println("Too high,try again");
            } else {
                System.out.println("Too low,try again");
            }
            // to receive number from user again
            Scanner scanner2 = new Scanner(System.in);
            guessNum = scanner2.nextInt();
        }
        if (randomNum == guessNum) {
            System.out.println("correct! lucky");
        }
    }


}
