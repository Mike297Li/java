package main.java.com.example.demo.neetcode;

import java.util.*;

public class GroupAnagram {

//    Input: strs = ["eat","tea","tan","ate","nat","bat"]
//    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};

        for(int i=0;i<strs.length;i++){
            for(int j=1;j<strs.length;j++){
                 if(isValidAnagram(strs[i],strs[j])){

                 }
            }
        }

        List<List<String>> lists = groupAnagrams(strs);
        System.out.println("===");

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static boolean isValidAnagram(String s1,String s2){
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        int[] arr=new int[26];
        for(int i=0;i<charArray1.length;i++){
            arr[charArray1[i]-'a']++;
        }
        for(int i=0;i<charArray2.length;i++){
            arr[charArray2[i]-'a']--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }


}
