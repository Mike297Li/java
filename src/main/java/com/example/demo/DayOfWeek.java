package main.java.com.example.demo;

import java.util.HashMap;

public class DayOfWeek {
    public static void main(String[] args) {

        System.out.println(solution("Wed",8));

    }
    // S="Wed" K=2 return "Fri"
    public static String solution(String S, int K) {
        // Implement your solution here
        HashMap<String,Integer> map=new HashMap();
        map.put("Mon",1);
        map.put("Tue",2);
        map.put("Wed",3);
        map.put("Thu",4);
        map.put("Fri",5);
        map.put("Sat",6);
        map.put("Sun",7);
        int k=K%7;
        Integer dayNum =  map.get(S);
        int dayPlus = (dayNum + k)%7;
        for(String key:map.keySet()){
            if(map.get(key)-dayPlus==0){
                return key;
            }
        }
        return null;
    }
}
