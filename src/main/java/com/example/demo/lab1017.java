package main.java.com.example.demo;

import java.util.Scanner;

public class lab1017 {
    public static void main(String[] args) {
        int[] array=new int[20];
        for(int i=0;i<array.length;i++){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please input a number");
            array[i]=scanner.nextInt();
        }
        int evenNUm=0;
        int oddNum=0;
        int multipleFour=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                evenNUm++;
            }
            if(array[i]%2==1){
                oddNum++;
            }
            if(array[i]%4==0){
                multipleFour++;
            }
        }
        System.out.println("even number is "+evenNUm+" odd number is "+oddNum+" multiple of 4 is "+multipleFour);
    }

}
