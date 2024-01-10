package main.java.com.example.demo.neetcode;

import java.util.Set;
import java.util.TreeSet;

public class MorseCode {

//    Input: words = ["gin","zen","gig","msg"]
//    Output: 2
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set=new TreeSet<>();
        String[] morseCodes={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0;i<words.length;i++) {
            StringBuilder sb = new StringBuilder();
            // "gin"
            String word = words[i];
            for(int j=0;j<word.length();j++){
                //'g'
                char c = word.charAt(j);
                String morseCode=morseCodes[c-'a'];
                sb.append(morseCode);
            }
            set.add(sb.toString());
        }
        return set.size();
    }

}
