package main.java.com.example.demo;
public class Assiment34 {
    public static void main(String[] args) {
        // use loop to select
        for (int i = 1; i <= 500; i++) {
            if (isArmstrongNumberOrNot(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * the method use to judge is ArmstrongNumber Or Not
     * */
    private static Boolean isArmstrongNumberOrNot(int number) {
        String str = number + "";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String s = String.valueOf(c);
            Integer num = Integer.valueOf(s);
            sum = sum + num * num * num;
        }
        if (number - sum == 0) {
            return true;
        }
        return false;
    }
}
