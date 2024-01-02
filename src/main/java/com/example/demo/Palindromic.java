package main.java.com.example.demo;

import java.util.*;

public class Palindromic {

   /* example:
   * s="acdapmpomp"
   * same order in s
   * max length Palindromic
   * pmpmp=5
   * ada/aca=3
   * max=5*3
   * */
   static List<String> al = new ArrayList<>();
    public static void main(String[] args) {
        String str="acdapmpomp";
        // Palindromic subsequence [a,d,p,m,o,aa,aca,pmp,ada,mom,pmpmp]
        findsubsequences(str, "");
        Iterator iterator=al.iterator();
        while (iterator.hasNext()){
            String next = (String) iterator.next();
            if(!isPalindrome(next)){
                iterator.remove();
            }
        }
        System.out.println(al);
        Set<Integer> len = new HashSet<>();
        for(int i=0;i<al.size();i++){
            len.add(al.get(i).length());
        }
        System.out.println(len);



    }


    private static List generateSub(String str) {
         str="acdapmpomp"; // 10 char
         List subsequence=new ArrayList();
        // Palindromic subsequence [a,d,p,m,o,aa,aca,pmp,ada,mom,pmpmp]
        // how to find all Palindromic subsequence
        // Palindromic subsequence is a part of subsequence
        // can i find all subsequence then try to judge is Palindromic or not
        //
        findsubsequences(str, ""); // Calling a function
        System.out.println(al);
        char[] charArray = str.toCharArray();
        for(int i=0;i<al.size();i++){

        }

        return new ArrayList();
    }

    public static boolean isPalindrome(String input) {
        StringBuilder sb=new StringBuilder();
        sb.append(input);
        String stringInput = sb.toString();
        String reverse = sb.reverse().toString();
        if (reverse.equals(stringInput)){
            return true;
        }
        return false;
    }
    private static void findsubsequences(String s,
                                         String ans)
    {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }
        // We add adding 1st character in string
        findsubsequences(s.substring(1), ans + s.charAt(0));

        // Not adding first character of the string
        // because the concept of subsequence either
        // character will present or not
        findsubsequences(s.substring(1), ans);
    }
}
