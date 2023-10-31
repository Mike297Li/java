package main.java.com.example.demo;

public class PassVal {
    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;

        foo(aDog);
        // when foo(...) returns, the name of the dog has been changed to "Fifi"
        System.out.println(aDog.getName().equals("Fifi"));
        // but it is still the same dog:
        System.out.println(aDog == oldDog);
    }

    public static void foo(Dog d) {
        d.getName().equals("Max"); // true
        // this changes the name of d to be "Fifi"
        d.setName("Fifi");
    }


//    public static void main(String[] args) {
//        Dog aDog = new Dog("Max");
//        Dog oldDog = aDog;
//
//        // we pass the object to foo
//        foo(aDog);
//        // aDog variable is still pointing to the "Max" dog when foo(...) returns
//       ; // true
//        System.out.println(aDog.getName().equals("Max"));
//       ; // false
//        System.out.println( aDog.getName().equals("Fifi"));
//        System.out.println(aDog == oldDog);
//    }
//
//    public static void foo(Dog d) {
//        // change d inside of foo() to point to a new Dog instance "Fifi"
//        d = new Dog("Fifi");
//
//    }
}
