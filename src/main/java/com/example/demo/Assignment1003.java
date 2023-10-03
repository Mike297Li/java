package main.java.com.example.demo;

import java.util.Scanner;

public class Assignment1003 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // receive basicSalary from user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input basicSalary");
            double basicSalary = scanner.nextDouble();
            double grossSalary = (0.35 + 0.05 + 1) * basicSalary;
            double netSalary = grossSalary * (1 - 0.13);
            // call method
            String position = postionMethod(netSalary);
            System.out.println("position is ====" + position);
        }
    }

    /**
     * to judge the position method,receive netSalary as parameter
     */
    private static String postionMethod(double netSalary) {
        if (netSalary >= 150000) {
            return "Project manager";
        } else if (netSalary >= 100000) {
            return "Team Lead";
        } else if (netSalary >= 60000) {
            return "Developer";
        } else {
            return "trainee";
        }
    }
}
