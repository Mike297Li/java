package main.java.com.example.demo;

import java.util.Scanner;

public class assignment61 {

    public static void main(String[] args) {
        int amount;
        double balance;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the amount: ");
        amount = input.nextInt();
        System.out.println("Enter the Total Balance: ");
        balance = input.nextDouble();
        //reduce amount+fee from balance
        balance=balance-(amount + 0.50);
        //print new balance
        System.out.print("Left Balance is: "+balance);
        input.close();
    }

}
