package main.java.com.example.demo;

public class StringRotation {

    public static boolean isRotation(String s1, String s2) {
        // Check if lengths are equal and not empty
        if (s1.length() == s2.length() && s1.length() > 0) {
            String s1s1 = s1 + s1; // Concatenate s1 with itself
            return isSubstring(s1s1, s2); // Check if s2 is a substring of s1s1
        }
        return false;
    }

    // Mock implementation of isSubstring method
    public static boolean isSubstring(String s1, String s2) {
        // This is just a mock implementation for demonstration purposes
        // You can replace this with your actual implementation
        return s1.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        if (isRotation(s1, s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is not a rotation of " + s1);
        }
    }

}
