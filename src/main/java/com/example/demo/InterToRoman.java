package main.java.com.example.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class InterToRoman {
    public static String interToRoman(Integer input) {
        StringBuilder roman=new StringBuilder();
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("M",1000);
        map.put("CM",900);
        map.put("D",500);
        map.put("CD",400);
        map.put("C",100);
        map.put("XC",90);
        map.put("L",50);
        map.put("XL",40);
        map.put("X",10);
        map.put("IX",9);
        map.put("V",5);
        map.put("IV",4);
        map.put("I",1);
        for(String key: map.keySet()){
            int count=0;
            count=input/map.get(key);
           while (count>0){
               roman.append(key);
               count--;
               input=input-map.get(key);
            }
        }
       return roman.toString();
    }

    public static void main(String[] args) {
        System.out.println(interToRoman(1999));
    }

}
