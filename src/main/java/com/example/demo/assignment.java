package main.java.com.example.demo;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the employee's full name");
        String fullName=obj.nextLine();
        System.out.println("Enter the employee's id");
        String id=obj.nextLine();
        System.out.println("Enter the employee's monthly salary");
        String salary=obj.nextLine();
        System.out.println("the employee's full name is "+fullName+
                ", employee's id is "+id+", and employee's monthly salary is $" +salary);

    }

}
