package main.java.com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class palindrome2 {
    public  static Boolean isPalindrome(Integer input){
        StringBuilder sb=new StringBuilder();
        sb.append(input);
        String stringInput = sb.toString();
        String reverse = sb.reverse().toString();
        if (reverse.equals(stringInput)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12121));
        String a="123";
        String b=new String("123");
        System.out.println(a==b);
    }
}
