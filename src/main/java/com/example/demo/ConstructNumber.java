package main.java.com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ConstructNumber {
    /*Allowed time limit:4 secs*/

   /* 987654
            3
            456789
            4
            04*/
    public static void main(String[] args) {

        String str="064819848398";
        List<String> arr=new ArrayList<>();
        arr.add("088");
        arr.add("364");
        arr.add("307");
//        String str="111222333444";
//        List<String> arr=new ArrayList<>();
//        arr.add("121");
//        arr.add("3");
//        arr.add("12345");
//        arr.add("11234");
        /*4,7,-1,10*/
        List<Integer> integers = countMinimumCharacters(str, arr);
        System.out.println(integers);


    }
    public static List<Integer> countMinimumCharacters(String str,List<String> arr){
        // Record the start time
        long startTime = System.nanoTime();
        // Write your code here
        List<Integer> list = new ArrayList<>();
        char[] charStr = str.toCharArray();
        List<String> charList =new ArrayList<>();
        List<String> charListOriginal =new ArrayList<>();
        for(int i = 0; i < charStr.length; i++){
            charList.add(String.valueOf(charStr[i]));
            charListOriginal.add(String.valueOf(charStr[i]));
        }

        for (int i = 0; i < arr.size(); i++) {
            String element = arr.get(i);
            charList.clear();
            charList.addAll(charListOriginal);
            char[] charArray = element.toCharArray();
            int count=0;
            int maxIndex = 0;
            for (int j = 0; j < charArray.length; j++) {
                String sonElement = String.valueOf(charArray[j]);
                if (charList.contains(sonElement)) {
                    // 重复的还要取出来后面的
                    int index = charList.indexOf(sonElement)+1+count;
                    if (index > maxIndex) {
                        maxIndex = index;
                        charList.remove(sonElement);
                        count++;
                    }
                } else {
                    maxIndex = -1;
                    break;
                }
            }
            list.add(maxIndex);
        } // Record the end time
        long endTime = System.nanoTime();

        // Calculate the runtime in milliseconds
        long runtimeInMillis = (endTime - startTime) / 1000000;

        System.out.println("Runtime: " + runtimeInMillis + " milliseconds");
        return list;
    }
}
