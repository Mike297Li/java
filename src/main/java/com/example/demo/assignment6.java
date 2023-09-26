package main.java.com.example.demo;

import java.util.Scanner;

public class assignment6 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the person's age");
        String age=obj.nextLine();
        double price=30;
        if(Integer.parseInt(age) >= 65){
            price=30*0.5;
        }
        System.out.println("The price of the person is " + price);


    }

}
