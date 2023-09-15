package main.java.com.example.demo;

public class Identityhashcode {


    public static void main(String[] args) {
        Integer a=new Integer(2);
        Integer b=new Integer(2);
        System.out.println(a==b);
        System.out.println("Memory address of a: " + System.identityHashCode(a));
        System.out.println("Memory address of b: " + System.identityHashCode(b));

        System.out.println("hashcode of a: " + a.hashCode());
        System.out.println("hashcode  of b: " + b.hashCode());
    }
}
