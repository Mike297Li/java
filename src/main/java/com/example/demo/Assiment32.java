package main.java.com.example.demo;

import java.util.Scanner;

public class Assiment32 {
    public static void main(String[] args) {
        // prompt
        System.out.println("Please enter an integer");
        Scanner scanner=new Scanner(System.in);
        int nextInt = scanner.nextInt();
        String str=nextInt+"";
       /* use for loop to print
       * */
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }


}
