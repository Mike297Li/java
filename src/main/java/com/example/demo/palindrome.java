package main.java.com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class palindrome {
    public  static Boolean isPalindrome(Integer input){
        if (input<0){
            return false;
        }
        int originalInput=input;
        String inputString = input.toString();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<inputString.length();i++){
            Integer pow = new Double(Math.pow(10, inputString.length() - (i+1))).intValue();
            int v = input / pow;
            list.add(v);
            input=input-pow*v;
        }

        int palindrome=0;
        for(int i=0;i<inputString.length();i++){
            Integer pow = new Double(Math.pow(10, inputString.length() - (i+1))).intValue();
            palindrome+=list.get(inputString.length()-(i+1))*pow;
        }

        return palindrome-originalInput==0;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-10));
    }
}
