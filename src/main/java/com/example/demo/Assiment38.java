package main.java.com.example.demo;
public class Assiment38 {
    public static void main(String[] args) {
        // use loop
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print * for the current row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(i);
            }
            // next line
            System.out.println();
        }
    }
}
