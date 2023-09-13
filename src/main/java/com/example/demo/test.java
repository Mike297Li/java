package main.java.com.example.demo;

public class test {

    public static void main(String[] args) {
        int a=9;
        change(a);
        System.out.println(change(a));
    }

    private static int change(int a) {
        a=a+1;
        return a;
    }
}
