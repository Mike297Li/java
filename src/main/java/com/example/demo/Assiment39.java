package main.java.com.example.demo;
public class Assiment39 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print decreasing numbers from i to 1
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            // Print increasing numbers from 2 to i
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            // Move the next line after printing the row
            System.out.println();
        }
    }
}
