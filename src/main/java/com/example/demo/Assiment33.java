package main.java.com.example.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Assiment33 {
    public static void main(String[] args) {
        // prompt
        System.out.println("Please enter the number you want to print:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < number; i++) {
            System.out.println("Please enter an number");
            scanner = new Scanner(System.in);
            list.add(scanner.nextInt());
        }
        //initiate variables
        int countPositive = 0;
        int countNegtive = 0;
        int countZero = 0;
        // use loop to count
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                countPositive++;
            } else if (list.get(i) < 0) {
                countNegtive++;
            } else {
                countZero++;
            }
        }
        // output
        System.out.println("The count of positive number is " + countPositive);
        System.out.println("The count of negtive number is " + countNegtive);
        System.out.println("The count of zero number is " + countZero);
    }


}
