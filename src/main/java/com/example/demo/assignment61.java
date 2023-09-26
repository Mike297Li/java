package main.java.com.example.demo;

import java.util.Scanner;

public class assignment61 {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the person's age");
        String age=obj.nextLine();
        System.out.println("Enter the location of the person");
        String location=obj.nextLine();
        double price=40;
        if(Integer.parseInt(age) >= 65){
            price=40*0.5;
        }else if(Integer.parseInt(age)<5){
            price=0;
        }
        if(location.equals("Warren Country")){
            price=30;
        }
        if(location.equals("Warren Country") && Integer.parseInt(age) >= 65){
            price=30*0.5;
        }
        System.out.println("The price of the person is " + price);
    }

}
