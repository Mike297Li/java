package main.java.com.example.demo;

import java.util.Scanner;

public class Assiment31 {
    public static void main(String[] args) {
        // prompt
        System.out.println("Please enter a positive number");
        Scanner scanner=new Scanner(System.in);
        int nextInt = scanner.nextInt();
       /* use for loop to print
          1*n=
          2*n=
          3*n=
       * */
        for(int i=1;i<10;i++){
            System.out.println(i+"*"+nextInt+"="+i*nextInt);
        }
    }


}
