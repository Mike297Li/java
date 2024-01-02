package main.java.com.example.demo;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public Student(String name) {
        this.name = name!=null ? name: "Unknown";
    }


}
