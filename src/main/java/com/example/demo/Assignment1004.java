package main.java.com.example.demo;

import java.math.BigDecimal;
import java.util.Scanner;

public class Assignment1004 {
    public static void main(String[] args) {
        // receive n from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input n");
        int n = scanner.nextInt();
        double count = 0.0;
        // use for loop to calculate
        for (int i = 1; i <= n; i++) {
            count += 1.0 / i;
        }
        System.out.println("1+1/2+1/3+......+1/" + n + "=" + count);
    }
}
