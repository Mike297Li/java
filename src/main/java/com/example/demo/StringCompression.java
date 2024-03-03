package main.java.com.example.demo;

import java.util.HashSet;
import java.util.Set;

public class StringCompression {

    // aabcccccaaa---a2b1c5a3
    // abc---abc
    public static String convert(String input) {
        char[] array = input.toCharArray();
        Set set=new HashSet();
        for(char str: array){
            set.add(str);
        }
        if(input.length()==set.size()){
            return input;
        }
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= input.length(); i++) {
            if (i == input.length() || input.charAt(i) != input.charAt(i - 1)) {
                result.append(input.charAt(i - 1));
                result.append(count);
                count = 1;
            } else {
                count++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abbbbbbcd";
        String encoded = convert(input);
        System.out.println(encoded); // Output: a2b1c5a3
    }
}
