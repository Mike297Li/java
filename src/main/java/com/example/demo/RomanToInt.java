package main.java.com.example.demo;

import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

import static java.util.Spliterators.iterator;

public class RomanToInt {
    public static int romanToInt(String input) {
        int result=0;
        Map<String,Integer> map=new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        for(int i=0;i<input.length();i++){
                Integer first = map.get(String.valueOf(input.charAt(i)));
                if(i+1>=input.length()){
                    result+=first;
                    break;
                }
                Integer second = map.get(String.valueOf(input.charAt(i+1)));
                if(first>second){
                    result+=first;
                }else if(first==second){
                    result=result+first;
                }else {
                    result+=second-first;
                    i++;
                }
        }
        return result;
    }


    public static void main(String[] args) {
        String input= "III";
        System.out.println(romanToInt(input));
        String a=new String("12345");
        String b=new String("12345");
        System.out.println(a==b);

    }
}
