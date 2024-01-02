package main.java.com.example.demo;

public class Employee {
    private String name;
    private double salary;
    public double getSalary() {
        return salary;
    }
    /**
     *  default constructor
     */
    public Employee() {
        this.name = " ";
        this.salary = 45000;
    }
    /**
     *  parameterized constructor
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    /**
     * takes a percentage value as a parameter and reduces the salary of the Employee object by that percentage
     * @param byPercent
     */
    public void paycut(double byPercent){
        this.salary=salary*(1-byPercent/100);
    }

}
