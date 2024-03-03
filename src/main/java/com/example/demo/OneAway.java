package main.java.com.example.demo;

public class OneAway {
    public static void main(String[] args) {
       // insert/remove/replace a character
       // pale--ple pal ale
       // pales--pale
       // pale--bale
        //pale---psale
        System.out.println(check("pale","bbale"));

    }
    // function to check one edit or zero edits
    public static Boolean check(String s1,String s2){
        if(s1.equals(s2)){
            return true;
        }
        int count=0;
        // remove--
        if(s1.length()- s2.length()==1){
            count= extracted(s1, s2, count);
            if(count==0){
                return true;
            }
        }
        // insert
        if(s2.length()- s1.length()==1){
            count= extracted(s2, s1, count);
            if(count==0){
                return true;
            }
        }
        // replace pale--pwle  same length
        if(s1.length()==s2.length()){
            char[] array = s2.toCharArray();
            for(char i: array){
                if(s1.indexOf(i)<0){
                    count++;
                }
            }
            if(count==1){
                return true;
            }
        }
        return false;
    }

    private static int extracted(String s1, String s2, int count) {
            char[] array = s2.toCharArray();
            for(char i: array){
                if(s1.indexOf(i)<0){
                    count++;
                }
            }
        return count;
    }


}
