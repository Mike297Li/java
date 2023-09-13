package main.java.com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class findLongestSubString2 {
        public static int lengthOfLongestSubstring(String input) {
            Map<Character,Integer> map=new HashMap<>();
            int size=0;
            int length = input.length();

            for(int i=0,j=0;j<length;j++){
                if(map.containsKey(input.charAt(j))){
                    i=Math.max(i,map.get(input.charAt(j)));
                }
                size=Math.max(size,j-i+1);
                map.put(input.charAt(j),j+1);
            }
                return size;
        }


        public static void main(String args[]) {
            // Your code goes here
            String s = "Helwkeblo";
            System.out.println(lengthOfLongestSubstring(s));
        }

}
