package main.java.com.example.demo;

import java.math.BigDecimal;
import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the sale's amount");
        String amount=obj.nextLine();
        BigDecimal amountDecimal=BigDecimal.valueOf(Long.parseLong(amount));
        // rounded to hundredth
        System.out.println("Sales tax amount is $"
                +amountDecimal.multiply(BigDecimal.valueOf(0.13)).setScale(2, BigDecimal.ROUND_UP));

    }

}
